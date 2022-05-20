package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Leader;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.LeaderRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.LeaderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.HAN_SOLO_LEADER_ID;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_LEADERS;
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
    }

    @Test
    void givenFactionIsRebel_thenFactionEqualPredicateIsAdded() {
    }

    @Test
    void givenFactionIsNull_thenFactionEqualPredicateIsNotAdded() {
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
