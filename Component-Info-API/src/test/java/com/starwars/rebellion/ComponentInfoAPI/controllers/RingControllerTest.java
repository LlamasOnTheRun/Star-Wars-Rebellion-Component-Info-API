package com.starwars.rebellion.ComponentInfoAPI.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RingControllerTest {
    @Autowired
    RingController ringController;

    @Test
    void givenRingTitleAvailable_thenTitleIsReturned(){
        Assertions.assertEquals("C3PO", ringController.getRing());
    }

}
