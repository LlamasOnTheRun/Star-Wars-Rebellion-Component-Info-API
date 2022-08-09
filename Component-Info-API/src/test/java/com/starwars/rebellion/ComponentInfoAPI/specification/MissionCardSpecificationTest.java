package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.MissionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MissionSkillType;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.MissionCardRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.MissionCardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MissionCardSpecificationTest{
    @Autowired
    private MissionCardRepository missionCardRepository;

    @Autowired
    private MissionCardSpecification missionCardSpecification;

    @Test
    void givenAllMissionCardAvailable_thenOnlyMissionCardsShouldBeReturned(){
        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getAllMissionCards());
        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    /********
     ID tests
     *********/

    @Test
    void givenIDIsLessThanOne_thenIDEqualPredicateIsNotAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setId(0);


        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest).atRoot());

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenIDIsNull_thenIDEqualPredicateIsNotAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setId(null);


        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest).atRoot());

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenIDIsMoreThanZero_thenIDEqualPredicateIsAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setId(67);


        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest).atRoot());

        assertEquals(1, missionCardList.size());
    }

    @Test
    void givenIDDoesNotExist_thenIDEqualPredicateIsStillAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setId(1);


        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest).atRoot());

        assertEquals(0, missionCardList.size());
    }

    /**************
     Title tests
     **************/

    @Test
    void givenTitleIsSimilar_thenTitlePredicateIsAdded() {
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setTitle("Plans");


        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest).atRoot());

        assertEquals(2, missionCardList.size());
        assertEquals("Stolen Plans", missionCardList.get(0).getCardText().getTitle());
    }

    @Test
    void givenTitleIsExact_thenTitlePredicateIsAdded() {
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setTitle("For The Greater Good ");


        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest).atRoot());

        assertEquals(1, missionCardList.size());
    }

    @Test
    void givenTitleIsNull_thenTitlePredicateIsNotAdded() {
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setTitle(null);


        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest).atRoot());

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenTitleIsBlank_thenTitlePredicateIsNotAdded() {
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setTitle("");


        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest).atRoot());

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    /**************************
     MinSkillNumRequired Tests
     **************************/

    @Test
    void givenMinSkillNumRequiredIsNull_thenPredicateIsNotAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setMinSkillNumRequired(null);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest).atRoot());

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenMinSkillNumRequiredIsLessThanOne_thenPredicateIsNotAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setMinSkillNumRequired(0);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest).atRoot());

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenMinSkillNumRequiredExists_thenEquivalentPredicatesIsAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setMinSkillNumRequired(1);

        List<MissionCard> missionCardList =
                missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest).atRoot());

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS_W_MIN_SKILL_ONE, missionCardList.size());
    }

    /**************
     Faction Tests
     ***************/

    @Test
    void givenFactionIsNull_thenFactionEqualPredicateIsNotAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setFaction(null);

        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest).atRoot());

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenFactionExists_thenFactionEqualPredicatesIsAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setFaction(Faction.IMPERIAL);

        List<MissionCard> empireMissionCardList =
                missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest).atRoot());

        assertEquals(TOTAL_UNIQUE_EMPIRE_MISSION_CARDS, empireMissionCardList.size());
    }

    /**************************
     Skill Types Tests
     **************************/

    @Test
    void givenSkillTypeIsNull_thenSkillTypeEqualPredicateIsNotAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setSkillType(null);


        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest).atRoot());

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenSkillTypeExists_thenSkillTypeEqualPredicateIsAdded(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setSkillType(MissionSkillType.LOGISTICS);

        List<MissionCard> missionCardList =
                missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest).atRoot());

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS_W_SKILL_TYPE_LOGISTICS, missionCardList.size());
    }

    /**************************
     StartingCard Tests
     **************************/

    @Test
    void givenStartingCardIsNull_thenStartingCardPredicateIsNotAdded() {
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setIsStartingCard(null);


        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest).atRoot());

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenStartingCardExists_thenStartingCardPredicatesIsAdded() {
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setIsStartingCard(true);

        List<MissionCard> missionCardList =
                missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest).atRoot());

        assertEquals(TOTAL_STARTING_MISSION_CARDS, missionCardList.size());
    }

    /**************************
     TotalInDeck Tests
     **************************/

    @Test
    void givenTotalInDeckIsNull_thenPredicateIsNotAdded() {
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setTotalInDeck(null);


        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest).atRoot());

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenTotalInDeckIsLessThanOne_thenPredicateIsNotAdded() {
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setTotalInDeck(0);


        List<MissionCard> missionCardList = missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest).atRoot());

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenTotalInDeckExists_thenEquivalentPredicateIsAdded() {
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setTotalInDeck(1);

        List<MissionCard> missionCardList =
                missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest).atRoot());

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS_W_TOTAL_IN_GAME_ONE, missionCardList.size());
    }
}
