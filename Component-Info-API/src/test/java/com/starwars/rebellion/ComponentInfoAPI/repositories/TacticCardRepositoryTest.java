package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.TacticCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.TacticType;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.TacticCardRequest;
import com.starwars.rebellion.ComponentInfoAPI.specification.TacticCardSpecification;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TacticCardRepositoryTest {

    @Autowired
    TacticCardRepository tacticCardRepository;
    @Autowired
    TacticCardSpecification tacticCardSpecification;

    @Test
    void givenAllGroundTacticCardsAreAvailable_thenOneCardIsReturned() {
        assertEquals("Escape Plan", tacticCardRepository.findByCardTextTitle("Escape Plan").getCardText().getTitle());
    }

    @Test
    void givenAllTacticCardsAreAvailable_thenNineteenCardsIsReturned(){
        List<TacticCard> tacticCardList = tacticCardRepository.findAll();
        assertEquals(TOTAL_UNIQUE_TACTIC_CARDS, tacticCardList.size());
    }

    @Test
    void givenAllTacticCardsAreAvailable_thenAllCardsAreReturned(){
        List<TacticCard> tacticCardList = tacticCardRepository.findAll();
        assertEquals(TOTAL_TACTIC_CARDS, tacticCardList.stream().mapToInt(TacticCard::getTotalInDeck).sum());
    }

    /***************************
     * Tactic Type Count Tests
     **************************/

    @Test
    void givenTacticTypeIsSpace_thenTypeEqualCountShouldBeReturned(){
        TacticCardRequest tacticCardRequest = new TacticCardRequest();
        tacticCardRequest.setTacticType(TacticType.SPACE);

        List<TacticCard> tacticCardList =
                tacticCardRepository.findAll(tacticCardSpecification.getTacticCards(tacticCardRequest));
        assertEquals(TOTAL_SPACE_TACTIC_CARDS, tacticCardList.size());
    }

    @Test
    void givenTacticTypeIsGround_thenTypeEqualCountShouldBeReturned(){
        TacticCardRequest tacticCardRequest = new TacticCardRequest();
        tacticCardRequest.setTacticType(TacticType.GROUND);

        List<TacticCard> tacticCardList =
                tacticCardRepository.findAll(tacticCardSpecification.getTacticCards(tacticCardRequest));
        assertEquals(TOTAL_GROUND_TACTIC_CARDS, tacticCardList.size());
    }
}