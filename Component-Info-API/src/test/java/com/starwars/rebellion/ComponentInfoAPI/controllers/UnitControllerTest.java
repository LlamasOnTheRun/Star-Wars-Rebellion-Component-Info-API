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
    void givenANearCompleteRequestFormWithID_thenEquivalentUnitShouldBeReturned() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        UnitRequest unitRequest =
                objectMapper.readValue("{\"id\": 174}",
                        UnitRequest.class);

        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer, unitController.getUnits(unitRequest));
        final String responseJson = writer.toString();

        assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"title\":\"Rebel Trooper\""));
    }

    @Test
    void givenANearCompleteRequestFormWithTitle_thenEquivalentUnitShouldBeReturned() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        UnitRequest unitRequest =
                objectMapper.readValue("{\"title\": \"Rebel Trooper\"}",
                        UnitRequest.class);

        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer, unitController.getUnits(unitRequest));
        final String responseJson = writer.toString();

        assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"id\":174"));
    }

    @Test
    void givenANearCompleteRequestFormWithFaction_thenEquivalentUnitShouldBeReturned() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        UnitRequest unitRequest =
                objectMapper.readValue("{\"faction\": \"REBEL\"}",
                        UnitRequest.class);

        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer, unitController.getUnits(unitRequest));
        final String responseJson = writer.toString();

        assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"id\":174"));
    }

    @Test
    void givenANearCompleteRequestFormWithUnitType_thenEquivalentUnitShouldBeReturned() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        UnitRequest unitRequest =
                objectMapper.readValue("{\"unitType\": \"GROUND\"}",
                        UnitRequest.class);

        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer, unitController.getUnits(unitRequest));
        final String responseJson = writer.toString();

        assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"id\":174"));
    }

    @Test
    void givenANearCompleteRequestFormWithProductionType_thenEquivalentUnitShouldBeReturned() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        UnitRequest unitRequest =
                objectMapper.readValue("{\"productionType\": \"LIGHT\"}",
                        UnitRequest.class);

        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer, unitController.getUnits(unitRequest));
        final String responseJson = writer.toString();

        assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"id\":174"));
    }

    @Test
    void givenANearCompleteRequestFormWithBlackDie_thenEquivalentUnitShouldBeReturned() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        UnitRequest unitRequest =
                objectMapper.readValue("{\"blackDie\": 1}",
                        UnitRequest.class);

        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer, unitController.getUnits(unitRequest));
        final String responseJson = writer.toString();

        assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"id\":174"));
    }

    @Test
    void givenANearCompleteRequestFormWithRedDie_thenEquivalentUnitShouldBeReturned() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        UnitRequest unitRequest =
                objectMapper.readValue("{\"redDie\": 0}",
                        UnitRequest.class);

        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer, unitController.getUnits(unitRequest));
        final String responseJson = writer.toString();

        assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"id\":174"));
    }

    @Test
    void givenANearCompleteRequestFormWithHealth_thenEquivalentUnitShouldBeReturned() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        UnitRequest unitRequest =
                objectMapper.readValue("{\"health\": 1}",
                        UnitRequest.class);

        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer, unitController.getUnits(unitRequest));
        final String responseJson = writer.toString();

        assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"id\":174"));
    }

    @Test
    void givenANearCompleteRequestFormWithHealthColor_thenEquivalentUnitShouldBeReturned() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        UnitRequest unitRequest =
                objectMapper.readValue("{\"healthColor\": \"B\"}",
                        UnitRequest.class);

        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer, unitController.getUnits(unitRequest));
        final String responseJson = writer.toString();

        assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"id\":174"));
    }

    @Test
    void givenANearCompleteRequestFormWithShipCarryingCapacity_thenEquivalentUnitShouldBeReturned() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        UnitRequest unitRequest =
                objectMapper.readValue("{\"shipCarryingCapacity\": 0}",
                        UnitRequest.class);

        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer, unitController.getUnits(unitRequest));
        final String responseJson = writer.toString();

        assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"id\":174"));
    }

    @Test
    void givenANearCompleteRequestFormWithInvincible_thenEquivalentUnitShouldBeReturned() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        UnitRequest unitRequest =
                objectMapper.readValue("{\"invincible\": false}",
                        UnitRequest.class);

        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer, unitController.getUnits(unitRequest));
        final String responseJson = writer.toString();

        assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"id\":174"));
    }

    @Test
    void givenANearCompleteRequestFormWithNeedsTransport_thenEquivalentUnitShouldBeReturned() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        UnitRequest unitRequest =
                objectMapper.readValue("{\"needsTransport\": true}",
                        UnitRequest.class);

        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer, unitController.getUnits(unitRequest));
        final String responseJson = writer.toString();

        assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"id\":174"));
    }

    @Test
    void givenANearCompleteRequestFormWithStructure_thenEquivalentUnitShouldBeReturned() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        UnitRequest unitRequest =
                objectMapper.readValue("{\"structure\": false}",
                        UnitRequest.class);

        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer, unitController.getUnits(unitRequest));
        final String responseJson = writer.toString();

        assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"id\":174"));
    }

    @Test
    void givenANearCompleteRequestFormWithTotalInGame_thenEquivalentUnitShouldBeReturned() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        UnitRequest unitRequest =
                objectMapper.readValue("{\"totalInGame\": 15}",
                        UnitRequest.class);

        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer, unitController.getUnits(unitRequest));
        final String responseJson = writer.toString();

        assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"id\":174"));
    }
}
