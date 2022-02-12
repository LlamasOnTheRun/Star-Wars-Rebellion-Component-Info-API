package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.MissionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ObjectiveCardRepositoryTest {
	@Autowired
	ObjectiveCardRepository objectiveCardRepository;

	@Test
	@Disabled
	void givenAllObjectiveCardDataIsPresent_thenFifteenDistinctEntriesAreReturned() {
		assertEquals(TOTAL_OBJECTIVE_CARDS, objectiveCardRepository.findAll().stream().distinct().count());
	}

	@Test
	void givenObjectiveCardRepoIsSetUp_thenInspireSympathyCardIsReturned() {
		assertEquals("Inspire Sympathy", objectiveCardRepository.findByCardTextTitle("Inspire Sympathy").getCardText().getTitle());
	}
}
