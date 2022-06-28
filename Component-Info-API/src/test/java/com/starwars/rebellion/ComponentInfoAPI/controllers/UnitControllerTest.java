package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Unit;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.ProductionType;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.UnitType;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.UnitRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UnitControllerTest {
    @Autowired
    UnitController unitController;

    @Test
    void givenAllUnitDataIsAvailable_thenFiftyThreeCardsShouldBeReturned() {
        assertEquals(TOTAL_UNIQUE_UNITS, unitController.getAllUnits().size());
    }

    @Test
    void givenANearCompleteRequestFormWithID_thenEquivalentUnitShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setId(174);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals("Rebel Trooper", unitList.get(0).getTitle());
    }

    @Test
    void givenANearCompleteRequestFormWithTitle_thenEquivalentUnitShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTitle("Rebel Trooper");

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(174, unitList.get(0).getId());
    }

    @Test
    void givenANearCompleteRequestFormWithFaction_thenEquivalentCounthouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setFaction(Faction.REBEL);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(TOTAL_UNIQUE_REBEL_UNITS, unitList.size());
    }

    @Test
    void givenANearCompleteRequestFormWithUnitType_thenEquivalentCountShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setUnitType(UnitType.GROUND);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(TOTAL_UNIQUE_GROUND_UNITS, unitList.size());
    }

    @Test
    void givenANearCompleteRequestFormWithProductionType_thenEquivalentCountShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setProductionType(ProductionType.LIGHT);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(TOTAL_UNIQUE_LIGHT_UNITS, unitList.size());
    }

    @Test
    void givenANearCompleteRequestFormWithBlackDie_thenEquivalentCountShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setBlackDie(1);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(TOTAL_UNIQUE_UNITS_W_BLACK_DIE_ONE, unitList.size());
    }

    @Test
    void givenANearCompleteRequestFormWithRedDie_thenEquivalentCountShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setRedDie(0);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(TOTAL_UNIQUE_UNITS_W_RED_DIE_ZERO, unitList.size());
    }

    @Test
    void givenANearCompleteRequestFormWithHealth_thenEquivalentCountShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealth(1);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(TOTAL_UNIQUE_UNITS_W_ONE_HEALTH, unitList.size());
    }

    @Test
    void givenANearCompleteRequestFormWithHealthColor_thenEquivalentCountShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealthColor(BLACK_HEALTH_COLOR);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(TOTAL_UNIQUE_UNITS_W_BLACK_HEALTH_COLOR, unitList.size());
    }

    @Test
    void givenANearCompleteRequestFormWithShipCarryingCapacity_thenEquivalentCountShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setShipCarryingCapacity(0);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(TOTAL_UNIQUE_UNITS_W_ZERO_SHIP_CAPACITY, unitList.size());
    }

    @Test
    void givenANearCompleteRequestFormWithInvincible_thenEquivalentCountShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setInvincible(false);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(TOTAL_UNIQUE_NON_INVINCIBLE_UNITS, unitList.size());
    }

    @Test
    void givenANearCompleteRequestFormWithNeedsTransport_thenEquivalentCountShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setNeedsTransport(true);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(TOTAL_UNIQUE_UNITS_NEED_TRANSPORT, unitList.size());
    }

    @Test
    void givenANearCompleteRequestFormWithStructure_thenEquivalentCountShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setStructure(false);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(TOTAL_UNIQUE_NON_STRUCTURE_UNITS, unitList.size());
    }

    @Test
    void givenANearCompleteRequestFormWithTotalInGame_thenEquivalentUnitShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTotalInGame(15);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(174, unitList.get(0).getId());
        assertEquals(1, unitList.size());
    }
}
