package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.ActionCardRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.io.StringWriter;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_ACTION_CARDS;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ActionCardControllerTest {

	@Autowired
	ActionCardController actionCardsController;

	@Test// TODO new plan, update to Integer or Boolean for entitys and request objects instead of int and boolean
	void givenInvalidIDIsProvidedInJsonRequest_thenExceptionIsThrown() throws Exception {

	}

	@Test
	@Transactional
	void givenStringIDIsProvidedInJsonRequest_thenThreeIDsAreReturnedForLeadersAndActionCards() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		ActionCardRequest actionCardRequest = objectMapper.readValue("{ \"id\": \"26\" }", ActionCardRequest.class);

		StringWriter writer = new StringWriter();
		objectMapper.writeValue(writer, actionCardsController.getActionCard(actionCardRequest));
		final String responseJson = writer.toString();

		assertEquals(3, StringUtils.countOccurrencesOf(responseJson, "\"id\":"));
		assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"id\":26"));
	}

	@Test
	@Transactional
	void givenIntIDIsProvidedInJsonRequest_thenThreeIDsAreReturnedForLeadersAndActionCards() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		ActionCardRequest actionCardRequest = objectMapper.readValue("{ \"id\": 26 }", ActionCardRequest.class);

		StringWriter writer = new StringWriter();
		objectMapper.writeValue(writer, actionCardsController.getActionCard(actionCardRequest));
		final String responseJson = writer.toString();

		assertEquals(3, StringUtils.countOccurrencesOf(responseJson, "\"id\":"));
		assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"id\":26"));
	}

	@Test
	void givenAllActionCardDataIsAvailable_ThenThirtyFourCardsShouldBeReturned() {
		Assertions.assertEquals(TOTAL_ACTION_CARDS, actionCardsController.getAllActionCards().size());
	}

	@Test
	@Transactional
	void givenActionCardReferBackToLeaderChoices_ThenRecursionShouldNotPropagateDueToLeadersReferencingBackToActionCards() throws Exception {
		StringWriter writer = new StringWriter();
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(writer, actionCardsController.getAllActionCards());
		final String responseJson = writer.toString();

		assertTrue(responseJson.contains("leaderChoices"));
		assertFalse(responseJson.contains("inActionCards"));
	}

	//TODO make a test scenerio where a invalid string is passed in json for faction
	@Test
	@Transactional
	void givenFactionIsInvalidType_thenExceptionIsThrown() {
	}
}