package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ProjectCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.ProjectCardRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.ProjectCardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_UNIQUE_PROJECT_CARDS;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_UNIQUE_PROJECT_CARDS_W_TOTAL_IN_GAME_ONE;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProjectCardSpecificationTest {
    @Autowired
    private ProjectCardRepository projectCardRepository;

    @Autowired
    private ProjectCardSpecification projectCardSpecification;

    /********
     ID tests
     *********/

    @Test
    void givenIDIsLessThanOne_thenIDEqualPredicateIsNotAdded(){
        ProjectCardRequest projectCardRequest = new ProjectCardRequest();
        projectCardRequest.setId(0);

        List<ProjectCard> projectCardList = projectCardRepository.findAll(projectCardSpecification.getProjectCards(projectCardRequest));

        assertEquals(TOTAL_UNIQUE_PROJECT_CARDS, projectCardList.size());
    }

    @Test
    void givenIDIsNull_thenIDEqualPredicateIsNotAdded(){
        ProjectCardRequest projectCardRequest = new ProjectCardRequest();
        projectCardRequest.setId(null);

        List<ProjectCard> projectCardList = projectCardRepository.findAll(projectCardSpecification.getProjectCards(projectCardRequest));

        assertEquals(TOTAL_UNIQUE_PROJECT_CARDS, projectCardList.size());
    }

    @Test
    void givenIDIsMoreThanZero_thenIDEqualPredicateIsAdded(){
        ProjectCardRequest projectCardRequest = new ProjectCardRequest();
        projectCardRequest.setId(114);

        List<ProjectCard> projectCardList = projectCardRepository.findAll(projectCardSpecification.getProjectCards(projectCardRequest));

        assertEquals(1, projectCardList.size());
    }

    @Test
    void givenIDDoesNotExist_thenIDEqualPredicateIsStillAdded(){
        ProjectCardRequest projectCardRequest = new ProjectCardRequest();
        projectCardRequest.setId(1);

        List<ProjectCard> projectCardList = projectCardRepository.findAll(projectCardSpecification.getProjectCards(projectCardRequest));

        assertEquals(0, projectCardList.size());
    }

    /**************
     Title tests
     **************/

    @Test
    void givenTitleIsSimilar_thenTitlePredicateIsAdded() {
        ProjectCardRequest projectCardRequest = new ProjectCardRequest();
        projectCardRequest.setTitle("Factory");

        List<ProjectCard> projectCardList = projectCardRepository.findAll(projectCardSpecification.getProjectCards(projectCardRequest));

        assertEquals(1, projectCardList.size());
        assertEquals("Construct Factory", projectCardList.get(0).getCardText().getTitle());
    }

    @Test
    void givenTitleIsExact_thenTitlePredicateIsAdded() {
        ProjectCardRequest projectCardRequest = new ProjectCardRequest();
        projectCardRequest.setTitle("Construct Factory ");

        List<ProjectCard> projectCardList = projectCardRepository.findAll(projectCardSpecification.getProjectCards(projectCardRequest));

        assertEquals(1, projectCardList.size());
    }

    @Test
    void givenTitleIsNull_thenTitlePredicateIsNotAdded() {
        ProjectCardRequest projectCardRequest = new ProjectCardRequest();
        projectCardRequest.setTitle(null);

        List<ProjectCard> projectCardList = projectCardRepository.findAll(projectCardSpecification.getProjectCards(projectCardRequest));

        assertEquals(TOTAL_UNIQUE_PROJECT_CARDS, projectCardList.size());
    }

    @Test
    void givenTitleIsBlank_thenTitlePredicateIsNotAdded() {
        ProjectCardRequest projectCardRequest = new ProjectCardRequest();
        projectCardRequest.setTitle("");

        List<ProjectCard> projectCardList = projectCardRepository.findAll(projectCardSpecification.getProjectCards(projectCardRequest));

        assertEquals(TOTAL_UNIQUE_PROJECT_CARDS, projectCardList.size());
    }

    /**************************
     TotalInDeck Tests
     **************************/

    @Test
    void givenTotalInDeckIsNull_thenPredicateIsNotAdded() {
        ProjectCardRequest projectCardRequest = new ProjectCardRequest();
        projectCardRequest.setTotalInDeck(null);

        List<ProjectCard> projectCardList = projectCardRepository.findAll(projectCardSpecification.getProjectCards(projectCardRequest));

        assertEquals(TOTAL_UNIQUE_PROJECT_CARDS, projectCardList.size());
    }

    @Test
    void givenTotalInDeckIsLessThanOne_thenPredicateIsNotAdded() {
        ProjectCardRequest projectCardRequest = new ProjectCardRequest();
        projectCardRequest.setTotalInDeck(0);

        List<ProjectCard> projectCardList = projectCardRepository.findAll(projectCardSpecification.getProjectCards(projectCardRequest));

        assertEquals(TOTAL_UNIQUE_PROJECT_CARDS, projectCardList.size());
    }

    @Test
    void givenTotalInDeckIsMoreThanZero_thenPredicatesAreAdded() {
        ProjectCardRequest projectCardRequest = new ProjectCardRequest();
        projectCardRequest.setTotalInDeck(1);

        List<ProjectCard> projectCardList = projectCardRepository.findAll(projectCardSpecification.getProjectCards(projectCardRequest));

        assertEquals(TOTAL_UNIQUE_PROJECT_CARDS_W_TOTAL_IN_GAME_ONE, projectCardList.size());
    }
}
