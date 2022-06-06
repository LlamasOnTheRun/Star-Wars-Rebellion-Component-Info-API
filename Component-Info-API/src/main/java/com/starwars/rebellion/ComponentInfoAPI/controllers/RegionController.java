package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Region;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.ActionCardRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.RegionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.BASE_CONTROLLER_PATH;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.REGION_ENDPOINT;

@Controller
@RequestMapping(value=BASE_CONTROLLER_PATH)
@Slf4j
public class RegionController {
    @Autowired
    private RegionRepository regionRepository;

    @Autowired
    private RegionSpecification regionSpecification;

    @PostMapping(path= REGION_ENDPOINT)
    @ResponseBody
    public List<Region> getRegion(@RequestBody ActionCardRequest actionCardRequest) {
        log.info("Request Object: {}", actionCardRequest.toString());
        return regionRepository.findAll(regionSpecification.getRegion(actionCardRequest));
    }

    /*@GetMapping(path = ALL_ACTION_CARDS_ENDPOINT)TODO Implement the "all" controller for this controller
    @ResponseBody
    public List<ActionCard> getAllActionCards() {
        return actionCardRepository.findAll();
    }*/
}