package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ActionCard;
import com.starwars.rebellion.ComponentInfoAPI.repositories.ActionCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;

@Controller
@RequestMapping(value=BASE_CONTROLLER_PATH)
public class ActionCardController {
    @Autowired
    private ActionCardRepository actionCardRepository;

    @GetMapping(path=GET_ACTION_CARD_ENDPOINT)
    @ResponseBody
    public String getActionCard() {
        return actionCardRepository.findByActionCardTextTitle("Undercover").getActionCardText().getTitle();
    }

    @GetMapping(path=GET_ALL_REBEL_ACTION_CARDS_ENDPOINT)
    @ResponseBody
    public List<ActionCard> getAllActionCards() {
        return (List<ActionCard>) actionCardRepository.findAll();
    }
}