package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Unit;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.ProductionType;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.UnitType;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.UnitRequest;
import com.starwars.rebellion.ComponentInfoAPI.specification.UnitSpecification;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UnitRepositoryTest {
    @Autowired
    UnitRepository unitRepository;
    @Autowired
    UnitSpecification unitSpecification;

    @Test
    void givenAllUnitsAreAvailable_thenAllUnitsAreReturned(){
        assertEquals(TOTAL_UNIQUE_UNITS, unitRepository.findAll().size());
    }

    @Test
    void givenAllUnitsAreAvailable_thenAllUnitsSpecifiedAreReturned(){
        UnitRequest unitRequest = new UnitRequest();
        List<Unit> unitList = unitRepository.findAll(unitSpecification.getUnits(unitRequest));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

    @Test
    void givenAllUnitsAvailable_thenRepeatsShouldAlsoReturn(){
        UnitRequest unitRequest = new UnitRequest();
        List<Unit> unitList = unitRepository.findAll(unitSpecification.getUnits(unitRequest));

        assertEquals(TOTAL_UNITS, unitList.stream().mapToInt(Unit::getTotalInGame).sum());
    }

    /************************
     * Faction Count Tests
     ***********************/

    @Test
    void givenFactionIsEmpire_thenFactionEqualUniqueUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setFaction(Faction.IMPERIAL);

        List<Unit> unitEmpireList = unitRepository.findAll(unitSpecification.getUnits(unitRequest));

        assertEquals(TOTAL_UNIQUE_EMPIRE_UNITS, unitEmpireList.size());
    }

    @Test
    void givenFactionIsEmpire_thenAllFactionEqualUnitsShouldBeReturned() {
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setFaction(Faction.IMPERIAL);
        List<Unit> unitEmpireList = unitRepository.findAll(unitSpecification.getUnits(unitRequest));

        assertEquals(TOTAL_EMPIRE_UNITS, unitEmpireList.stream().mapToInt(Unit::getTotalInGame).sum());
    }

    @Test
    void givenFactionIsRebel_thenFactionEqualUniqueUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setFaction(Faction.REBEL);

        List<Unit> unitRebelList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_REBEL_UNITS, unitRebelList.size());
    }

    @Test
    void givenFactionIsRebel_thenAllFactionEqualUnitsShouldBeReturned() {
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setFaction(Faction.REBEL);

        List<Unit> unitRebelList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_REBEL_UNITS, unitRebelList.stream().mapToInt(Unit::getTotalInGame).sum());
    }

    /************************
     * Unit Type Count Tests
     ************************/

    @Test
    void givenUnitTypeIsShip_thenUnitTypeEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setUnitType(UnitType.SHIP);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_SHIP_UNITS, unitList.size());
    }

    @Test
    void givenUnitTypeIsGround_thenUnitTypeEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setUnitType(UnitType.GROUND);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_GROUND_UNITS, unitList.size());
    }

    /******************************
     * Production Type Count Tests
     *****************************/

    @Test
    void givenProductionTypeIsLight_thenProductionTypeEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setProductionType(ProductionType.LIGHT);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_LIGHT_UNITS, unitList.size());
    }

    @Test
    void givenProductionTypeIsMedium_thenProductionTypeEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setProductionType(ProductionType.MEDIUM);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_MEDIUM_UNITS, unitList.size());
    }

    @Test
    void givenProductionTypeIsHeavy_thenProductionTypeEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setProductionType(ProductionType.HEAVY);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_HEAVY_UNITS, unitList.size());
    }

    @Test
    void givenProductionTypeIsProject_thenProductionTypeEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setProductionType(ProductionType.PROJECT);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_PROJECT_UNITS, unitList.size());
    }

    /************************
     * Black Die Count Tests
     ***********************/

    @Test
    void givenBlackDieIsZero_thenBlackDieEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setBlackDie(0);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_BLACK_DIE_ZERO, unitList.size());
    }

    @Test
    void givenBlackDieIsOne_thenBlackDieEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setBlackDie(1);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_BLACK_DIE_ONE, unitList.size());
    }

    @Test
    void givenBlackDieIsTwo_thenBlackDieEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setBlackDie(2);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_BLACK_DIE_TWO, unitList.size());
    }

    /**********************
     * Red Die Count Tests
     *********************/

    @Test
    void givenRedDieIsZero_thenRedDieEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setRedDie(0);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_RED_DIE_ZERO, unitList.size());
    }

    @Test
    void givenRedDieIsOne_thenRedDieEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setRedDie(1);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_RED_DIE_ONE, unitList.size());
    }

    @Test
    void givenRedDieIsTwo_thenRedDieEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setRedDie(2);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_RED_DIE_TWO, unitList.size());
    }

    @Test
    void givenRedDieIsThree_thenRedDieEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setRedDie(3);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_RED_DIE_THREE, unitList.size());
    }

    @Test
    void givenRedDieIsFour_thenRedDieEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setRedDie(4);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_RED_DIE_FOUR, unitList.size());
    }

    /*********************
     * Health Count Tests
     *********************/

    @Test
    void givenHealthIsZero_thenHealthEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealth(DEATH_STAR_HEALTH);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(1, unitList.size());
    }

    @Test
    void givenHealthIsOne_thenHealthEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealth(1);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_ONE_HEALTH, unitList.size());
    }

    @Test
    void givenHealthIsTwo_thenHealthEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealth(2);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_TWO_HEALTH, unitList.size());
    }

    @Test
    void givenHealthIsThree_thenHealthEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealth(3);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_THREE_HEALTH, unitList.size());
    }

    @Test
    void givenHealthIsFour_thenHealthEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealth(4);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_FOUR_HEALTH, unitList.size());
    }

    @Test
    void givenHealthIsFive_thenHealthEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealth(6);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_SIX_HEALTH, unitList.size());
    }

    /***************************
     * Health Color Count Tests
     **************************/

    @Test
    void givenHealthColorExistsAndIsRed_thenHealthColorEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealthColor(RED_HEALTH_COLOR);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_RED_HEALTH_COLOR, unitList.size());
    }

    @Test
    void givenHealthColorIsBlack_thenHealthColorEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealthColor(BLACK_HEALTH_COLOR);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_BLACK_HEALTH_COLOR, unitList.size());
    }

    @Test
    void givenHealthColorIsNone_thenHealthColorEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealthColor(NO_HEALTH_COLOR);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_NO_HEALTH_COLOR, unitList.size());
    }

    /*************************************
     * Ship Carrying Capacity Count Tests
     ************************************/

    @Test
    void givenShipCarryingCapacityDoesExistAndIsZero_thenShipCarryingCapacityEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setShipCarryingCapacity(0);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_ZERO_SHIP_CAPACITY, unitList.size());
    }

    @Test
    void givenShipCarryingCapacityIsTwo_thenShipCarryingCapacityEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setShipCarryingCapacity(2);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_TWO_SHIP_CAPACITY, unitList.size());
    }

    @Test
    void givenShipCarryingCapacityIsFour_thenShipCarryingCapacityEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setShipCarryingCapacity(4);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_FOUR_SHIP_CAPACITY, unitList.size());
    }

    @Test
    void givenShipCarryingCapacityIsSix_thenShipCarryingCapacityEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setShipCarryingCapacity(6);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_SIX_SHIP_CAPACITY, unitList.size());
    }

    @Test
    void givenShipCarryingCapacityIsEight_thenShipCarryingCapacityEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setShipCarryingCapacity(8);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_EIGHT_SHIP_CAPACITY, unitList.size());
    }

    /********************************
     * Invincible Count Tests
     ********************************/

    @Test
    void givenInvincibleIsFalse_thenInvincibleEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setInvincible(false);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_NON_INVINCIBLE_UNITS, unitList.size());
    }

    @Test
    void givenInvincibleIsTrue_thenInvincibleEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setInvincible(true);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_INVINCIBLE_UNITS, unitList.size());
    }

    /********************************
     * Needs Transports Count Tests
     ********************************/

    @Test
    void givenNeedsTransportIsFalse_thenNeedsTransportEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setNeedsTransport(false);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_DO_NOT_NEED_TRANSPORT, unitList.size());
    }

    @Test
    void givenNeedsTransportIsTrue_thenNeedsTransportEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setNeedsTransport(true);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_NEED_TRANSPORT, unitList.size());
    }

    /********************************
     * Structure Count Tests
     ********************************/

    @Test
    void givenStructureIsFalse_thenStructureEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setStructure(false);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_NON_STRUCTURE_UNITS, unitList.size());
    }

    @Test
    void givenStructureIsTrue_thenStructureEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setStructure(true);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_STRUCTURE_UNITS, unitList.size());
    }

    /********************************
     * Total In Game Count Tests
     ********************************/

    @Test
    void givenTotalInGameIsOne_thenTotalInGameEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTotalInGame(1);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_TOTAL_IN_GAME_ONE, unitList.size());
    }

    @Test
    void givenTotalInGameIsTwo_thenTotalInGameEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTotalInGame(2);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_TOTAL_IN_GAME_TWO, unitList.size());
    }

    @Test
    void givenTotalInGameIsThree_thenTotalInGameEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTotalInGame(3);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_TOTAL_IN_GAME_THREE, unitList.size());
    }

    @Test
    void givenTotalInGameIsFour_thenTotalInGameEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTotalInGame(4);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_TOTAL_IN_GAME_FOUR, unitList.size());
    }

    @Test
    void givenTotalInGameIsFive_thenTotalInGameEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTotalInGame(5);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_TOTAL_IN_GAME_FIVE, unitList.size());
    }

    @Test
    void givenTotalInGameIsSix_thenTotalInGameEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTotalInGame(6);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_TOTAL_IN_GAME_SIX, unitList.size());
    }

    @Test
    void givenTotalInGameIsTen_thenTotalInGameEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTotalInGame(10);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_TOTAL_IN_GAME_TEN, unitList.size());
    }

    @Test
    void givenTotalInGameIsTwelve_thenTotalInGameEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTotalInGame(12);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_TOTAL_IN_GAME_TWELVE, unitList.size());
    }

    @Test
    void givenTotalInGameIsFifteen_thenTotalInGameEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTotalInGame(15);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_TOTAL_IN_GAME_FIFTEEN, unitList.size());
    }

    @Test
    void givenTotalInGameIsEighteen_thenTotalInGameEqualUnitsShouldBeReturned(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTotalInGame(18);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS_W_TOTAL_IN_GAME_EIGHTEEN, unitList.size());
    }
}
