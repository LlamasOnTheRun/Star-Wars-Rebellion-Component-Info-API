package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.TacticCard;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_TACTIC_CARDS;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_UNIQUE_TACTIC_CARDS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TacticCardRepositoryTest {

    @Autowired
    TacticCardRepository tacticCardRepository;

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
}