package com.starwars.rebellion.ComponentInfoAPI.utils.h2;

import com.starwars.rebellion.ComponentInfoAPI.repositorys.ActionCardRepository;
import com.starwars.rebellion.ComponentInfoAPI.repositorys.LeaderRepository;

import com.starwars.rebellion.ComponentInfoAPI.repositorys.RingRepository;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.actionCards.RebelActionCards;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders.RebelLeaders;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.rings.Rings;
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

    public void run(ApplicationArguments args) {
        saveLeaders();
        saveActionCards();
        saveRings();
    }

    private void saveActionCards() {
        actionCardRepository.saveAll(RebelActionCards.fetch());
    }

    private void saveLeaders() {
        leaderRepository.saveAll(RebelLeaders.fetch());
    }

    private void saveRings() {
        ringRepository.saveAll(Rings.fetch());
    }
}