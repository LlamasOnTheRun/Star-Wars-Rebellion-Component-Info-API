package com.starwars.rebellion.ComponentInfoAPI.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ActualSystemRepositoryTest {

    @Autowired
    SystemRepository systemRepository;

    @Test
    void givenAllSystemDataIsAdded_thenThirtyTwoSystemsAreReturned() {
        assertEquals(32, systemRepository.findAll().size());
    }
}
