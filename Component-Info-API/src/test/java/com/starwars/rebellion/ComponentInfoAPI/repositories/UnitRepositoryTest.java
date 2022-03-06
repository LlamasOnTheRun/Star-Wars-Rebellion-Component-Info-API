package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.UnitType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UnitRepositoryTest {

    @Autowired
    UnitRepository unitRepository;

    @Test
    void givenAllRebelUnitsAreAvailable_thenNineUnitsAreReturned() {
        assertEquals(9, unitRepository.findByFaction(Faction.REBEL).size());
    }

    @Test
    void givenAllRebelShipUnitsAreAvailable_thenFiveUniqueUnitsAreReturned() {
        assertEquals(5, unitRepository.findByFactionAndUnitType(Faction.REBEL, UnitType.SHIP).size());
    }

    @Test
    void givenAllRebelGroundUnitsAreAvailable_thenFourUniqueUnitsAreReturned() {
        assertEquals(4, unitRepository.findByFactionAndUnitType(Faction.REBEL, UnitType.GROUND).size());
    }

    @Test
    void givenAllEmpireShipUnitsAreAvailable_thenSixUniqueShipsAreReturned() {
        assertEquals(6, unitRepository.findByFactionAndUnitType(Faction.IMPERIAL, UnitType.SHIP).size());
    }

    @Test
    void givenAllEmpireGroundUnitsAreAvailable_thenThreeUniqueUnitsAreReturned() {
        assertEquals(3, unitRepository.findByFactionAndUnitType(Faction.IMPERIAL, UnitType.GROUND).size());
    }

    @Test
    void givenUnitRepositoryIsUp_thenRebelGroundUnitIsReturned() {
        assertEquals("Rebel Trooper", unitRepository.findByTitle("Rebel Trooper").getTitle());
    }
}