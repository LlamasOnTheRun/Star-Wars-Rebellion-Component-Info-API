package com.starwars.rebellion.ComponentInfoAPI.utils;

import com.starwars.rebellion.ComponentInfoAPI.dao.*;
import com.starwars.rebellion.ComponentInfoAPI.repositorys.LeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class H2StartUpDataLoader implements ApplicationRunner {

    private LeaderRepository leaderRepository;

    @Autowired
    public H2StartUpDataLoader(LeaderRepository leaderRepository) {
        this.leaderRepository = leaderRepository;
    }

    public void run(ApplicationArguments args) {
        saveEmpireLeaders();
    }

    private void saveEmpireLeaders() {
        Leader leader = new Leader();

        leader.setMissionSkill(3, 3, 3, true);
        leader.setMilitarySkill(Rank.General, 3, 3);
        leader.setStartingLeader(true);
        leader.setRingID(1);
        leader.setFaction(Faction.IMPERIAL);
        leader.setName("Darth Vader");

        leaderRepository.save(leader);
    }
}
