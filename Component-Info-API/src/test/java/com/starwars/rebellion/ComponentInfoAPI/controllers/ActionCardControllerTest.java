package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonassert.JsonAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.io.StringWriter;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_ACTION_CARDS;

@SpringBootTest
class ActionCardControllerTest {

	@Autowired
	ActionCardController actionCardsController;

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
		final String json = writer.toString();

		JsonAssert.with(json).assertNotDefined("items[0].leaderChoices[0].inActionCards");
	}
}
