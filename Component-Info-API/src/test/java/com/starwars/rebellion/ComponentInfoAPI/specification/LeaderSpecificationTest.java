package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Leader;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.LeaderRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.LeaderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class LeaderSpecificationTest {

    @Autowired
    private LeaderSpecification leaderSpecification;

    @Autowired
    private LeaderRepository leaderRepository;

    @Test
    void givenIDIsLessThanOne_thenIDEqualPredicateIsNotAdded() {
        LeaderRequest leaderRequest = new LeaderRequest();
        leaderRequest.setId(0);

        List<Leader> leaderRequestList = leaderRepository.findAll(leaderSpecification.getLeaders(leaderRequest));

        assertEquals(TOTAL_LEADERS, leaderRequestList.size());
    }

    @Test
    void givenIDIsGreaterThanZero_thenIDEqualPredicateIsAdded() {
        LeaderRequest leaderRequest = new LeaderRequest();
        leaderRequest.setId(HAN_SOLO_LEADER_ID);

        List<Leader> leaderRequestList = leaderRepository.findAll(leaderSpecification.getLeaders(leaderRequest));

        assertEquals(1, leaderRequestList.size());
    }

    @Test
    void givenIDDoesNotExist_thenIDEqualPredicateIsAdded() {
        LeaderRequest leaderRequest = new LeaderRequest();
        leaderRequest.setId(100);

        List<Leader> leaderRequestList = leaderRepository.findAll(leaderSpecification.getLeaders(leaderRequest));

        assertEquals(0, leaderRequestList.size());
    }

    @Test
    void givenIDIsNull_thenIDEqualPredicateIsNotAdded() {
        LeaderRequest leaderRequest = new LeaderRequest();
        leaderRequest.setId(null);

        List<Leader> leaderRequestList = leaderRepository.findAll(leaderSpecification.getLeaders(leaderRequest));

        assertEquals(TOTAL_LEADERS, leaderRequestList.size());
    }

    @Test
    void givenFactionIsEmpire_thenFactionEqualPredicateIsAdded() {
        LeaderRequest leaderRequest = new LeaderRequest();
        leaderRequest.setFaction(Faction.IMPERIAL);

        List<Leader> leaderRequestList = leaderRepository.findAll(leaderSpecification.getLeaders(leaderRequest));

        assertEquals(TOTAL_EMPIRE_LEADERS, leaderRequestList.size());
    }

    @Test
    void givenFactionIsRebel_thenFactionEqualPredicateIsAdded() {
        LeaderRequest leaderRequest = new LeaderRequest();
        leaderRequest.setFaction(Faction.REBEL);

        List<Leader> leaderRequestList = leaderRepository.findAll(leaderSpecification.getLeaders(leaderRequest));

        assertEquals(TOTAL_REBEL_LEADERS, leaderRequestList.size());
    }

    @Test
    void givenFactionIsNull_thenFactionEqualPredicateIsNotAdded() {
        LeaderRequest leaderRequest = new LeaderRequest();
        leaderRequest.setFaction(null);

        List<Leader> leaderRequestList = leaderRepository.findAll(leaderSpecification.getLeaders(leaderRequest));

        assertEquals(TOTAL_LEADERS, leaderRequestList.size());
    }

    @Test
    void givenTitleIsSimilar_thenTitlePredicateIsAdded() {
    }

    @Test
    void givenTitleIsExact_thenTitlePredicateIsAdded() {
    }

    @Test
    void givenTitleWithoutNewlines_thenTitlePredicateIsAdded() {
    }

    @Test
    void givenTitleIsNull_thenTitlePredicateIsNotAdded() {
    }

    @Test
    void givenTitleIsBlank_thenTitlePredicateIsNotAdded() {
    }

    @Test
    void givenStartingCardIsTrue_thenStartingCardPredicateIsAdded() {
    }

    @Test
    void givenStartingCardIsFalse_thenStartingCardPredicateIsAdded() {
    }

    @Test
    void givenStartingCardIsNull_thenStartingCardPredicateIsNotAdded() {
    }
}
