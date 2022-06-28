package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.request.ObjectiveCardRequest;
import com.starwars.rebellion.ComponentInfoAPI.specification.ObjectiveCardSpecification;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ObjectiveCardRepositoryTest {

	@Autowired
	ObjectiveCardRepository objectiveCardRepository;

	@Autowired
	ObjectiveCardSpecification objectiveCardSpecification;

	@Test
	void givenAllObjectiveCardDataIsPresent_thenFifteenDistinctEntriesAreReturned() {
		assertEquals(TOTAL_OBJECTIVE_CARDS, objectiveCardRepository.findAll().stream().distinct().count());
	}

	@Test
	void givenAllDeckLevelOneCardsAreAvailable_thenProperDataIsReturned() {
		ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
		objectiveCardRequest.setDeckLevelOne(true);

		assertEquals(TOTAL_LEVEL_ONE_OBJECTIVE_CARDS,
				objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest)).size());
	}

	@Test
	void givenAllDeckLevelTwoCardsAreAvailable_thenProperDataIsReturned() {
		ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
		objectiveCardRequest.setDeckLevelTwo(true);

		assertEquals(TOTAL_LEVEL_TWO_OBJECTIVE_CARDS,
				objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest)).size());
	}

	@Test
	void givenAllDeckLevelThreeCardsAreAvailable_thenProperDataIsReturned() {
		ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
		objectiveCardRequest.setDeckLevelThree(true);

		assertEquals(TOTAL_LEVEL_THREE_OBJECTIVE_CARDS,
				objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest)).size());
	}

	@Test
	void givenObjectiveCardRepoIsSetUp_thenInspireSympathyCardIsReturned() {
		ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
		objectiveCardRequest.setTitle(INSPIRE_SYMPATHY_OBJECTIVE_CARD_TITLE);

		assertEquals(INSPIRE_SYMPATHY_OBJECTIVE_CARD_TITLE,
				objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest))
						.get(0).getCardText().getTitle());
	}
}
