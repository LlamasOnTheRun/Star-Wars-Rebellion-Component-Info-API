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

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
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

    @Test
    void givenSystemHasALeftNeighboringSystem_thenNeighboringSystemHasCorrectRightSystem() {
        SystemRequest systemRequest = new SystemRequest();

        List<System> systemList = systemRepository.findAll(systemSpecification.getSystem(systemRequest));

        systemList.forEach(rightSystem -> {
            if(rightSystem.getSystemMapping() != null && rightSystem.getSystemMapping().getLeft() != null) {
                SystemRequest leftSystemRequest = new SystemRequest();
                leftSystemRequest.setId(rightSystem.getSystemMapping().getLeft().getId());

                System leftSystem = systemRepository.findAll(systemSpecification.getSystem(leftSystemRequest)).get(0);

                assertEquals(leftSystem.getName(), rightSystem.getSystemMapping().getLeft().getName(), rightSystem.getName() + " left system is not matching " + leftSystem.getName());
                assertEquals(rightSystem.getName(), leftSystem.getSystemMapping().getRight().getName(), leftSystem.getName() + " right system is not matching " + rightSystem.getName());
            }
        });
    }

    @Test
    void givenSystemHasATopLeftNeighboringSystem_thenNeighboringSystemHasCorrectBottomRightSystem() {
        SystemRequest systemRequest = new SystemRequest();

        List<System> systemList = systemRepository.findAll(systemSpecification.getSystem(systemRequest));

        systemList.forEach(bottomRightSystem -> {
            if(bottomRightSystem.getSystemMapping() != null && bottomRightSystem.getSystemMapping().getTopLeft() != null) {
                SystemRequest topLeftSystemRequest = new SystemRequest();
                topLeftSystemRequest.setId(bottomRightSystem.getSystemMapping().getTopLeft().getId());

                System topLeftSystem = systemRepository.findAll(systemSpecification.getSystem(topLeftSystemRequest)).get(0);

                assertEquals(topLeftSystem.getName(), bottomRightSystem.getSystemMapping().getTopLeft().getName(), bottomRightSystem.getName() + " top left system is not matching " + topLeftSystem.getName());
                assertEquals(bottomRightSystem.getName(), topLeftSystem.getSystemMapping().getBottomRight().getName(), topLeftSystem.getName() + " bottom right system is not matching " + bottomRightSystem.getName());
            }
        });
    }

    @Test
    void givenSystemHasATopNeighboringSystem_thenNeighboringSystemHasCorrectBottomSystem() {
        SystemRequest systemRequest = new SystemRequest();

        List<System> systemList = systemRepository.findAll(systemSpecification.getSystem(systemRequest));

        systemList.forEach(bottomSystem -> {
            if(bottomSystem.getSystemMapping() != null && bottomSystem.getSystemMapping().getTop() != null) {
                SystemRequest topSystemRequest = new SystemRequest();
                topSystemRequest.setId(bottomSystem.getSystemMapping().getTop().getId());

                System topSystem = systemRepository.findAll(systemSpecification.getSystem(topSystemRequest)).get(0);

                assertEquals(topSystem.getName(), bottomSystem.getSystemMapping().getTop().getName(), bottomSystem.getName() + " top system is not matching " + topSystem.getName());
                assertEquals(bottomSystem.getName(), topSystem.getSystemMapping().getBottom().getName(), topSystem.getName() + " bottom system is not matching " + bottomSystem.getName());
            }
        });
    }
}
