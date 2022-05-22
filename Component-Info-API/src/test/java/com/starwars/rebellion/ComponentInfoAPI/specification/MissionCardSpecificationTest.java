package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.MissionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MissionSkillType;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.MissionCardRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.MissionCardRepository;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders.EmpireLeaderData;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders.RebelLeaderData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MissionCardSpecificationTest{
    @Autowired
    private MissionCardRepository missionCardRepository;

    @Autowired
    private MissionCardSpecification missionCardSpecification;

    /********
     ID tests
     *********/

    @Test
    void givenIDIsLessThanOne_thenIDEqualPredicateIsNotAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setId(0);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenIDIsNull_thenIDEqualPredicateIsNotAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setId(null);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenIDIsMoreThanZero_thenIDEqualPredicateIsAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setId(67);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(1, missionCardList.size());
    }

    @Test
    void givenIDDoesNotExist_thenIDEqualPredicateIsStillAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setId(1);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(0, missionCardList.size());
    }

    /**************
     Title tests
     **************/

    @Test
    void givenTitleIsSimilar_thenTitlePredicateIsAdded() {
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setTitle("Overse");

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(1, missionCardList.size());
        assertEquals("Oversee Project", missionCardList.get(0).getCardText().getTitle());
    }

    @Test
    void givenTitleIsExact_thenTitlePredicateIsAdded() {
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setTitle("Oversee Project");

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(1, missionCardList.size());
    }

    @Test
    void givenTitleIsNull_thenTitlePredicateIsNotAdded() {
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setTitle(null);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenTitleIsBlank_thenTitlePredicateIsNotAdded() {
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setTitle("");

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    /**************************
     LeaderBonus Tests
     **************************/

    @Test
    void givenLeaderBonusIsNull_thenPredicateIsNotAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setLeaderBonus(null);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenLeaderBonusIsNotNullAndARebel_thenPredicatesAreAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setFaction(Faction.REBEL);
        missionCardRequest.setLeaderBonus(RebelLeaderData.ADMIRAL_ACKBAR);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(1, missionCardList.size());
    }

    @Test
    void givenLeaderBonusIsNotNullAndAnImperial_thenPredicatesAreAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setFaction(Faction.IMPERIAL);
        missionCardRequest.setLeaderBonus(EmpireLeaderData.BOBA_FETT);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(1, missionCardList.size());
    }

    /**************************
     MinSkillNumRequired Tests
     **************************/

    @Test
    void givenMinSkillNumRequiredIsNull_thenPredicateIsNotAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setMinSkillNumRequired(null);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenMinSkillNumRequiredIsLessThanOne_thenPredicateIsNotAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setMinSkillNumRequired(0);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenMinSkillNumRequiredIsMoreThanZero_thenPredicateIsNotAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setMinSkillNumRequired(1);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(26, missionCardList.size());
    }

    /**************
     Faction Tests
     ***************/

    @Test
    void givenFactionIsNull_thenFactionEqualPredicateIsNotAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setFaction(null);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenFactionIsEmpire_thenFactionEqualPredicateIsAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setFaction(Faction.IMPERIAL);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(TOTAL_UNIQUE_EMPIRE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenFactionIsRebel_thenFactionEqualPredicateIsAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setFaction(Faction.REBEL);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(TOTAL_UNIQUE_REBEL_MISSION_CARDS, missionCardList.size());
    }

    /**************************
     Skill Types Tests
     **************************/

    @Test
    void givenSkillTypeIsNull_thenSkillTypeEqualPredicateIsNotAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setSkillType(null);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenSkillTypeIsLogistics_thenSkillTypeEqualPredicateIsStillAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setSkillType(MissionSkillType.LOGISTICS);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(13, missionCardList.size());
    }

    @Test
    void givenSkillTypeIsDiplomacy_thenSkillTypeEqualPredicateIsStillAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setSkillType(MissionSkillType.DIPLOMACY);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(13, missionCardList.size());
    }

    @Test
    void givenSkillTypeIsSpecOps_thenSkillTypeEqualPredicateIsStillAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setSkillType(MissionSkillType.SPEC_OPS);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(15, missionCardList.size());
    }

    @Test
    void givenSkillTypeIsIntel_thenSkillTypeEqualPredicateIsStillAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setSkillType(MissionSkillType.INTEL);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(12, missionCardList.size());
    }

    /**************************
     IsProjectCard Tests
     **************************/

    @Test
    void givenIsAProjectCardIsNull_thenPredicateIsNotAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setIsProjectCard(null);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenIsAProjectCardIsTrue_thenPredicateIsNotAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setIsProjectCard(true);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(TOTAL_PROJECT_CARDS, missionCardList.size());
    }

    @Test
    void givenIsAProjectCardIsFalse_thenPredicateIsNotAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setIsProjectCard(false);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS - TOTAL_PROJECT_CARDS, missionCardList.size());
    }

    /**************************
     StartingCard Tests
     **************************/

    @Test
    void givenStartingCardIsNull_thenStartingCardPredicateIsNotAdded() {
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setIsStartingCard(null);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenStartingCardIsTrue_thenStartingCardPredicateIsAdded() {
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setIsStartingCard(true);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(TOTAL_STARTING_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenStartingCardIsFalse_thenStartingCardPredicateIsAdded() {
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setIsStartingCard(false);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(TOTAL_NON_STARTING_MISSION_CARDS , missionCardList.size());
    }

    /**************************
     TotalInDeck Tests
     **************************/

    @Test
    void givenTotalInDeckIsNull_thenPredicateIsNotAdded() {
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setTotalInDeck(null);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenTotalInDeckIsLessThanOne_thenPredicateIsNotAdded() {
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setTotalInDeck(0);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenTotalInDeckIsMoreThanZero_thenPredicatesAreAdded() {
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setTotalInDeck(1);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest));

        assertEquals(40, missionCardList.size());
    }
}
