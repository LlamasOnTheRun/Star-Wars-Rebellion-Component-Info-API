package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ObjectiveCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.ObjectiveCardRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ObjectiveCardControllerTest {

	@Autowired
	ObjectiveCardController objectiveCardController;

	@Test
	@Transactional
	void givenIDIsProvided_thenReturnedDataIsAccurate() {
		ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
		objectiveCardRequest.setId(1);//TODO make to a valid id

		List<ObjectiveCard> objectiveCardList = objectiveCardController.getObjectiveCard(objectiveCardRequest);

		assertEquals(1, objectiveCardList.size());
		assertEquals("", objectiveCardList.get(0).getCardText().getTitle());
	}
}