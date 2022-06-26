package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ObjectiveCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.ObjectiveCardRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.ObjectiveCardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ObjectiveCardSpecificationTest {

    @Autowired
    private ObjectiveCardSpecification objectiveCardSpecification;

    @Autowired
    private ObjectiveCardRepository objectiveCardRepository;

    @Test
    void givenIDIsLessThanOne_thenPredicateIsNotAdded() {
        ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
        objectiveCardRequest.setId(0);

        List<ObjectiveCard> objectiveCardList = objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest));

        assertEquals(TOTAL_OBJECTIVE_CARDS, objectiveCardList.size());
    }

    @Test
    void givenIDIsNull_thenPredicateIsNotAdded() {
        ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
        objectiveCardRequest.setId(null);

        List<ObjectiveCard> objectiveCardList = objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest));

        assertEquals(TOTAL_OBJECTIVE_CARDS, objectiveCardList.size());
    }

    @Test
    void givenValidIDIsAdded_thenPredicateIsAdded() {
        ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
        objectiveCardRequest.setId(INSPIRE_SYMPATHY_OBJECTIVE_CARD_ID);

        List<ObjectiveCard> objectiveCardList = objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest));

        assertEquals(1, objectiveCardList.size());
    }

    @Test
    void givenTitleIsNull_thenPredicateIsNotAdded() {
        ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
        objectiveCardRequest.setTitle(null);

        List<ObjectiveCard> objectiveCardList = objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest));

        assertEquals(TOTAL_OBJECTIVE_CARDS, objectiveCardList.size());
    }

    @Test
    void givenTitleIsBlank_thenPredicateIsNotAdded() {
        ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
        objectiveCardRequest.setTitle("");

        List<ObjectiveCard> objectiveCardList = objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest));

        assertEquals(TOTAL_OBJECTIVE_CARDS, objectiveCardList.size());
    }

    @Test
    void givenValidTitleIsAdded_thenPredicateIsAdded() {
        ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
        objectiveCardRequest.setTitle(INSPIRE_SYMPATHY_OBJECTIVE_CARD_TITLE);

        List<ObjectiveCard> objectiveCardList = objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest));

        assertEquals(1, objectiveCardList.size());
    }

    @Test
    void givenSimilarTitleIsAdded_thenPredicateIsAdded() {
        ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
        objectiveCardRequest.setTitle("Inspire");

        List<ObjectiveCard> objectiveCardList = objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest));

        assertEquals(1, objectiveCardList.size());
        assertEquals(INSPIRE_SYMPATHY_OBJECTIVE_CARD_TITLE, objectiveCardList.get(0).getCardText().getTitle());
    }

    @Test
    void givenLevelOneIsNull_thenPredicateIsNotAdded() {
        ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
        objectiveCardRequest.setDeckLevelOne(null);

        List<ObjectiveCard> objectiveCardList = objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest));

        assertEquals(TOTAL_OBJECTIVE_CARDS, objectiveCardList.size());
    }

    @Test
    void givenLevelOneIsFalse_thenPredicateIsNotAdded() {
        ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
        objectiveCardRequest.setDeckLevelOne(false);

        List<ObjectiveCard> objectiveCardList = objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest));

        assertEquals(TOTAL_OBJECTIVE_CARDS, objectiveCardList.size());
    }

    @Test
    void givenLevelOneIsTrue_thenPredicateIsAdded() {
        ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
        objectiveCardRequest.setDeckLevelOne(true);

        List<ObjectiveCard> objectiveCardList = objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest));

        assertEquals(TOTAL_LEVEL_ONE_OBJECTIVE_CARDS, objectiveCardList.size());
    }

    @Test
    void givenLevelTwoIsNull_thenPredicateIsNotAdded() {
        ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
        objectiveCardRequest.setDeckLevelTwo(null);

        List<ObjectiveCard> objectiveCardList = objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest));

        assertEquals(TOTAL_OBJECTIVE_CARDS, objectiveCardList.size());
    }

    @Test
    void givenLevelTwoIsFalse_thenPredicateIsNotAdded() {
        ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
        objectiveCardRequest.setDeckLevelTwo(false);

        List<ObjectiveCard> objectiveCardList = objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest));

        assertEquals(TOTAL_OBJECTIVE_CARDS, objectiveCardList.size());
    }

    @Test
    void givenLevelTwoIsTrue_thenPredicateIsAdded() {
        ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
        objectiveCardRequest.setDeckLevelTwo(true);

        List<ObjectiveCard> objectiveCardList = objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest));

        assertEquals(TOTAL_LEVEL_TWO_OBJECTIVE_CARDS, objectiveCardList.size());
    }

    @Test
    void givenLevelThreeIsNull_thenPredicateIsNotAdded() {
        ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
        objectiveCardRequest.setDeckLevelThree(null);

        List<ObjectiveCard> objectiveCardList = objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest));

        assertEquals(TOTAL_OBJECTIVE_CARDS, objectiveCardList.size());
    }

    @Test
    void givenLevelThreeIsFalse_thenPredicateIsNotAdded() {
        ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
        objectiveCardRequest.setDeckLevelThree(false);

        List<ObjectiveCard> objectiveCardList = objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest));

        assertEquals(TOTAL_OBJECTIVE_CARDS, objectiveCardList.size());
    }

    @Test
    void givenLevelThreeIsTrue_thenPredicateIsAdded() {
        ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
        objectiveCardRequest.setDeckLevelThree(true);

        List<ObjectiveCard> objectiveCardList = objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest));

        assertEquals(TOTAL_LEVEL_THREE_OBJECTIVE_CARDS, objectiveCardList.size());
    }
}
