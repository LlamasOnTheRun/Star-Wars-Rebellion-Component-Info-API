package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.LeaderRequest;
import com.starwars.rebellion.ComponentInfoAPI.specification.LeaderSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_EMPIRE_LEADERS;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_REBEL_LEADERS;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LeaderControllerTest {

	@Autowired
	LeaderController leaderController;

	@Autowired
	LeaderSpecification leaderSpecification;

	@Test
	@Transactional
	void givenNameIsGiven_thenParticularDataIsOnlyReturned() {
		LeaderRequest leaderRequest = new LeaderRequest();
		leaderRequest.setName("Chewbacca");

		Assertions.assertEquals("Chewbacca",
				leaderController.getLeader(leaderRequest).get(0).getName());
		Assertions.assertEquals(1, leaderController.getLeader(leaderRequest).size());
	}

	@Test
	void givenAllRebelLeaderDataIsAvailable_thenThirteenRebelLeadersAreReturned() {
		LeaderRequest leaderRequest = new LeaderRequest();
		leaderRequest.setFaction(Faction.REBEL);

		Assertions.assertEquals(TOTAL_REBEL_LEADERS,
				leaderController.getLeader(leaderRequest).size());
	}

	@Test
	void givenAllRebelLeaderDataIsAvailable_thenAllHasRebelFactionOnly() {
		LeaderRequest leaderRequest = new LeaderRequest();
		leaderRequest.setFaction(Faction.REBEL);

		leaderController.getLeader(leaderRequest).forEach(
				leader -> Assertions.assertEquals(Faction.REBEL, leader.getFaction()));
	}

	@Test
	void givenAllEmpireDataIsAvailable_thenTwelveEmpireLeadersAreReturned(){
		LeaderRequest leaderRequest = new LeaderRequest();
		leaderRequest.setFaction(Faction.IMPERIAL);

		Assertions.assertEquals(TOTAL_EMPIRE_LEADERS,
				leaderController.getLeader(leaderRequest).size());
	}

	@Test
	void givenAllEmpireLeaderDataIsAvailable_thenAllHasEmpireFactionOnly() {
		LeaderRequest leaderRequest = new LeaderRequest();
		leaderRequest.setFaction(Faction.IMPERIAL);

		leaderController.getLeader(leaderRequest).forEach(
				leader -> Assertions.assertEquals(Faction.IMPERIAL, leader.getFaction()));
	}
}
