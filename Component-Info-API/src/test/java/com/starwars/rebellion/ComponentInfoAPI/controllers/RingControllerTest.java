package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.RingRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.io.StringWriter;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_RINGS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RingControllerTest {
    @Autowired
    RingController ringController;

    @Test
    void givenRingTitleAvailable_thenTitleIsReturned() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        RingRequest ringRequest = objectMapper.readValue("{\"title\": \"C3PO\"}", RingRequest.class);

        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer, ringController.getRings(ringRequest));
        final String responseJson = writer.toString();

        assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"title\":\"C3PO\""));
    }

    @Test
    void givenAllRingDataIsAvailable_thenSevenRingsShouldBeReturned(){
        assertEquals(TOTAL_RINGS, ringController.getAllRings().size());
    }

    @Test
    void givenStringIDIsProvidedInJsonRequest_thenIDEqualRingIsReturned() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        RingRequest ringRequest = objectMapper.readValue("{\"id\": \"61\" }", RingRequest.class);

        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer, ringController.getRings(ringRequest));
        final String responseJson = writer.toString();

        assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"id\":61"));
    }

    @Test
    void givenIntIDIsProvidedInJsonRequest_thenIDEqualRingIsReturned() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        RingRequest ringRequest = objectMapper.readValue("{\"id\": 61 }", RingRequest.class);

        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer, ringController.getRings(ringRequest));
        final String responseJson = writer.toString();

        assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"id\":61"));
    }
}
