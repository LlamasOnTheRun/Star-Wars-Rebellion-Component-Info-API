package com.starwars.rebellion.ComponentInfoAPI.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TacticCardRepositoryTest {

    @Autowired
    TacticCardRepository tacticCardRepository;

    @Test
    void givenAllGroundTacticCardsAreAvailable_thenTenUniqueCardsAreReturned() {
        assertEquals("Escape Plan", tacticCardRepository.findByTitle("Escape Plan").getTitle());
    }

    @Test
    void givenAllGroundTacticCardsAreAvailable_thenTenUniqueCardsAreReturned() {
        assertEquals(10, tacticCardRepository.findByType(TaticType.GROUND));
    }

    @Test
    void givenAllGroundTacticCardsAreAvailable_thenFifteenIsTotalSumOfCardsReturned() {
        assertEquals(15, tacticCardRepository.findByType(TaticType.GROUND).stream().mapToInt(TaticCard::getTotalInDeck).sum();
    }
}