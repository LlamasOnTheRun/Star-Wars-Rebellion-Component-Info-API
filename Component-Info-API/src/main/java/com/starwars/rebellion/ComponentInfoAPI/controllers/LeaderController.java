package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.Leader;
import com.starwars.rebellion.ComponentInfoAPI.repositorys.LeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;

@Controller
@RequestMapping(value=BASE_CONTROLLER_PATH)
public class LeaderController {
    @Autowired
    LeaderRepository leaderRepository;

    @GetMapping(path=GET_LEADER_ENDPOINT)
    @ResponseBody
    public String getLeader() {
        return leaderRepository.findByName("Chewbacca").getName();
    }

    @GetMapping(path=GET_ALL_REBEL_LEADERS_ENDPOINT)
    @ResponseBody
    public List<Leader> getAllRebelLeaders() {
        return leaderRepository.findAllByFaction(Faction.REBEL);
    }

    @GetMapping(path=GET_ALL_IMPERIAL_LEADERS_ENDPOINT)
    @ResponseBody
    public List<Leader> getAllEmpireLeaders() {
        return leaderRepository.findAllByFaction(Faction.IMPERIAL);
    }
}