package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.SystemRequest;
import com.starwars.rebellion.ComponentInfoAPI.specification.SystemSpecification;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SystemRepositoryTest {

    @Autowired
    SystemRepository systemRepository;

    @Autowired
    SystemSpecification systemSpecification;

    @Test
    void givenAllSystemDataIsAdded_thenThirtyTwoSystemsAreReturned() {
        assertEquals(TOTAL_SYSTEMS, systemRepository.findAll().stream().distinct().count());
    }

    @Test
    void givenRequestHasRemoteFalse_thenProperDataIsReturned() {
        SystemRequest systemRequest = new SystemRequest();
        systemRequest.setRemote(false);

        List<System> systemList = systemRepository
                .findAll(systemSpecification.getSystem(systemRequest));

        assertEquals(TOTAL_NON_REMOTE_SYSTEMS, systemList.size());
    }

    @Test
    void givenRequestHasRemoteTrue_thenProperDataIsReturned() {
        SystemRequest systemRequest = new SystemRequest();
        systemRequest.setRemote(true);

        List<System> systemList = systemRepository
                .findAll(systemSpecification.getSystem(systemRequest));

        assertEquals(TOTAL_REMOTE_SYSTEMS, systemList.size());
    }
}
