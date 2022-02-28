package com.starwars.rebellion.ComponentInfoAPI.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_DISTINCT_OBJECTIVE_CARDS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ObjectiveCardRepositoryTest {
	@Autowired
	ObjectiveCardRepository objectiveCardRepository;

	@Test
	void givenAllObjectiveCardDataIsPresent_thenFifteenDistinctEntriesAreReturned() {
		assertEquals(TOTAL_DISTINCT_OBJECTIVE_CARDS, objectiveCardRepository.findAll().stream().distinct().count());
	}

	@Test
	void givenObjectiveCardRepoIsSetUp_thenInspireSympathyCardIsReturned() {
		assertEquals("Inspire Sympathy", objectiveCardRepository.findByCardTextTitle("Inspire Sympathy").getCardText().getTitle());
	}
}
