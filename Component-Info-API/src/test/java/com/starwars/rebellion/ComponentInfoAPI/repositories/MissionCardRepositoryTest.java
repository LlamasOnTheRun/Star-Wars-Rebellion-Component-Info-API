package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.MissionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MissionSkillType;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.MissionCardRequest;
import com.starwars.rebellion.ComponentInfoAPI.specification.MissionCardSpecification;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MissionCardRepositoryTest {

	@Autowired
	MissionCardRepository missionCardRepository;

	@Autowired
	MissionCardSpecification missionCardSpecification;

	@Test
	void givenAllMissionCardsAreAvailable_thenAllMissionCardCountIsReturned(){
		MissionCardRequest missionCardRequest = new MissionCardRequest();

		assertEquals(TOTAL_UNIQUE_MISSION_CARDS,
				missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest)).size());
	}

	// Gets all cards, including several copies of the same card

	@Test
	void givenAllCardsAvailable_thenRepeatsShouldAlsoReturn(){
		MissionCardRequest missionCardRequest = new MissionCardRequest();
		List<MissionCard> missionCardList =
				missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

		assertEquals(TOTAL_MISSION_CARDS, missionCardList.stream().mapToInt(MissionCard::getTotalInDeck).sum());
	}

	/*********************************
	 MinSkillNumRequired Count Tests
	 ********************************/

	@Test
	void givenMinSkillNumRequiredIsOne_thenEquivalentCardsAreReturned(){
		MissionCardRequest missionCardRequest = new MissionCardRequest();
		missionCardRequest.setMinSkillNumRequired(1);

		List<MissionCard> missionCardList =
				missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

		assertEquals(TOTAL_UNIQUE_MISSION_CARDS_W_MIN_SKILL_ONE, missionCardList.size());
	}

	@Test
	void givenMinSkillNumRequiredIsTwo_thenEquivalentCardsAreReturned(){
		MissionCardRequest missionCardRequest = new MissionCardRequest();
		missionCardRequest.setMinSkillNumRequired(2);

		List<MissionCard> missionCardList =
				missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

		assertEquals(TOTAL_UNIQUE_MISSION_CARDS_W_MIN_SKILL_TWO, missionCardList.size());
	}

	@Test
	void givenMinSkillNumRequiredIsThree_thenEquivalentCardsAreReturned(){
		MissionCardRequest missionCardRequest = new MissionCardRequest();
		missionCardRequest.setMinSkillNumRequired(3);

		List<MissionCard> missionCardList =
				missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

		assertEquals(TOTAL_UNIQUE_MISSION_CARDS_W_MIN_SKILL_THREE, missionCardList.size());
	}

	/********************
	 Faction Count Tests
	 *******************/

	@Test
	void givenFactionIsEmpire_thenFactionEqualUniqueCardsAreReturned(){
		MissionCardRequest missionCardRequest = new MissionCardRequest();
		missionCardRequest.setFaction(Faction.IMPERIAL);

		List<MissionCard> empireMissionCardList =
				missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

		assertEquals(TOTAL_UNIQUE_EMPIRE_MISSION_CARDS, empireMissionCardList.size());
	}

	@Test
	void givenFactionIsEmpire_thenFactionEqualCardsAreReturned(){
		MissionCardRequest missionCardRequest = new MissionCardRequest();
		missionCardRequest.setFaction(Faction.IMPERIAL);

		List<MissionCard> empireMissionCardList =
				missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

		assertEquals(TOTAL_EMPIRE_MISSION_CARDS,
				empireMissionCardList.stream().mapToInt(MissionCard::getTotalInDeck).sum());
	}

	@Test
	void givenFactionIsRebel_thenFactionEqualUniqueCardsAreReturned(){
		MissionCardRequest missionCardRequest = new MissionCardRequest();
		missionCardRequest.setFaction(Faction.REBEL);

		List<MissionCard> rebelMissionCardList =
				missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

		assertEquals(TOTAL_UNIQUE_REBEL_MISSION_CARDS, rebelMissionCardList.size());
	}

	@Test
	void givenFactionIsRebel_thenFactionEqualCardsAreReturned(){
		MissionCardRequest missionCardRequest = new MissionCardRequest();
		missionCardRequest.setFaction(Faction.REBEL);

		List<MissionCard> rebelMissionCardList =
				missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

		assertEquals(TOTAL_REBEL_MISSION_CARDS,
				rebelMissionCardList.stream().mapToInt(MissionCard::getTotalInDeck).sum());
	}

	/**************************
	 Skill Types Count Tests
	 **************************/

	@Test
	void givenSkillTypeIsLogistics_thenSkillTypeEqualCardsAreReturned(){
		MissionCardRequest missionCardRequest = new MissionCardRequest();
		missionCardRequest.setSkillType(MissionSkillType.LOGISTICS);

		List<MissionCard> missionCardList =
				missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

		assertEquals(TOTAL_UNIQUE_MISSION_CARDS_W_SKILL_TYPE_LOGISTICS, missionCardList.size());
	}

	@Test
	void givenSkillTypeIsDiplomacy_thenSkillTypeEqualCardsAreReturned(){
		MissionCardRequest missionCardRequest = new MissionCardRequest();
		missionCardRequest.setSkillType(MissionSkillType.DIPLOMACY);

		List<MissionCard> missionCardList =
				missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

		assertEquals(TOTAL_UNIQUE_MISSION_CARDS_W_SKILL_TYPE_DIPLOMACY, missionCardList.size());
	}

	@Test
	void givenSkillTypeIsSpecOps_thenSkillTypeEqualCardsAreReturned(){
		MissionCardRequest missionCardRequest = new MissionCardRequest();
		missionCardRequest.setSkillType(MissionSkillType.SPEC_OPS);

		List<MissionCard> missionCardList =
				missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

		assertEquals(TOTAL_UNIQUE_MISSION_CARDS_W_SKILL_TYPE_SPEC_OPS, missionCardList.size());
	}

	@Test
	void givenSkillTypeIsIntel_thenSkillTypeEqualCardsAreReturned(){
		MissionCardRequest missionCardRequest = new MissionCardRequest();
		missionCardRequest.setSkillType(MissionSkillType.INTEL);

		List<MissionCard> missionCardList =
				missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

		assertEquals(TOTAL_UNIQUE_MISSION_CARDS_W_SKILL_TYPE_INTEL, missionCardList.size());
	}

	/**************************
	 StartingCard Count Tests
	 **************************/

	@Test
	void givenStartingCardIsTrue_thenStartingCardAreReturned() {
		MissionCardRequest missionCardRequest = new MissionCardRequest();
		missionCardRequest.setIsStartingCard(true);

		List<MissionCard> missionCardList =
				missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

		assertEquals(TOTAL_STARTING_MISSION_CARDS, missionCardList.size());
	}

	@Test
	void givenStartingCardIsFalse_thenNonStartingCardsAreReturned() {
		MissionCardRequest missionCardRequest = new MissionCardRequest();
		missionCardRequest.setIsStartingCard(false);

		List<MissionCard> missionCardList =
				missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

		assertEquals(TOTAL_NON_STARTING_MISSION_CARDS , missionCardList.size());
	}

	/**************************
	 TotalInDeck Count Tests
	 **************************/

	@Test
	void givenTotalInDeckIsOne_thenEquivalentCardsAreReturned() {
		MissionCardRequest missionCardRequest = new MissionCardRequest();
		missionCardRequest.setTotalInDeck(1);

		List<MissionCard> missionCardList =
				missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

		assertEquals(TOTAL_UNIQUE_MISSION_CARDS_W_TOTAL_IN_GAME_ONE, missionCardList.size());
	}

	@Test
	void givenTotalInDeckIsTwo_thenEquivalentCardsAreReturned() {
		MissionCardRequest missionCardRequest = new MissionCardRequest();
		missionCardRequest.setTotalInDeck(2);

		List<MissionCard> missionCardList =
				missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

		assertEquals(TOTAL_UNIQUE_MISSION_CARDS_W_TOTAL_IN_GAME_TWO, missionCardList.size());
	}

	@Test
	void givenTotalInDeckIsThree_thenEquivalentCardsAreReturned() {
		MissionCardRequest missionCardRequest = new MissionCardRequest();
		missionCardRequest.setTotalInDeck(3);

		List<MissionCard> missionCardList =
				missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

		assertEquals(TOTAL_UNIQUE_MISSION_CARDS_W_TOTAL_IN_GAME_THREE, missionCardList.size());
	}
}
