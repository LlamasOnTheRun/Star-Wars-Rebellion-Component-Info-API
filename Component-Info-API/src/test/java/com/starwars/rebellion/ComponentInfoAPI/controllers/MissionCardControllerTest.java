package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.MissionCardRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.io.StringWriter;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_UNIQUE_MISSION_CARDS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MissionCardControllerTest {
    @Autowired
    MissionCardController missionCardController;

    @Test
    void givenAllMissionCardDataIsAvailable_thenFiftyThreeCardsShouldBeReturned() {
        assertEquals(TOTAL_UNIQUE_MISSION_CARDS, missionCardController.getAllMissionCards().size());
    }

    @Test
    void givenANearCompleteRequestForm_thenEquivalentCardShouldBeReturned() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        MissionCardRequest missionCardRequest =
                objectMapper.readValue("{\"title\": \"For\"}\n\"faction\": \"REBEL\"}",
                        MissionCardRequest.class);

        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer, missionCardController.getMissionCards(missionCardRequest));
        final String responseJson = writer.toString();

        assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"id\":67"));
    }

}
