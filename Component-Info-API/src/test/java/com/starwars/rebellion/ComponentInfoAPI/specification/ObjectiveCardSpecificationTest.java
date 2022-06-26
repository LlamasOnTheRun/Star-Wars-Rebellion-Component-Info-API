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
    void givenIDIsLessThanOne_thenIDEqualPredicateIsNotAdded() {
        ObjectiveCardRequest objectiveCardRequest = new ObjectiveCardRequest();
        objectiveCardRequest.setId(0);

        List<ObjectiveCard> objectiveCardList = objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest));

        assertEquals(TOTAL_OBJECTIVE_CARDS, objectiveCardList.size());
    }
}
