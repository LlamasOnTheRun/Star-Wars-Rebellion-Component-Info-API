package com.starwars.rebellion.ComponentInfoAPI.utils.h2;

import com.starwars.rebellion.ComponentInfoAPI.repositorys.LeaderRepository;

import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders.RebelLeaders;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders.EmpireLeaders;
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
        saveRebelLeaders();
        saveEmpireLeaders();
    }

    private void saveRebelLeaders() {
        leaderRepository.saveAll(RebelLeaders.fetch());
    }
    private void saveEmpireLeaders() {leaderRepository.saveAll(EmpireLeaders.fetch());}
}
