package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Unit;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.UnitRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.UnitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_UNIQUE_UNITS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UnitSpecificationTest {
    @Autowired
    private UnitRepository unitRepository;

    @Autowired
    private UnitSpecification unitSpecification;

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
    void givenBlackDieIsLessThanZero_thenBlackDieEqualPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setBlackDie(-1);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

    @Test
    void givenBlackDieDoesNotExist_thenBlackDieEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setBlackDie(22);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(0, unitList.size());
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
    void givenRedDieIsLessThanZero_thenRedDieEqualPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setRedDie(-1);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

    @Test
    void givenRedDieDoesNotExist_thenRedDieEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setRedDie(22);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(0, unitList.size());
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
    void givenHealthIsLessThanZero_thenHealthEqualPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealth(-1);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

    @Test
    void givenHealthDoesNotExist_thenHealthEqualPredicateIsAdded() {
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealth(11);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(0, unitList.size());
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
    void givenHealthColorDoesNotExist_thenHealthColorEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setHealthColor('q');

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(0, unitList.size());
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
    void givenShipCarryingCapacityIsLessThanZero_thenShipCarryingCapacityEqualPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setShipCarryingCapacity(-1);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
    }

    @Test
    void givenShipCarryingCapacityDoesNotExist_thenShipCarryingCapacityEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setShipCarryingCapacity(11);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(0, unitList.size());
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

    /********************************
     * Structure Tests
     ********************************/

    @Test
    void givenStructureIsNull_thenStructureEqualPredicateIsNotAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setStructure(null);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(TOTAL_UNIQUE_UNITS, unitList.size());
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
    void givenTotalInGameDoesNotExist_thenTotalInGameEqualPredicateIsAdded(){
        UnitRequest unitRequest = new UnitRequest();
        unitRequest.setTotalInGame(12121);

        List<Unit> unitList = unitRepository.findAll((unitSpecification.getUnits(unitRequest)));

        assertEquals(0, unitList.size());
    }
}