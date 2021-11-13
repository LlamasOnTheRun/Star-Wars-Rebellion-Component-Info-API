package com.starwars.rebellion.ComponentInfoAPI.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ActionCardsControllerTest {

	@Autowired
	ActionCardController actionCardsController;

	@Test
	void givenUndercoverActionCardDataIsAvailable_ThenUndercoverNameIsReturned() {
		Assertions.assertEquals("Undercover", actionCardsController.getActionCard());
	}
}
