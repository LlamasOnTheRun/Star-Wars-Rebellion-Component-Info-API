package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ActionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.ActionCardRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.ActionCardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

        assertEquals(TOTAL_ACTION_CARDS, actionCardList.size());
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
        ActionCardRequest actionCardRequest = new ActionCardRequest();
        actionCardRequest.setFaction(Faction.IMPERIAL);

        List<ActionCard> actionCardList = actionCardRepository.findAll(actionCardSpecification.getActionCards(actionCardRequest));

        assertEquals(TOTAL_EMPIRE_ACTION_CARDS, actionCardList.size());
    }

    @Test
    void givenFactionIsRebel_thenFactionEqualPredicateIsAdded() {
        ActionCardRequest actionCardRequest = new ActionCardRequest();
        actionCardRequest.setFaction(Faction.REBEL);

        List<ActionCard> actionCardList = actionCardRepository.findAll(actionCardSpecification.getActionCards(actionCardRequest));

        assertEquals(TOTAL_REBEL_ACTION_CARDS, actionCardList.size());
    }

    @Test
    void givenFactionIsNull_thenFactionEqualPredicateIsNotAdded() {
        ActionCardRequest actionCardRequest = new ActionCardRequest();
        actionCardRequest.setFaction(null);

        List<ActionCard> actionCardList = actionCardRepository.findAll(actionCardSpecification.getActionCards(actionCardRequest));

        assertEquals(TOTAL_ACTION_CARDS, actionCardList.size());
    }

    @Test
    void givenTitleIsSimilar_thenTitlePredicateIsAdded() {
        ActionCardRequest actionCardRequest = new ActionCardRequest();
        actionCardRequest.setTitle("To");

        List<ActionCard> actionCardList = actionCardRepository.findAll(actionCardSpecification.getActionCards(actionCardRequest));

        assertEquals(1, actionCardList.size());
        assertEquals("According\nTo My Design\n",
                actionCardList.get(0).getActionCardText().getTitle());
    }

    @Test
    void givenTitleIsExact_thenTitlePredicateIsAdded() {
        ActionCardRequest actionCardRequest = new ActionCardRequest();
        actionCardRequest.setTitle("Brilliant\nAdministrator\n");

        List<ActionCard> actionCardList = actionCardRepository.findAll(actionCardSpecification.getActionCards(actionCardRequest));

        assertEquals(1, actionCardList.size());
    }

    @Test
    void givenTitleWithoutNewlines_thenTitlePredicateIsAdded() {
        ActionCardRequest actionCardRequest = new ActionCardRequest();
        actionCardRequest.setTitle("The Millennium Falcon");

        List<ActionCard> actionCardList = actionCardRepository.findAll(actionCardSpecification.getActionCards(actionCardRequest));

        assertEquals(1, actionCardList.size());
    }

    @Test
    void givenTitleIsNull_thenTitlePredicateIsNotAdded() {
        ActionCardRequest actionCardRequest = new ActionCardRequest();
        actionCardRequest.setTitle(null);

        List<ActionCard> actionCardList = actionCardRepository.findAll(actionCardSpecification.getActionCards(actionCardRequest));

        assertEquals(TOTAL_ACTION_CARDS, actionCardList.size());
    }

    @Test
    void givenTitleIsBlank_thenTitlePredicateIsNotAdded() {
        ActionCardRequest actionCardRequest = new ActionCardRequest();
        actionCardRequest.setTitle("");

        List<ActionCard> actionCardList = actionCardRepository.findAll(actionCardSpecification.getActionCards(actionCardRequest));

        assertEquals(TOTAL_ACTION_CARDS, actionCardList.size());
    }

    @Test
    void givenStartingCardIsTrue_thenStartingCardPredicateIsAdded() {
        ActionCardRequest actionCardRequest = new ActionCardRequest();
        actionCardRequest.setStartingCard(true);

        List<ActionCard> actionCardList = actionCardRepository.findAll(actionCardSpecification.getActionCards(actionCardRequest));

        assertEquals(TOTAL_STARTING_REBEL_ACTION_CARDS + TOTAL_STARTING_EMPIRE_ACTION_CARDS, actionCardList.size());
    }

    @Test
    void givenStartingCardIsFalse_thenStartingCardPredicateIsAdded() {
        ActionCardRequest actionCardRequest = new ActionCardRequest();
        actionCardRequest.setStartingCard(false);

        List<ActionCard> actionCardList = actionCardRepository.findAll(actionCardSpecification.getActionCards(actionCardRequest));

        assertEquals(TOTAL_NON_STARTING_EMPIRE_ACTION_CARDS + TOTAL_NON_STARTING_REBEL_ACTION_CARDS, actionCardList.size());
    }

    @Test
    void givenStartingCardIsNull_thenStartingCardPredicateIsNotAdded() {
        ActionCardRequest actionCardRequest = new ActionCardRequest();
        actionCardRequest.setStartingCard(null);

        List<ActionCard> actionCardList = actionCardRepository.findAll(actionCardSpecification.getActionCards(actionCardRequest));

        assertEquals(TOTAL_ACTION_CARDS, actionCardList.size());
    }
}
