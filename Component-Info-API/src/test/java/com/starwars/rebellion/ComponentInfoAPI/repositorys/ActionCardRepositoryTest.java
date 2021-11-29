package com.starwars.rebellion.ComponentInfoAPI.repositorys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ActionCardRepositoryTest {

	@Autowired
	ActionCardRepository actionCardRepository;

	@Test
	void givenAllRebelActionCardsDataIsAvailable_thenEightNonStartingCardsAreAvailable() {
		Assertions.assertEquals(6, actionCardRepository.findByIsStartingCard(false).size());
	}

	@Test
	void givenAllRebelActionCardsDataIsAvailable_thenTwelveStartingCardsAreAvailable() {
		Assertions.assertEquals(12, actionCardRepository.findByIsStartingCard(true).size());
	}
}
