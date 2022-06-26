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

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.BLACK_HEALTH_COLOR;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_UNIQUE_UNITS;
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
    void givenANearCompleteRequestFormWithFaction_thenEquivalentUnitShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setFaction(Faction.REBEL);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(174, unitList.get(0).getId());
    }

    @Test
    void givenANearCompleteRequestFormWithUnitType_thenEquivalentUnitShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setUnitType(UnitType.GROUND);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(174, unitList.get(0).getId());
    }

    @Test
    void givenANearCompleteRequestFormWithProductionType_thenEquivalentUnitShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setProductionType(ProductionType.LIGHT);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(174, unitList.get(0).getId());
    }

    @Test
    void givenANearCompleteRequestFormWithBlackDie_thenEquivalentUnitShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setBlackDie(1);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(174, unitList.get(0).getId());
    }

    @Test
    void givenANearCompleteRequestFormWithRedDie_thenEquivalentUnitShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setRedDie(0);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(174, unitList.get(0).getId());
    }

    @Test
    void givenANearCompleteRequestFormWithHealth_thenEquivalentUnitShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealth(1);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(174, unitList.get(0).getId());
    }

    @Test
    void givenANearCompleteRequestFormWithHealthColor_thenEquivalentUnitShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealthColor(BLACK_HEALTH_COLOR);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(174, unitList.get(0).getId());
    }

    @Test
    void givenANearCompleteRequestFormWithShipCarryingCapacity_thenEquivalentUnitShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setShipCarryingCapacity(0);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(174, unitList.get(0).getId());
    }

    @Test
    void givenANearCompleteRequestFormWithInvincible_thenEquivalentUnitShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setInvincible(false);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(174, unitList.get(0).getId());
    }

    @Test
    void givenANearCompleteRequestFormWithNeedsTransport_thenEquivalentUnitShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setNeedsTransport(true);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(174, unitList.get(0).getId());
    }

    @Test
    void givenANearCompleteRequestFormWithStructure_thenEquivalentUnitShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setStructure(false);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(174, unitList.get(0).getId());
    }

    @Test
    void givenANearCompleteRequestFormWithTotalInGame_thenEquivalentUnitShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTotalInGame(15);

        List<Unit> unitList = unitController.getUnits(unitRequest);
        assertEquals(174, unitList.get(0).getId());
    }
}
