package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ActionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.ActionCardRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.ActionCardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;

@Controller
@RequestMapping(value=BASE_CONTROLLER_PATH)
@Slf4j
public class ActionCardController {
    @Autowired
    private ActionCardRepository actionCardRepository;

    @PostMapping(path= ACTION_CARD_ENDPOINT)
    @ResponseBody
    public String getActionCard(ActionCardRequest actionCardRequest) {
        log.info("Request Object: {}", actionCardRequest.toString());
        return actionCardRepository.findByActionCardTextTitle("Undercover").getActionCardText().getTitle();
    }

    @GetMapping(path=GET_ALL_REBEL_ACTION_CARDS_ENDPOINT)
    @ResponseBody
    public List<ActionCard> getAllActionCards() {
        return (List<ActionCard>) actionCardRepository.findAll();
    }
}