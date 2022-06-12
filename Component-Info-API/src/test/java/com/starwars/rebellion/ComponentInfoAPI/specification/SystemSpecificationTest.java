package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.SystemRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.SystemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.SYSTEM_ID_EXAMPLE;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_SYSTEMS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SystemSpecificationTest {

    @Autowired
    private SystemRepository systemRepository;

    @Autowired
    private SystemSpecification systemSpecification;

    @Test
    void givenIDIsProvided_thenPredicateIsAdded() {
        SystemRequest systemRequest = new SystemRequest();
        systemRequest.setId(SYSTEM_ID_EXAMPLE);

        List<System> systemList = systemRepository
                .findAll(systemSpecification.getSystem(systemRequest));

        assertEquals(1, systemList.size());
    }

    @Test
    void givenIDIsNull_thenPredicateIsNotAdded() {
        SystemRequest systemRequest = new SystemRequest();
        systemRequest.setId(null);

        List<System> systemList = systemRepository
                .findAll(systemSpecification.getSystem(systemRequest));

        assertEquals(TOTAL_SYSTEMS, systemList.size());
    }

    @Test
    void givenIDIsLessThanOne_thenPredicateIsNotAdded() {
        SystemRequest systemRequest = new SystemRequest();
        systemRequest.setId(0);

        List<System> systemList = systemRepository
                .findAll(systemSpecification.getSystem(systemRequest));

        assertEquals(TOTAL_SYSTEMS, systemList.size());
    }
}
