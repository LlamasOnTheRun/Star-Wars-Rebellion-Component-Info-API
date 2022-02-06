package com.starwars.rebellion.ComponentInfoAPI.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_SYSTEMS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ActualSystemRepositoryTest {

    @Autowired
    SystemRepository systemRepository;

    @Test
    void givenAllSystemDataIsAdded_thenThirtyTwoSystemsAreReturned() {
        assertEquals(TOTAL_SYSTEMS, systemRepository.findAll().size());
    }
}
