package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.SystemRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.SystemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_SYSTEMS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SystemSpecificationTest {

    @Autowired
    private SystemRepository systemRepository;

    @Autowired
    private SystemSpecification systemSpecification;

    @Test
    void givenIDIsNull_thenPredicateIsNotAdded() {
        SystemRequest systemRequest = new SystemRequest();
        systemRequest.setId(null);

        List<System> systemList = systemRepository
                .findAll(systemSpecification.getSystem(systemRequest));

        assertEquals(TOTAL_SYSTEMS, systemList.size());
    }
}
