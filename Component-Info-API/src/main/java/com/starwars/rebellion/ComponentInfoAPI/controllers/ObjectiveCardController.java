package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ObjectiveCard;
import com.starwars.rebellion.ComponentInfoAPI.repositories.ObjectiveCardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;

@Controller
@RequestMapping(value=BASE_CONTROLLER_PATH)
@Slf4j
public class ObjectiveCardController {

    @Autowired
    private ObjectiveCardRepository objectiveCardRepository;

    @Autowired
    private ObjectiveCardSpecification objectiveCardSpecification;

    @PostMapping(path = OBJECTIVE_CARD_ENDPOINT)
    @ResponseBody
    public List<ObjectiveCard> getObjectiveCard(@RequestBody ObjectiveCardRequest objectiveCardRequest) {
        log.info("Request Object: {}", objectiveCardRequest.toString());
        return objectiveCardRepository.findAll(objectiveCardSpecification.getObjectiveCard(objectiveCardRequest));
    }

    @GetMapping(path = ALL_OBJECTIVE_CARDS_ENDPOINT)
    @ResponseBody
    public List<ObjectiveCard> getAllObjectiveCards() {
        return objectiveCardRepository.findAll();
    }
}