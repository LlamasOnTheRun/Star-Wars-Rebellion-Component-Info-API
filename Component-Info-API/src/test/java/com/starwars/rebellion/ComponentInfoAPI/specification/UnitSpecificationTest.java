package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Unit;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.ProductionType;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.UnitType;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.UnitRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.UnitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UnitSpecificationTest {
    @Autowired
    private UnitRepository unitRepository;

    @Autowired
    private UnitSpecification unitSpecification;

    // Gets all cards, including several copies of the same card

    @Test
    void givenAllUnitsAvailable_thenRepeatsShouldAlsoReturn(){
        UnitRequest unitRequest = new UnitRequest();
        List<Unit> unitList = unitRepository.findAll(unitSpecification.getUnits(unitRequest));

        assertEquals(TOTAL_UNITS, unitList.stream().mapToInt(Unit::getTotalInGame).sum());
    }

    /************
     * ID Tests
     ************/

    @Test
    void givenIDIsLessThanOne_thenIDEqualPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setId(0);

        List<Unit> unitList = unitRepository.findAll(unitSpecification.getUnits(unitRequest));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

    @Test
    void givenIDIsNull_thenIDEqualPredicateIsNotAdded(){
       UnitRequest unitRequest = new UnitRequest();
       unitRequest.setId(null);

       List<Unit> unitList = unitRepository.findAll(unitSpecification.getUnits(unitRequest));

       assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

   @Test
   void givenIDIsMoreThanZero_thenIDEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setId(174);

        List<Unit> unitList = unitRepository.findAll(unitSpecification.getUnits(unitRequest));

        assertEquals(1, unitList.size());
   }

   @Test
   void givenIDDoesNotExist_thenIDEqualPredicateIsStillAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setId(1);

        List<Unit> unitList = unitRepository.findAll(unitSpecification.getUnits(unitRequest));

        assertEquals(0, unitList.size());
   }

    /*****************
     * Title Tests
     ****************/

    @Test
    void givenTitleIsNull_thenTitleEqualPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTitle(null);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

    @Test
    void givenTitleIsEmpty_thenTitleEqualPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTitle("");

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

    @Test
    void givenTitleIsSimilar_thenTitleEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTitle("Rebel");

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(2, unitList.size());
        assertEquals("Rebel Trooper", unitList.get(0).getTitle());
    }

    @Test
    void givenTitleIsExact_thenTitleEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTitle("Rebel Trooper");

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(1, unitList.size());
        assertEquals("Rebel Trooper", unitList.get(0).getTitle());
    }

    /*****************
     * Faction Tests
     ****************/

    @Test
    void givenFactionIsNull_thenFactionEqualPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setFaction(null);

        List<Unit> unitList = unitRepository.findAll(unitSpecification.getUnits(unitRequest));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

    @Test
    void givenFactionIsEmpire_thenFactionEqualUniquePredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setFaction(Faction.IMPERIAL);

        List<Unit> unitEmpireList = unitRepository.findAll(unitSpecification.getUnits(unitRequest));

        assertEquals(TOTAL_UNIQUE_EMPIRE_UNITS, unitEmpireList.size());
    }

    @Test
    void givenFactionIsEmpire_thenFactionEqualPredicateIsAdded() {
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setFaction(Faction.IMPERIAL);
        List<Unit> unitEmpireList = unitRepository.findAll(unitSpecification.getUnits(unitRequest));

        assertEquals(TOTAL_EMPIRE_UNITS, unitEmpireList.stream().mapToInt(Unit::getTotalInGame).sum());
    }

    @Test
    void givenFactionIsRebel_thenFactionEqualUniquePredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setFaction(Faction.REBEL);

        List<Unit> unitRebelList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_REBEL_UNITS, unitRebelList.size());
    }

    @Test
    void givenFactionIsRebel_thenFactionEqualPredicateIsAdded() {
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setFaction(Faction.REBEL);

        List<Unit> unitRebelList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_REBEL_UNITS, unitRebelList.stream().mapToInt(Unit::getTotalInGame).sum());
    }

    /*******************
     * Unit Type Tests
     ******************/

    @Test
    void givenUnitTypeIsNull_thenUnitTypeEqualPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setUnitType(null);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

    @Test
    void givenUnitTypeIsShip_thenUnitTypeEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setUnitType(UnitType.SHIP);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(11, unitList.size());
    }

    @Test
    void givenUnitTypeIsGround_thenUnitTypeEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setUnitType(UnitType.GROUND);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(7, unitList.size());
    }

    /************************
     * Production Type Tests
     ***********************/

    @Test
    void givenProductionTypeIsNull_thenProductionTypeEqualPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setProductionType(null);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

    @Test
    void givenProductionTypeIsLight_thenProductionTypeEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setProductionType(ProductionType.LIGHT);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(6, unitList.size());
    }

    @Test
    void givenProductionTypeIsMedium_thenProductionTypeEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setProductionType(ProductionType.MEDIUM);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(4, unitList.size());
    }

    @Test
    void givenProductionTypeIsHeavy_thenProductionTypeEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setProductionType(ProductionType.HEAVY);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(5, unitList.size());
    }

    @Test
    void givenProductionTypeIsProject_thenProductionTypeEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setProductionType(ProductionType.PROJECT);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(3, unitList.size());
    }

    /*****************
     * Black Die Tests
     *****************/

    @Test
    void givenBlackDieIsNull_thenBlackDieEqualPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setBlackDie(null);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

    @Test
    void givenBlackDieIsZero_thenBlackDieEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setBlackDie(0);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(6, unitList.size());
    }

    @Test
    void givenBlackDieIsOne_thenBlackDieEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setBlackDie(1);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(11, unitList.size());
    }

    @Test
    void givenBlackDieIsTwo_thenBlackDieEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setBlackDie(2);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(1, unitList.size());
    }

    /*****************
     * Red Die Tests
     *****************/

    @Test
    void givenRedDieIsNull_thenRedDieEqualPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setRedDie(null);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

    @Test
    void givenRedDieIsZero_thenRedDieEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setRedDie(0);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(8, unitList.size());
    }

    @Test
    void givenRedDieIsOne_thenRedDieEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setRedDie(1);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(5, unitList.size());
    }

    @Test
    void givenRedDieIsTwo_thenRedDieEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setRedDie(2);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(3, unitList.size());
    }

    @Test
    void givenRedDieIsThree_thenRedDieEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setRedDie(3);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(1, unitList.size());
    }

    @Test
    void givenRedDieIsFour_thenRedDieEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setRedDie(4);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(1, unitList.size());
    }

    /*****************
     * Health Tests
     *****************/

   @Test
   void givenHealthIsNull_thenHealthEqualPredicateIsNotAdded(){
       UnitRequest unitRequest = new UnitRequest();
       unitRequest.setHealth(null);

       List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

       assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
   }

   @Test
    void givenHealthIsZero_thenHealthEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealth(DEATH_STAR_HEALTH);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(1, unitList.size());
    }

    @Test
    void givenHealthIsOne_thenHealthEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealth(1);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(5, unitList.size());
    }

    @Test
    void givenHealthIsTwo_thenHealthEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealth(2);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(5, unitList.size());
    }

    @Test
    void givenHealthIsThree_thenHealthEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealth(3);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(3, unitList.size());
    }

    @Test
    void givenHealthIsFour_thenHealthEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealth(4);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(3, unitList.size());
    }

    @Test
    void givenHealthIsFive_thenHealthEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealth(6);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(1, unitList.size());
    }

    /**********************
     * Health Color Tests
     **********************/

    @Test
    void givenHealthColorIsNull_thenHealthColorEqualPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealthColor(null);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

    @Test
    void givenHealthColorIsRed_thenHealthColorEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealthColor(RED_HEALTH_COLOR);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(11, unitList.size());
    }

    @Test
    void givenHealthColorIsBlack_thenHealthColorEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealthColor(BLACK_HEALTH_COLOR);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(6, unitList.size());
    }

    @Test
    void givenHealthColorIsNone_thenHealthColorEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealthColor(NO_HEALTH_COLOR);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(1, unitList.size());
    }

    /********************************
     * Ship Carrying Capacity Tests
     ********************************/

    @Test
    void givenShipCarryingCapacityIsNull_thenShipCarryingCapacityEqualPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setShipCarryingCapacity(null);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

    @Test
    void givenShipCarryingCapacityIsZero_thenShipCarryingCapacityEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setShipCarryingCapacity(0);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(11, unitList.size());
    }

    @Test
    void givenShipCarryingCapacityIsTwo_thenShipCarryingCapacityEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setShipCarryingCapacity(2);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(1, unitList.size());
    }

    @Test
    void givenShipCarryingCapacityIsFour_thenShipCarryingCapacityEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setShipCarryingCapacity(4);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(3, unitList.size());
    }

    @Test
    void givenShipCarryingCapacityIsSix_thenShipCarryingCapacityEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setShipCarryingCapacity(6);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(1, unitList.size());
    }

    @Test
    void givenShipCarryingCapacityIsEight_thenShipCarryingCapacityEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setShipCarryingCapacity(8);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(2, unitList.size());
    }

    /********************************
     * Invincible Tests
     ********************************/

    @Test
    void givenInvincibleIsNull_thenInvincibleEqualPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setInvincible(null);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

    @Test
    void givenInvincibleIsFalse_thenInvincibleEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setInvincible(false);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(17, unitList.size());
    }

    @Test
    void givenInvincibleIsTrue_thenInvincibleEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setInvincible(true);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(1, unitList.size());
    }

    /********************************
     * Needs Transports Tests
     ********************************/

    @Test
    void givenNeedsTransportIsNull_thenNeedsTransportEqualPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setNeedsTransport(null);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

    @Test
    void givenNeedsTransportIsFalse_thenNeedsTransportEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setNeedsTransport(false);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(12, unitList.size());
    }

    @Test
    void givenNeedsTransportIsTrue_thenNeedsTransportEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setNeedsTransport(true);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(6, unitList.size());
    }

    /********************************
     * Structure Tests
     ********************************/

    @Test
    void givenStructureIsNull_thenStructureEquallPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setStructure(null);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

    @Test
    void givenStructureIsFalse_thenStructureEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setStructure(false);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(15, unitList.size());
    }

    @Test
    void givenStructureIsTrue_thenStructureEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setStructure(true);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(3, unitList.size());
    }

    /********************************
     * Total In Game Tests
     ********************************/

    @Test
    void givenTotalInGameIsNull_thenTotalInGameEqualPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTotalInGame(null);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

    @Test
    void givenTotalInGameIsLessThanOne_thenTotalInGameEqualPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTotalInGame(0);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

    @Test
    void givenTotalInGameIsMoreThanZero_thenTotalInGameEqualPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTotalInGame(1);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(1, unitList.size());
    }
}