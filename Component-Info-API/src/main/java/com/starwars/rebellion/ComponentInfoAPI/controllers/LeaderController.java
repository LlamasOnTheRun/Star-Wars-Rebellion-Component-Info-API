package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Leader;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.LeaderRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.LeaderRepository;
import com.starwars.rebellion.ComponentInfoAPI.specification.LeaderSpecification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.BASE_CONTROLLER_PATH;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.LEADER_ENDPOINT;

@Controller
@RequestMapping(value=BASE_CONTROLLER_PATH)
@Slf4j
public class LeaderController {

    @Autowired
    LeaderRepository leaderRepository;

    @Autowired
    LeaderSpecification leaderSpecification;

    @PostMapping(path=LEADER_ENDPOINT)
    @ResponseBody
    public List<Leader> getLeader(@RequestBody LeaderRequest leaderRequest) {
        log.info("Request Object: {}", leaderRequest.toString());
        return leaderRepository.findAll(leaderSpecification.getLeaders(leaderRequest));
    }

    //TODO add a controller for getting all leaders here
}