package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.SystemRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.SystemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
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

    @Test
    void givenNameIsProvided_thenPredicateIsAdded() {
        SystemRequest systemRequest = new SystemRequest();
        systemRequest.setName(SYSTEM_NAME_EXAMPLE);

        List<System> systemList = systemRepository
                .findAll(systemSpecification.getSystem(systemRequest));

        assertEquals(1, systemList.size());
    }

    @Test
    void givenNameIsProvidedWithSimilarNaming_thenPredicateIsAdded() {
        SystemRequest systemRequest = new SystemRequest();
        systemRequest.setName("MoN CaLaMaRi");

        List<System> systemList = systemRepository
                .findAll(systemSpecification.getSystem(systemRequest));

        assertEquals(1, systemList.size());
    }

    @Test
    void givenNameIsNull_thenPredicateIsNotAdded() {
        SystemRequest systemRequest = new SystemRequest();
        systemRequest.setName(null);

        List<System> systemList = systemRepository
                .findAll(systemSpecification.getSystem(systemRequest));

        assertEquals(TOTAL_SYSTEMS, systemList.size());
    }

    @Test
    void givenNameIsBlank_thenPredicateIsNotAdded() {
        SystemRequest systemRequest = new SystemRequest();
        systemRequest.setName("");

        List<System> systemList = systemRepository
                .findAll(systemSpecification.getSystem(systemRequest));

        assertEquals(TOTAL_SYSTEMS, systemList.size());
    }

    @Test
    void givenRemoteIsProvided_thenPredicateIsAdded() {
        SystemRequest systemRequest = new SystemRequest();
        systemRequest.setRemote(false);

        List<System> systemList = systemRepository
                .findAll(systemSpecification.getSystem(systemRequest));

        assertEquals(TOTAL_NON_REMOTE_SYSTEMS, systemList.size());
    }

    @Test
    void givenRemoteIsNull_thenPredicateIsNotAdded() {
        SystemRequest systemRequest = new SystemRequest();
        systemRequest.setRemote(null);

        List<System> systemList = systemRepository
                .findAll(systemSpecification.getSystem(systemRequest));

        assertEquals(TOTAL_SYSTEMS, systemList.size());
    }
}
