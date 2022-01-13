package com.starwars.rebellion.ComponentInfoAPI.utils.h2;

import com.starwars.rebellion.ComponentInfoAPI.repositories.ActionCardRepository;
import com.starwars.rebellion.ComponentInfoAPI.repositories.LeaderRepository;
import com.starwars.rebellion.ComponentInfoAPI.repositories.MissionCardRepository;
import com.starwars.rebellion.ComponentInfoAPI.repositories.RingRepository;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.actionCards.EmpireActionCardData;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.actionCards.RebelActionCardData;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders.EmpireLeaderData;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders.RebelLeaderData;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.missionCards.EmpireMissionCardData;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.missionCards.RebelMissionCardData;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.rings.RingData;
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
    private RingRepository ringRepository;
    @Autowired
    private MissionCardRepository missionCardRepository;

    public void run(ApplicationArguments args) {
        saveLeaders();
        saveActionCards();
        saveRings();
        saveMissionCards();
    }

    private void saveActionCards() {
        actionCardRepository.saveAll(RebelActionCardData.fetch());
        actionCardRepository.saveAll(EmpireActionCardData.fetch());
    }

    private void saveLeaders() {
        leaderRepository.saveAll(RebelLeaderData.fetch());
        leaderRepository.saveAll(EmpireLeaderData.fetch());
    }

    private void saveRings() {
        ringRepository.saveAll(RingData.fetch());
    }

    private void saveMissionCards() {
        missionCardRepository.saveAll(RebelMissionCardData.fetch());
        missionCardRepository.saveAll(EmpireMissionCardData.fetch());
    }
}
