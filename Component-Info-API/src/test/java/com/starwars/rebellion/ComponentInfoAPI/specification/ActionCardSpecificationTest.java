package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ActionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.ActionCardRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.ActionCardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ActionCardSpecificationTest {

    @Autowired
    private ActionCardSpecification actionCardSpecification;
    @Autowired
    private ActionCardRepository actionCardRepository;

    @Test
    void givenIDIsLessThanOne_thenIDEqualPredicateIsNotAdded() {
        ActionCardRequest actionCardRequest = new ActionCardRequest();
        actionCardRequest.setId(0);

        List<ActionCard> actionCardList = actionCardRepository.findAll(actionCardSpecification.getActionCards(actionCardRequest));

        assertTrue(actionCardList.size() > 1);
    }

    @Test
    void givenIDIsGreaterThanZero_thenIDEqualPredicateIsAdded() {
        ActionCardRequest actionCardRequest = new ActionCardRequest();
        actionCardRequest.setId(26);

        List<ActionCard> actionCardList = actionCardRepository.findAll(actionCardSpecification.getActionCards(actionCardRequest));

        assertEquals(1, actionCardList.size());
    }

    @Test
    void givenIDDoesNotExist_thenIDEqualPredicateIsStillAdded() {
        ActionCardRequest actionCardRequest = new ActionCardRequest();
        actionCardRequest.setId(1);

        List<ActionCard> actionCardList = actionCardRepository.findAll(actionCardSpecification.getActionCards(actionCardRequest));

        assertEquals(0, actionCardList.size());
    }

    @Test
    void givenFactionIsEmpire_thenFactionEqualPredicateIsAdded() {

    }

    @Test
    void givenFactionIsRebel_thenFactionEqualPredicateIsAdded() {

    }

    @Test
    void givenFactionIsBlank_thenFactionEqualPredicateIsNotAdded() {

    }

    @Test
    void givenFactionIsNull_thenFactionEqualPredicateIsNotAdded() {

    }

    @Test
    void givenTitleIsSimilar_thenTitlePredicateIsAdded() {

    }

    @Test
    void givenTitleIsExact_thenTitlePredicateIsAdded() {

    }

    @Test
    void givenTitleIsNull_thenTitlePredicateIsNotAdded() {

    }
}
