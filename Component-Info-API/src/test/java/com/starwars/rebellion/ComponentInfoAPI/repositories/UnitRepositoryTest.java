package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Unit;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.UnitRequest;
import com.starwars.rebellion.ComponentInfoAPI.specification.UnitSpecification;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_UNIQUE_UNITS;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_UNITS;
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

        assertEquals(TOTAL_UNIQUE_UNITS, unitRepository.findAll(unitSpecification.getUnits(unitRequest)).size());
    }

    @Test
    void givenAllUnitsAvailable_thenRepeatsShouldAlsoReturn(){
        UnitRequest unitRequest = new UnitRequest();
        List<Unit> unitList = unitRepository.findAll(unitSpecification.getUnits(unitRequest));

        assertEquals(TOTAL_UNITS, unitList.stream().mapToInt(Unit::getTotalInGame).sum());
    }
}
