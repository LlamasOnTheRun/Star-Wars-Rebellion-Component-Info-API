package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.MissionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MissionCardRepositoryTest {
	@Autowired
	MissionCardRepository missionCardRepository;

	@Test
	void givenForTheGreaterGoodDataIsAvailable_thenDataIsReturned() {
		assertEquals("For The\nGreater Good\n", missionCardRepository.findByCardTextTitle("For The\nGreater Good\n").getCardText().getTitle());
	}

	@Test
	void givenAllRebelMissionCardsAreAvailable_thenCountOfNonDistinctCardsMatches() {
		List<MissionCard> allRebelMissionCards = missionCardRepository.findAllByFaction(Faction.REBEL);
		assertEquals(TOTAL_REBEL_MISSION_CARDS, allRebelMissionCards.stream().mapToInt(MissionCard::getTotalInDeck).sum());
	}

	@Test
	void givenAllRebelMissionCardsAreAvailable_thenCountOfDistinctCardsMatches() {
		assertEquals(TOTAL_UNIQUE_REBEL_MISSION_CARDS, missionCardRepository.findAllByFaction(Faction.REBEL).size());
	}

	@Test
	void givenAllRebelMissionCardsAreAvailable_thenCountOfStartingCardsMatches() {
		assertEquals(TOTAL_STARTING_REBEL_MISSION_CARDS, missionCardRepository.findAllByIsStartingCard(true).size());
	}
}
