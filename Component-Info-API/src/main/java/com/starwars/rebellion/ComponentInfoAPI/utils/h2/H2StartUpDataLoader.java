package com.starwars.rebellion.ComponentInfoAPI.utils.h2;

import com.starwars.rebellion.ComponentInfoAPI.repositories.*;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.actionCards.EmpireActionCardData;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.actionCards.RebelActionCardData;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders.EmpireLeaderData;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders.RebelLeaderData;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.missionCards.EmpireMissionCardData;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.missionCards.RebelMissionCardData;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.regions.RegionData;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.rings.RingData;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.SystemData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class H2StartUpDataLoader implements ApplicationRunner {

    @Autowired
    private LeaderRepository leaderRepository;
    @Autowired
    private ActionCardRepository actionCardRepository;
    @Autowired
    private RingRepository ringRepository;
    @Autowired
    private MissionCardRepository missionCardRepository;
    @Autowired
    private RegionRepository regionRepository;
    @Autowired
    private SystemRepository systemRepository;

    public void run(ApplicationArguments args) {
        log.debug("Starting H2 data load up for boardgame components");
        saveLeaders();
        saveActionCards();
        saveRings();
        saveMissionCards();
        saveRegionsAndSystems();
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

    private void saveRegionsAndSystems() {
        regionRepository.saveAll(RegionData.fetch());
        systemRepository.saveAll(SystemData.fetch());
    }
}
