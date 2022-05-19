package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.LeaderRequest;
import com.starwars.rebellion.ComponentInfoAPI.specification.LeaderSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LeaderControllerTest {

	@Autowired
	LeaderController leaderController;

	@Autowired
	LeaderSpecification leaderSpecification;

	@Test
	@Transactional
	void givenChewbaccaDataIsAvailable_ThenChewbaccaNameIsReturned() {
		LeaderRequest leaderRequest = new LeaderRequest();
		leaderRequest.setName("Chewbacca");

		Assertions.assertEquals("Chewbacca",
				leaderController.getLeader(leaderRequest).get(0).getName());
		Assertions.assertEquals(1, leaderController.getLeader(leaderRequest).size());
	}

	@Test
	void givenAllRebelLeaderDataIsAvailable_ThenThirteenRebelLeadersAreReturned() {
		Assertions.assertEquals(13, leaderController.getAllRebelLeaders().size());
	}

	@Test
	void givenAllRebelLeaderDataReturnsOnOneEndpoint_ThenAllHasRebelFactionOnly() {
		leaderController.getAllRebelLeaders().forEach(
				leader -> Assertions.assertEquals(Faction.REBEL, leader.getFaction()));
	}

	@Test
	void givenYularenDataIsAvailable_ThenYularenNameIsReturned(){
		Assertions.assertEquals("Colonel Yularen", leaderController.getLeaderEmpire());
	}

	@Test
	void givenAllEmpireDataIsAvailable_ThenTwelveEmpireLeadersAreReturned(){
		Assertions.assertEquals(12, leaderController.getAllEmpireLeaders().size());
	}
}
