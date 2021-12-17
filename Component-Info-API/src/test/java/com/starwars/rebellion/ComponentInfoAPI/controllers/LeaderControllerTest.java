package com.starwars.rebellion.ComponentInfoAPI.controllers;
import com.starwars.rebellion.ComponentInfoAPI.dao.Faction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LeaderControllerTest {

	@Autowired
	LeaderController leaderController;

	@Test
	void givenChewbaccaDataIsAvailable_ThenChewbaccaNameIsReturned() {
		Assertions.assertEquals("Chewbacca", leaderController.getLeaderRebel());
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
