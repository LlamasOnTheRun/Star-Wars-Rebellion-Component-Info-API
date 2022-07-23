package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.MissionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MissionSkillType;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.MissionCardRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MissionCardControllerTest {
    @Autowired
    MissionCardController missionCardController;

    @Test
    void givenAllMissionCardDataIsAvailable_thenFiftyThreeCardsShouldBeReturned() {
        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardController.getAllMissionCards().size());
    }

    @Test
    void givenANearCompleteRequestFormWithID_thenEquivalentCardShouldBeReturned(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setId(67);

        List<MissionCard> missionCardList = missionCardController.getMissionCards(missionCardRequest);

        assertEquals("For The\nGreater Good\n", missionCardList.get(0).getCardText().getTitle());
    }

    @Test
    void givenANearCompleteRequestFormWithTitle_thenEquivalentCardShouldBeReturned(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setTitle("For The Greater Good ");

        List<MissionCard> missionCardList = missionCardController.getMissionCards(missionCardRequest);

        assertEquals(67, missionCardList.get(0).getId());
    }

    @Test
    void givenANearCompleteRequestFormWithLeaderBonus_thenEquivalentCardShouldBeReturned(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        //missionCardRequest.setLeaderBonus(RebelLeaderData.ADMIRAL_ACKBAR);
        missionCardRequest.getLeaderRequest().setName("Admiral Ackbar");

        List<MissionCard> missionCardList = missionCardController.getMissionCards(missionCardRequest);

        assertEquals(77, missionCardList.get(0).getId());
    }

    @Test
    void givenANearCompleteRequestFormWithSkillType_thenEquivalentCardShouldBeReturned(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setSkillType(MissionSkillType.LOGISTICS);

        List<MissionCard> missionCardList = missionCardController.getMissionCards(missionCardRequest);

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS_W_SKILL_TYPE_LOGISTICS, missionCardList.size());
    }

    @Test
    void givenANearCompleteRequestFormWithMinSkillNumRequired_thenEquivalentCardShouldBeReturned(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setMinSkillNumRequired(1);

        List<MissionCard> missionCardList = missionCardController.getMissionCards(missionCardRequest);

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS_W_MIN_SKILL_ONE, missionCardList.size());
    }

    @Test
    void givenANearCompleteRequestFormWithFaction_thenEquivalentCardShouldBeReturned(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setFaction(Faction.REBEL);

        List<MissionCard> missionCardList = missionCardController.getMissionCards(missionCardRequest);

        assertEquals(TOTAL_UNIQUE_REBEL_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenANearCompleteRequestFormWithIsStartingCard_thenEquivalentCardShouldBeReturned(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setIsStartingCard(true);

        List<MissionCard> missionCardList = missionCardController.getMissionCards(missionCardRequest);

        assertEquals(TOTAL_STARTING_MISSION_CARDS, missionCardList.size());
    }

    @Test
    void givenANearCompleteRequestFormWithTotalInDeck_thenEquivalentCardShouldBeReturned(){
        MissionCardRequest missionCardRequest = new MissionCardRequest();
        missionCardRequest.setTotalInDeck(1);

        List<MissionCard> missionCardList = missionCardController.getMissionCards(missionCardRequest);

        assertEquals(TOTAL_UNIQUE_MISSION_CARDS_W_TOTAL_IN_GAME_ONE, missionCardList.size());
    }
}
