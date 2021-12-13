package com.starwars.rebellion.ComponentInfoAPI.utils.h2;

import com.starwars.rebellion.ComponentInfoAPI.repositorys.ActionCardRepository;
import com.starwars.rebellion.ComponentInfoAPI.repositorys.LeaderRepository;

import com.starwars.rebellion.ComponentInfoAPI.repositorys.MissionCardRepository;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.MissionCards.RebelMissionCards;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.actionCards.RebelActionCards;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders.RebelLeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import org.springframework.stereotype.Component;

@Component
public class H2StartUpDataLoader implements ApplicationRunner {

    @Autowired
    private LeaderRepository leaderRepository;

    @Autowired
    private ActionCardRepository actionCardRepository;

    @Autowired
    private MissionCardRepository missionCardRepository;

    public void run(ApplicationArguments args) {
        saveLeaders();
        saveActionCards();
        saveMissionCards();
    }

    private void saveActionCards() {
        actionCardRepository.saveAll(RebelActionCards.fetch());
    }

    private void saveLeaders() {
        leaderRepository.saveAll(RebelLeaders.fetch());
    }

    private void saveMissionCards() {
        missionCardRepository.saveAll(RebelMissionCards.fetch());
    }
}
