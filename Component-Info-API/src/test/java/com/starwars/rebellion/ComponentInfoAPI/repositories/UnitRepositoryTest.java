package com.starwars.rebellion.ComponentInfoAPI.repositories;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class UnitRepositoryTest {

    @Autowired
    UnitRepository unitRepository;

    @Test
    @Disabled
    void givenAllRebelShipUnitsAreAvailable_thenFiveUniqueUnitsAreReturned() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void givenAllRebelGroundUnitsAreAvailable_thenFourUniqueUnitsAreReturned() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void givenAllEmpireShipUnitsAreAvailable_thenSixUniqueShipsAreReturned() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void givenAllEmpireGroundUnitsAreAvailable_thenThreeUniqueUnitsAreReturned() {
        assertTrue(true);
    }

    @Test
    void givenUnitRepositoryIsUp_thenRebelGroundUnitIsReturned() {
        assertEquals("Rebel Trooper", unitRepository.findByTitle("Rebel Trooper").getTitle());
    }
}