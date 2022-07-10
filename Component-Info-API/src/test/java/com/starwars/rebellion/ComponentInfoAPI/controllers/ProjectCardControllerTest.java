package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ProjectCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.ProjectCardRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_UNIQUE_PROJECT_CARDS;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_UNIQUE_PROJECT_CARDS_W_TOTAL_IN_GAME_ONE;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProjectCardControllerTest {
    @Autowired
    ProjectCardController projectCardController;

    @Test
    void givenAllProjectCardDataIsAvailable_thenFiveCardsShouldReturn() {
        assertEquals(TOTAL_UNIQUE_PROJECT_CARDS, projectCardController.getAllProjectCards().size());
    }

    @Test
    void givenANearCompleteRequestFormWithID_thenEquivalentCardShouldBeReturned(){
        ProjectCardRequest projectCardRequest = new ProjectCardRequest();
        projectCardRequest.setId(110);

        List<ProjectCard> projectCardList = projectCardController.getProjectCards(projectCardRequest);
        assertEquals("Construct Factory", projectCardList.get(0).getCardText().getTitle());
    }

    @Test
    void givenANearCompleteRequestFormWithTitle_thenEquivalentCardShouldBeReturned(){
        ProjectCardRequest projectCardRequest = new ProjectCardRequest();
        projectCardRequest.setTitle("Factory");

        List<ProjectCard> projectCardList = projectCardController.getProjectCards(projectCardRequest);
        assertEquals(110, projectCardList.get(0).getId());
    }

    @Test
    void givenANearCompleteRequestFormWithTotalInDeck_thenEquivalentCountShouldBeReturned(){
        ProjectCardRequest projectCardRequest = new ProjectCardRequest();
        projectCardRequest.setTotalInDeck(1);

        List<ProjectCard> projectCardList = projectCardController.getProjectCards(projectCardRequest);
        assertEquals(TOTAL_UNIQUE_PROJECT_CARDS_W_TOTAL_IN_GAME_ONE, projectCardList.size());
    }
}
