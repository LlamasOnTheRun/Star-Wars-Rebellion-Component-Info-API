package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.TacticCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.TacticCardRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.TacticCardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_UNIQUE_TACTIC_CARDS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TacticCardSpecificationTest {
    @Autowired
    private TacticCardRepository tacticCardRepository;
    @Autowired
    private TacticCardSpecification tacticCardSpecification;

    /***********
     * ID Tests
     ***********/

    @Test
    void givenIDIsNull_thenIDEqualPredicateIsNotAdded(){
        TacticCardRequest tacticCardRequest = new TacticCardRequest();
        tacticCardRequest.setId(null);

        List<TacticCard> tacticCardList =
                tacticCardRepository.findAll(tacticCardSpecification.getTacticCards(tacticCardRequest));
        assertEquals(TOTAL_UNIQUE_TACTIC_CARDS, tacticCardList.size());
    }

    @Test
    void givenIDIsLessThanOne_thenIDEqualPredicateIsNotAdded(){
        TacticCardRequest tacticCardRequest = new TacticCardRequest();
        tacticCardRequest.setId(0);

        List<TacticCard> tacticCardList =
                tacticCardRepository.findAll(tacticCardSpecification.getTacticCards(tacticCardRequest));
        assertEquals(TOTAL_UNIQUE_TACTIC_CARDS, tacticCardList.size());
    }

    @Test
    void givenIDDoesNotExist_thenIDEqualPredicateIsStillAdded(){
        TacticCardRequest tacticCardRequest = new TacticCardRequest();
        tacticCardRequest.setId(1);

        List<TacticCard> tacticCardList =
                tacticCardRepository.findAll(tacticCardSpecification.getTacticCards(tacticCardRequest));
        assertEquals(0, tacticCardList.size());
    }

    @Test
    void givenIDIsMoreThanZero_thenIDEqualPredicateIsAdded(){
        TacticCardRequest tacticCardRequest = new TacticCardRequest();
        tacticCardRequest.setId(192);

        List<TacticCard> tacticCardList =
                tacticCardRepository.findAll(tacticCardSpecification.getTacticCards(tacticCardRequest));
        assertEquals(1, tacticCardList.size());
    }

    /********************
     * Title Tests
     *******************/

    @Test
    void givenTitleIsNull_thenPredicateIsNotAdded(){
        TacticCardRequest tacticCardRequest = new TacticCardRequest();
        tacticCardRequest.setTitle(null);

        List<TacticCard> tacticCardList =
                tacticCardRepository.findAll(tacticCardSpecification.getTacticCards(tacticCardRequest));
        assertEquals(TOTAL_UNIQUE_TACTIC_CARDS, tacticCardList.size());
    }

    @Test
    void givenTitleIsEmpty_thenPredicateIsNotAdded(){
        TacticCardRequest tacticCardRequest = new TacticCardRequest();
        tacticCardRequest.setTitle("");

        List<TacticCard> tacticCardList =
                tacticCardRepository.findAll(tacticCardSpecification.getTacticCards(tacticCardRequest));
        assertEquals(TOTAL_UNIQUE_TACTIC_CARDS, tacticCardList.size());
    }

    @Test
    void givenTitleIsSimilar_thenPredicateIsAdded(){
        TacticCardRequest tacticCardRequest = new TacticCardRequest();
        tacticCardRequest.setTitle("Escape");

        List<TacticCard> tacticCardList =
                tacticCardRepository.findAll(tacticCardSpecification.getTacticCards(tacticCardRequest));
        assertEquals(2, tacticCardList.size());
        assertEquals("Escape Plan", tacticCardList.get(0).getCardText().getTitle());
        assertEquals("No Escape", tacticCardList.get(1).getCardText().getTitle());
    }

    @Test
    void givenTitleIsExact_thenPredicateIsAdded(){
        TacticCardRequest tacticCardRequest = new TacticCardRequest();
        tacticCardRequest.setTitle("Escape Plan");

        List<TacticCard> tacticCardList =
                tacticCardRepository.findAll(tacticCardSpecification.getTacticCards(tacticCardRequest));
        assertEquals(1, tacticCardList.size());
        assertEquals("Escape Plan", tacticCardList.get(0).getCardText().getTitle());
    }

    /********************
     * Tactic Type Tests
     *******************/

    @Test
    void givenTacticTypeIsNull_thenTypeEqualPredicateIsNotAdded(){
        TacticCardRequest tacticCardRequest = new TacticCardRequest();
        tacticCardRequest.setTacticType(null);

        List<TacticCard> tacticCardList =
                tacticCardRepository.findAll(tacticCardSpecification.getTacticCards(tacticCardRequest));
        assertEquals(TOTAL_UNIQUE_TACTIC_CARDS, tacticCardList.size());
    }
}
