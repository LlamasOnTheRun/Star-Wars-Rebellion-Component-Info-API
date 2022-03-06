package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.TacticCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.TacticType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TacticCardRepositoryTest {

    @Autowired
    TacticCardRepository tacticCardRepository;

    @Test
    void givenAllGroundTacticCardsAreAvailable_thenOneCardIsReturned() {
        assertEquals("Escape Plan", tacticCardRepository.findByCardTextTitle("Escape Plan").getCardText().getTitle());
    }

    @Test
    void givenAllGroundTacticCardsAreAvailable_thenTenUniqueCardsAreReturned() {
        assertEquals(10, tacticCardRepository.findByTacticType(TacticType.GROUND).size());
    }

    @Test
    void givenAllGroundTacticCardsAreAvailable_thenFifteenIsTotalSumOfCardsReturned() {
        assertEquals(15, tacticCardRepository.findByTacticType(TacticType.GROUND).stream().mapToInt(TacticCard::getTotalInDeck).sum());
    }

    @Test
    void givenAllSpaceTacticCardsAreAvailable_thenNineUniqueCardsAreReturned() {
        assertEquals(9, tacticCardRepository.findByTacticType(TacticType.SPACE).size());
    }

    @Test
    void givenAllSpaceTacticCardsAreAvailable_thenFifteenIsTotalSumOfCardsReturned() {
        assertEquals(15, tacticCardRepository.findByTacticType(TacticType.SPACE).stream().mapToInt(TacticCard::getTotalInDeck).sum());
    }
}