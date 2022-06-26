package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.TacticCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.TacticType;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.TacticCardRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_GROUND_TACTIC_CARDS;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_UNIQUE_TACTIC_CARDS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TacticCardControllerTest {
    @Autowired
    TacticCardController tacticCardController;

    @Test
    void givenAllTacticCardDataIsAvailable_thenNineTeenCardsShouldReturn(){
        assertEquals(TOTAL_UNIQUE_TACTIC_CARDS, tacticCardController.getAllTacticCards().size());
    }

    @Test
    void givenANearCompleteFormWithID_thenEquivalentCardShouldBeReturned(){
        TacticCardRequest tacticCardRequest = new TacticCardRequest();
        tacticCardRequest.setId(192);

        List<TacticCard> tacticCardList = tacticCardController.getTacticCards(tacticCardRequest);
        assertEquals("Escape Plan", tacticCardList.get(0).getCardText().getTitle());
    }

    @Test
    void givenANearCompleteFormWithTitle_thenEquivalentCardShouldBeReturned(){
        TacticCardRequest tacticCardRequest = new TacticCardRequest();
        tacticCardRequest.setTitle("Escape Plan");

        List<TacticCard> tacticCardList = tacticCardController.getTacticCards(tacticCardRequest);
        assertEquals(192, tacticCardList.get(0).getId());
    }

    @Test
    void givenANearCompleteFormWithTacticCard_thenEquivalentCardShouldBeReturned(){
        TacticCardRequest tacticCardRequest = new TacticCardRequest();
        tacticCardRequest.setTacticType(TacticType.GROUND);

        List<TacticCard> tacticCardList = tacticCardController.getTacticCards(tacticCardRequest);
        assertEquals(TOTAL_GROUND_TACTIC_CARDS, tacticCardList.size());
    }
}
