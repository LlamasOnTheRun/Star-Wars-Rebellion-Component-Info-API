package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Ring;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.RingRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_RINGS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RingControllerTest {
    @Autowired
    RingController ringController;

    @Test
    void givenAllRingDataIsAvailable_thenSevenRingsShouldBeReturned(){
        assertEquals(TOTAL_RINGS, ringController.getAllRings().size());
    }

    @Test
    void givenIntIDIsProvidedInJsonRequest_thenIDEqualRingIsReturned(){
        RingRequest ringRequest = new RingRequest();
        ringRequest.setId(60);

        List<Ring> ringList = ringController.getRings(ringRequest);
        assertEquals("C3PO", ringList.get(0).getTitle());
    }

    @Test
    void givenRingTitleAvailable_thenEquivalentIDIsReturned(){
        RingRequest ringRequest = new RingRequest();
        ringRequest.setTitle("C3PO");

        List<Ring> ringList = ringController.getRings(ringRequest);
        assertEquals(60, ringList.get(0).getId());
    }
}
