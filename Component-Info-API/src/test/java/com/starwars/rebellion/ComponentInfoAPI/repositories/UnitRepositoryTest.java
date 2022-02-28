package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.UnitType;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class UnitRepositoryTest {

    @Autowired
    UnitRepository unitRepository;

    @Test
    void givenAllRebelUnitsAreAvailable_thenNineUnitsAreReturned() {
        assertEquals(9, unitRepository.findByFaction(Faction.REBEL));
    }

    @Test
    void givenAllRebelShipUnitsAreAvailable_thenFiveUniqueUnitsAreReturned() {
        assertEquals(5, unitRepository.findByFactionAndUnitType(Faction.REBEL, UnitType.SHIP));
    }

    @Test
    void givenAllRebelGroundUnitsAreAvailable_thenFourUniqueUnitsAreReturned() {
        assertEquals(4, unitRepository.findByFactionAndUnitType(Faction.REBEL, UnitType.GROUND));
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