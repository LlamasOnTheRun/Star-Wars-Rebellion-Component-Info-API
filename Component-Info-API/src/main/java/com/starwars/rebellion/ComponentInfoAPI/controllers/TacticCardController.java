package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.TacticCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.TacticCardRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.TacticCardRepository;
import com.starwars.rebellion.ComponentInfoAPI.specification.TacticCardSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;

@Controller
@RequestMapping(value=BASE_CONTROLLER_PATH)
public class TacticCardController {
    @Autowired
    private TacticCardRepository tacticCardRepository;
    @Autowired
    private TacticCardSpecification tacticCardSpecification;

    @PostMapping(path = TACTIC_CARD_ENDPOINT)
    @ResponseBody
    public List<TacticCard> getTacticCards(@RequestBody TacticCardRequest tacticCardRequest){
        return tacticCardRepository.findAll(tacticCardSpecification.getTacticCards(tacticCardRequest));
    }

    @GetMapping(path=GET_ALL_TACTIC_CARD_ENDPOINT)
    @ResponseBody
    public List<TacticCard> getAllTacticCards(){
        return tacticCardRepository.findAll();
    }
}
