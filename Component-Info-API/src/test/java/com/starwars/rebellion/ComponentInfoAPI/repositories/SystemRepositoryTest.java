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

        List<System> systemList = systemRepository.findAll(systemSpecification.getSystem(new SystemRequest()));

        systemList.forEach(rightSystem -> {
            if(rightSystem.getSystemMapping() != null && rightSystem.getSystemMapping().getLeft() != null) {
                SystemRequest leftSystemRequest = new SystemRequest();
                leftSystemRequest.setId(rightSystem.getSystemMapping().getLeft().getId());

                System leftSystem = systemRepository.findAll(systemSpecification.getSystem(leftSystemRequest)).get(0);

                assertEquals(leftSystem.getName(), rightSystem.getSystemMapping().getLeft().getName(),
                        rightSystem.getName() + "'s left system is not matching " + leftSystem.getName());
                assertEquals(rightSystem.getName(), leftSystem.getSystemMapping().getRight().getName(),
                        leftSystem.getName() + "'s right system is not matching " + rightSystem.getName());
            }
        });
    }

    @Test
    void givenSystemHasATopLeftNeighboringSystem_thenNeighboringSystemHasCorrectBottomRightSystem() {

        List<System> systemList = systemRepository.findAll(systemSpecification.getSystem(new SystemRequest()));

        systemList.forEach(bottomRightSystem -> {
            if(bottomRightSystem.getSystemMapping() != null && bottomRightSystem.getSystemMapping().getTopLeft() != null) {
                SystemRequest topLeftSystemRequest = new SystemRequest();
                topLeftSystemRequest.setId(bottomRightSystem.getSystemMapping().getTopLeft().getId());

                System topLeftSystem = systemRepository.findAll(systemSpecification.getSystem(topLeftSystemRequest)).get(0);

                assertEquals(topLeftSystem.getName(), bottomRightSystem.getSystemMapping().getTopLeft().getName(),
                        bottomRightSystem.getName() + "'s top left system is not matching " + topLeftSystem.getName());
                assertEquals(bottomRightSystem.getName(), topLeftSystem.getSystemMapping().getBottomRight().getName(),
                        topLeftSystem.getName() + "'s bottom right system is not matching " + bottomRightSystem.getName());
            }
        });
    }

    @Test
    void givenSystemHasATopNeighboringSystem_thenNeighboringSystemHasCorrectBottomSystem() {

        List<System> systemList = systemRepository.findAll(systemSpecification.getSystem(new SystemRequest()));

        systemList.forEach(bottomSystem -> {
            if(bottomSystem.getSystemMapping() != null && bottomSystem.getSystemMapping().getTop() != null) {
                SystemRequest topSystemRequest = new SystemRequest();
                topSystemRequest.setId(bottomSystem.getSystemMapping().getTop().getId());

                System topSystem = systemRepository.findAll(systemSpecification.getSystem(topSystemRequest)).get(0);

                assertEquals(topSystem.getName(), bottomSystem.getSystemMapping().getTop().getName(),
                        bottomSystem.getName() + "'s top system is not matching " + topSystem.getName());
                assertEquals(bottomSystem.getName(), topSystem.getSystemMapping().getBottom().getName(),
                        topSystem.getName() + "'s bottom system is not matching " + bottomSystem.getName());
            }
        });
    }

    @Test
    void givenSystemHasATopRightNeighboringSystem_thenNeighboringSystemHasCorrectBottomLeftSystem() {

        List<System> systemList = systemRepository.findAll(systemSpecification.getSystem(new SystemRequest()));

        systemList.forEach(bottomLeftSystem -> {
            if(bottomLeftSystem.getSystemMapping() != null && bottomLeftSystem.getSystemMapping().getTopRight() != null) {
                SystemRequest topRightSystemRequest = new SystemRequest();
                topRightSystemRequest.setId(bottomLeftSystem.getSystemMapping().getTopRight().getId());

                System topRightSystem = systemRepository.findAll(systemSpecification.getSystem(topRightSystemRequest)).get(0);

                assertEquals(topRightSystem.getName(), bottomLeftSystem.getSystemMapping().getTopRight().getName(),
                        bottomLeftSystem.getName() + "'s top right system is not matching " + topRightSystem.getName());
                assertEquals(bottomLeftSystem.getName(), topRightSystem.getSystemMapping().getBottomLeft().getName(),
                        topRightSystem.getName() + "'s bottom left system is not matching " + bottomLeftSystem.getName());
            }
        });
    }

    @Test
    void givenSystemHasARightNeighboringSystem_thenNeighboringSystemHasCorrectLeftSystem() {

        List<System> systemList = systemRepository.findAll(systemSpecification.getSystem(new SystemRequest()));

        systemList.forEach(leftSystem -> {
            if(leftSystem.getSystemMapping() != null && leftSystem.getSystemMapping().getRight() != null) {
                SystemRequest rightSystemRequest = new SystemRequest();
                rightSystemRequest.setId(leftSystem.getSystemMapping().getRight().getId());

                System rightSystem = systemRepository.findAll(systemSpecification.getSystem(rightSystemRequest)).get(0);

                assertEquals(rightSystem.getName(), leftSystem.getSystemMapping().getRight().getName(),
                        leftSystem.getName() + "'s right system is not matching " + rightSystem.getName());
                assertEquals(leftSystem.getName(), rightSystem.getSystemMapping().getLeft().getName(),
                        rightSystem.getName() + "'s left system is not matching " + leftSystem.getName());
            }
        });
    }

    @Test
    void givenSystemHasABottomRightNeighboringSystem_thenNeighboringSystemHasCorrectTopLeftSystem() {
        List<System> systemList = systemRepository.findAll(systemSpecification.getSystem(new SystemRequest()));

        systemList.forEach(topLeftSystem -> {
            if(topLeftSystem.getSystemMapping() != null && topLeftSystem.getSystemMapping().getBottomRight() != null) {
                SystemRequest bottomRightSystemRequest = new SystemRequest();
                bottomRightSystemRequest.setId(topLeftSystem.getSystemMapping().getBottomRight().getId());

                System bottomRightSystem = systemRepository.findAll(systemSpecification.getSystem(bottomRightSystemRequest)).get(0);

                assertEquals(bottomRightSystem.getName(), topLeftSystem.getSystemMapping().getBottomRight().getName(),
                        topLeftSystem.getName() + "'s bottom right system is not matching " + bottomRightSystem.getName());
                assertEquals(topLeftSystem.getName(), bottomRightSystem.getSystemMapping().getTopLeft().getName(),
                        bottomRightSystem.getName() + "'s top left system is not matching " + topLeftSystem.getName());
            }
        });
    }

    @Test
    void givenSystemHasABottomNeighboringSystem_thenNeighboringSystemHasCorrectTopSystem() {
        List<System> systemList = systemRepository.findAll(systemSpecification.getSystem(new SystemRequest()));

        systemList.forEach(topSystem -> {
            if(topSystem.getSystemMapping() != null && topSystem.getSystemMapping().getBottom() != null) {
                SystemRequest bottomSystemRequest = new SystemRequest();
                bottomSystemRequest.setId(topSystem.getSystemMapping().getBottom().getId());

                System bottomSystem = systemRepository.findAll(systemSpecification.getSystem(bottomSystemRequest)).get(0);

                assertEquals(bottomSystem.getName(), topSystem.getSystemMapping().getBottom().getName(),
                        topSystem.getName() + " and " + bottomSystem.getName() + " has a mismatch");
                assertEquals(topSystem.getName(), bottomSystem.getSystemMapping().getTop().getName(),
                        bottomSystem.getName() + " and " + topSystem.getName() + " has a mismatch");
            }
        });
    }

    @Test
    void givenSystemHasABottomLeftNeighboringSystem_thenNeighboringSystemHasCorrectTopRightSystem() {
        List<System> systemList = systemRepository.findAll(systemSpecification.getSystem(new SystemRequest()));

        systemList.forEach(topRightSystem -> {
            if(topRightSystem.getSystemMapping() != null && topRightSystem.getSystemMapping().getBottomLeft() != null) {
                SystemRequest bottomLeftSystemRequest = new SystemRequest();
                bottomLeftSystemRequest.setId(topRightSystem.getSystemMapping().getBottomLeft().getId());

                System bottomLeftSystem = systemRepository.findAll(systemSpecification.getSystem(bottomLeftSystemRequest)).get(0);

                assertEquals(bottomLeftSystem.getName(), topRightSystem.getSystemMapping().getBottomLeft().getName(),
                        topRightSystem.getName() + " and " + bottomLeftSystem.getName() + " has a mismatch");
                assertEquals(topRightSystem.getName(), bottomLeftSystem.getSystemMapping().getTopRight().getName(),
                        bottomLeftSystem.getName() + " and " + topRightSystem.getName() + " has a mismatch");
            }
        });
    }
}
