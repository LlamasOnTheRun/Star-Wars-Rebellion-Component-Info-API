package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.repositorys.ActionCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.BASE_CONTROLLER_PATH;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.GET_ACTION_CARD_ENDPOINT;

@Controller
@RequestMapping(value=BASE_CONTROLLER_PATH)
public class ActionCardController {
    @Autowired
    private ActionCardRepository actionCardRepository;

    @GetMapping(path=GET_ACTION_CARD_ENDPOINT)
    @ResponseBody
    public String getActionCard() {
        return actionCardRepository.findByCardTextTitle("Undercover").getCardText().getTitle();
    }
}