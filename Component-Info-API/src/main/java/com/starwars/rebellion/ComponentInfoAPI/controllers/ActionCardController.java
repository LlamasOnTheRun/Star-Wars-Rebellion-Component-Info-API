package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ActionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.ActionCardRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.ActionCardRepository;
import com.starwars.rebellion.ComponentInfoAPI.specification.ActionCardSpecification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;

@Controller
@RequestMapping(value=BASE_CONTROLLER_PATH)
@Slf4j
public class ActionCardController {
    @Autowired
    private ActionCardRepository actionCardRepository;

    @Autowired
    private ActionCardSpecification actionCardSpecification;

    @PostMapping(path= ACTION_CARD_ENDPOINT)
    @ResponseBody
    public List<ActionCard> getActionCard(@RequestBody ActionCardRequest actionCardRequest) {
        log.info("Request Object: {}", actionCardRequest.toString());
        return actionCardRepository.findAll(actionCardSpecification.getActionCards(actionCardRequest));
    }

    @GetMapping(path = ALL_ACTION_CARDS_ENDPOINT)
    @ResponseBody
    public List<ActionCard> getAllActionCards() {
        return actionCardRepository.findAll();
    }
}