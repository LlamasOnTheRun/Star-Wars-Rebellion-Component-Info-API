package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.Leader;
import com.starwars.rebellion.ComponentInfoAPI.repositorys.LeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.BASE_CONTROLLER_PATH;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.GET_LEADER_ENDPOINT;

@Controller
@RequestMapping(value=BASE_CONTROLLER_PATH)
public class LeaderController {
    @Autowired
    LeaderRepository leaderRepository;

    @GetMapping(path=GET_LEADER_ENDPOINT)
    @ResponseBody
    public String getLeader() {
        Leader leader = new Leader();
        return leaderRepository.findByName("Darth Vader").getName();
    }
}