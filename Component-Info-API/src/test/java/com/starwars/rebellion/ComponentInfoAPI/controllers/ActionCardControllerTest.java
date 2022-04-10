package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Leader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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
	//TODO Complete test case. May need to add service layer with @transactional
	void givenActionCardReferBackToLeaderChoices_ThenRecursionShouldNotPropagateDueToLeadersReferencingBackToActionCards() {
		actionCardsController.getAllActionCards().forEach(actionCard -> {
			List<Leader> leaders = actionCard.getLeaderChoices();
			Assertions.assertNull(leaders.get(0).getInActionCards());
		});
	}
}
