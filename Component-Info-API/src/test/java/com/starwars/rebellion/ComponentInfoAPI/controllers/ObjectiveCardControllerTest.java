package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ObjectiveCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.ObjectiveCardRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ObjectiveCardControllerTest {

	@Autowired
	ObjectiveCardController objectiveCardController;

	@Test
	void givenBlankRequestIsProvided_thenReturnedDataIsAccurate() {
		ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();

		List<ObjectiveCard> objectiveCardList = objectiveCardController.getObjectiveCard(objectiveCardRequest);

		assertEquals(TOTAL_OBJECTIVE_CARDS, objectiveCardList.size());
	}

	@Test
	void givenIDIsProvided_thenReturnedDataIsAccurate() {
		ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
		objectiveCardRequest.setId(INSPIRE_SYMPATHY_OBJECTIVE_CARD_ID);

		List<ObjectiveCard> objectiveCardList = objectiveCardController.getObjectiveCard(objectiveCardRequest);

		assertEquals(1, objectiveCardList.size());
		assertEquals(INSPIRE_SYMPATHY_OBJECTIVE_CARD_TITLE, objectiveCardList.get(0).getCardText().getTitle());
	}

	@Test
	void givenTitleIsProvided_thenReturnedDataIsAccurate() {
		ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
		objectiveCardRequest.setTitle(INSPIRE_SYMPATHY_OBJECTIVE_CARD_TITLE);

		List<ObjectiveCard> objectiveCardList = objectiveCardController.getObjectiveCard(objectiveCardRequest);

		assertEquals(1, objectiveCardList.size());
		assertEquals(INSPIRE_SYMPATHY_OBJECTIVE_CARD_TITLE, objectiveCardList.get(0).getCardText().getTitle());
	}

	@Test
	void givenDeckLevelOneIsProvided_thenReturnedDataIsAccurate() {
		ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
		objectiveCardRequest.setDeckLevelOne(true);

		List<ObjectiveCard> objectiveCardList = objectiveCardController.getObjectiveCard(objectiveCardRequest);

		assertEquals(TOTAL_LEVEL_ONE_OBJECTIVE_CARDS, objectiveCardList.size());
	}

	@Test
	void givenDeckLevelTwoIsProvided_thenReturnedDataIsAccurate() {
		ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
		objectiveCardRequest.setDeckLevelTwo(true);

		List<ObjectiveCard> objectiveCardList = objectiveCardController.getObjectiveCard(objectiveCardRequest);

		assertEquals(0, objectiveCardList.size());
	}
}