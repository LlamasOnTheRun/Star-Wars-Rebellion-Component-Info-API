package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.UnitRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.io.StringWriter;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_UNIQUE_UNITS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UnitControllerTest {
    @Autowired
    UnitController unitController;

    @Test
    void givenAllUnitDataIsAvailable_thenFiftyThreeCardsShouldBeReturned() {
        assertEquals(TOTAL_UNIQUE_UNITS, unitController.getAllUnits().size());
    }

    @Test
    void givenANearCompleteRequestForm_thenEquivalentUnitShouldBeReturned() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        UnitRequest unitRequest =
                objectMapper.readValue("{\"title\": \"Rebel Trooper\"}",
                        UnitRequest.class);

        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer, unitController.getUnits(unitRequest));
        final String responseJson = writer.toString();

        assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"id\":174"));
    }
}
