package com.starwars.rebellion.ComponentInfoAPI.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_ACTION_CARDS;

@SpringBootTest
	class ActionCardControllerTest {

	@Autowired
	ActionCardController actionCardsController;

	@Test
	void givenUndercoverActionCardDataIsAvailable_ThenUndercoverNameIsReturned() {
		Assertions.assertEquals("Undercover", actionCardsController.getActionCard());
	}

	@Test
	void givenAllActionCardDataIsAvailable_ThenThirtyFourCardsShouldBeReturned() {
		Assertions.assertEquals(TOTAL_ACTION_CARDS, actionCardsController.getAllActionCards().size());
	}
}
