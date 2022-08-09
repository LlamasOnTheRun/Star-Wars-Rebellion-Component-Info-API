package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.MissionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.MissionCardRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.MissionCardRepository;
import com.starwars.rebellion.ComponentInfoAPI.specification.LeaderSpecification;
import com.starwars.rebellion.ComponentInfoAPI.specification.MissionCardSpecification;
import com.starwars.rebellion.ComponentInfoAPI.specification.PathSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;

@Controller
@RequestMapping(value=BASE_CONTROLLER_PATH)
public class MissionCardController {

    @Autowired
    private MissionCardSpecification missionCardSpecification;

    @Autowired
    private LeaderSpecification leaderSpecification;

    @Autowired
    private MissionCardRepository missionCardRepository;

    @GetMapping(path=GET_ALL_MISSION_CARD_ENDPOINT)
    @ResponseBody
    public List<MissionCard> getAllMissionCards(){ return missionCardRepository.findAll(missionCardSpecification.getAllMissionCards());}

    @PostMapping(path=MISSION_CARD_ENDPOINT)
    @ResponseBody
    public List<MissionCard> getMissionCards(@RequestBody MissionCardRequest missionCardRequest) {
        PathSpecification<MissionCard> localMissionPathSpecification =
                missionCardSpecification.getMissionCards(missionCardRequest);
        Specification<MissionCard> localMissionCardSpecification = localMissionPathSpecification.atRoot();

        if(missionCardRequest.getLeaderBonusSearch() != null) {
            localMissionCardSpecification = localMissionPathSpecification.atRoot().and(leaderSpecification
                    .getLeaders(missionCardRequest.getLeaderBonusSearch()).atPath("leaderBonus"));
        }

        return missionCardRepository.findAll(localMissionCardSpecification);
    }
}
