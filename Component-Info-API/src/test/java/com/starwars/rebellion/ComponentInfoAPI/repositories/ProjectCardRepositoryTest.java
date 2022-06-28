package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ProjectCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.ProjectCardRequest;
import com.starwars.rebellion.ComponentInfoAPI.specification.ProjectCardSpecification;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProjectCardRepositoryTest {
   @Autowired
   ProjectCardRepository projectCardRepository;

   @Autowired
   ProjectCardSpecification projectCardSpecification;

    // Total project cards including copies

    @Test
    void givenProjectCardsAvailable_thenCardsIncludingCopiesShouldBeReturned(){
        ProjectCardRequest projectCardRequest = new ProjectCardRequest();
        List<ProjectCard> projectCardList =
                projectCardRepository.findAll(projectCardSpecification.getProjectCards(projectCardRequest));

        assertEquals(TOTAL_PROJECT_CARDS, projectCardList.stream().mapToInt(ProjectCard::getTotalInDeck).sum());
    }

   @Test
   void givenAllProjectCardsAreAvailable_thenAllProjectCardCountIsReturned(){
       ProjectCardRequest projectCardRequest = new ProjectCardRequest();

       assertEquals(TOTAL_UNIQUE_PROJECT_CARDS,
               projectCardRepository.findAll(projectCardSpecification.getProjectCards(projectCardRequest)).size());
   }

    /***************************
     * TotalInDeck Count Tests
     **************************/

   @Test
    void givenTotalInDeckIsOne_thenEquivalentCountIsReturned() {
        ProjectCardRequest projectCardRequest = new ProjectCardRequest();
        projectCardRequest.setTotalInDeck(1);

        List<ProjectCard> projectCardList =
                projectCardRepository.findAll(projectCardSpecification.getProjectCards(projectCardRequest));

        assertEquals(TOTAL_UNIQUE_PROJECT_CARDS_W_TOTAL_IN_GAME_ONE, projectCardList.size());
    }

    @Test
    void givenTotalInDeckIsTwo_thenEquivalentCountIsReturned() {
        ProjectCardRequest projectCardRequest = new ProjectCardRequest();
        projectCardRequest.setTotalInDeck(2);

        List<ProjectCard> projectCardList =
                projectCardRepository.findAll(projectCardSpecification.getProjectCards(projectCardRequest));

        assertEquals(TOTAL_UNIQUE_PROJECT_CARDS_W_TOTAL_IN_GAME_TWO, projectCardList.size());
    }

    @Test
    void givenTotalInDeckIsThree_thenEquivalentCountIsReturned() {
        ProjectCardRequest projectCardRequest = new ProjectCardRequest();
        projectCardRequest.setTotalInDeck(3);

        List<ProjectCard> projectCardList =
                projectCardRepository.findAll(projectCardSpecification.getProjectCards(projectCardRequest));

        assertEquals(TOTAL_UNIQUE_PROJECT_CARDS_W_TOTAL_IN_GAME_THREE, projectCardList.size());
    }
}
