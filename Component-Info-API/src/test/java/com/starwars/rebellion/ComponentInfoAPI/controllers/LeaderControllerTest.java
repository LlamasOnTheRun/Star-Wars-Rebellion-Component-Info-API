package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.LeaderRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.LEADER_ENDPOINT;
import static io.restassured.RestAssured.with;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
class LeaderControllerTest {

	@Autowired
	LeaderController leaderController;

	@Autowired
	LeaderSpecification leaderSpecification;

	@Test
	void givenChewbaccaDataIsAvailable_ThenChewbaccaNameIsReturned() {
		LeaderRequest leaderRequest = new LeaderRequest();
		leaderRequest.setName("Chewbacca");
		with().body(leaderRequest)
				.when().post(LEADER_ENDPOINT)
				.then().statusCode(200).assertThat().body("name", equalTo("Chewbacca"));
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
