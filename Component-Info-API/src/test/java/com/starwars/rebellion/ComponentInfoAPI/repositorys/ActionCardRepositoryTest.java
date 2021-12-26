package com.starwars.rebellion.ComponentInfoAPI.repositorys;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ActionCardRepositoryTest {

	@Autowired
	ActionCardRepository actionCardRepository;

	@Test
	void givenAllRebelActionCardDataIsAvailable_thenSixNonStartingCardsAreAvailable() {
		assertEquals(TOTAL_NON_STARTING_REBEL_ACTION_CARDS, actionCardRepository.findByIsStartingCardAndFaction(false, Faction.REBEL).size());
	}

	@Test
	void givenAllRebelActionCardDataIsAvailable_thenTwelveStartingCardsAreAvailable() {
		assertEquals(TOTAL_STARTING_REBEL_ACTION_CARDS, actionCardRepository.findByIsStartingCardAndFaction(true, Faction.REBEL).size());
	}

	@Test
	void givenAllRebelActionCardDataIsAvailable_thenEighteenCardsAreReturned() {
		assertEquals(TOTAL_REBEL_ACTION_CARDS, actionCardRepository.findByFaction(Faction.REBEL).size());
	}

	@Test
	void givenAllEmpireActionCardDataIsAvailable_thenFourNonStartingCardsAreAvailable() {
		assertEquals(TOTAL_NON_STARTING_EMPIRE_ACTION_CARDS, actionCardRepository.findByIsStartingCardAndFaction(false, Faction.IMPERIAL).size());
	}

	@Test
	void givenAllEmpireActionCardDataIsAvailable_thenTwelveStartingCardsAreAvailable() {
		assertEquals(TOTAL_STARTING_EMPIRE_ACTION_CARDS, actionCardRepository.findByIsStartingCardAndFaction(true, Faction.IMPERIAL).size());
	}

	@Test
	void givenAllEmpireActionCardDataIsAvailable_thenSixteenCardsAreReturned() {
		assertEquals(TOTAL_EMPIRE_ACTION_CARDS, actionCardRepository.findByFaction(Faction.IMPERIAL).size());
	}

	@Test
	void givenAllActionCardsAreAvailable_thenThirtyFourActionCardsAreReturned() {
		assertEquals(TOTAL_ACTION_CARDS, actionCardRepository.findAll().size());
	}
}
