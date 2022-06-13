package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.ProjectCardRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.io.StringWriter;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_UNIQUE_PROJECT_CARDS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProjectCardControllerTest {
    @Autowired
    ProjectCardController projectCardController;

    @Test
    void givenAllProjectCardDataIsAvailable_thenFiveCardsShouldReturn(){
        assertEquals(TOTAL_UNIQUE_PROJECT_CARDS, projectCardController.getAllProjectCards().size());
    }


    @Test
    void givenANearCompleteRequestForm_thenEquivalentCardShouldBeReturned() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        ProjectCardRequest projectCardRequest =
                objectMapper.readValue("{\"title\": \"Factory\"}\n\"totalInDeck\": 2}",
                        ProjectCardRequest.class);

        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer, projectCardController.getProjectCards(projectCardRequest));
        final String responseJson = writer.toString();

        assertEquals(1, StringUtils.countOccurrencesOf(responseJson, "\"id\":110"));
    }
}
