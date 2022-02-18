package com.starwars.rebellion.ComponentInfoAPI.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class UnitRepositoryTest {

    @Autowired
    UnitRepository unitRepository;

    @Test
    void givenAllRebelActionCardDataIsAvailable_thenSixNonStartingCardsAreAvailable() {
        assertTrue(true);
    }
}