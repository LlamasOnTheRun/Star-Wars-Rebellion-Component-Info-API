package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.request.LeaderRequest;
import com.starwars.rebellion.ComponentInfoAPI.specification.LeaderSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LeaderRepositoryTest {

	@Autowired
	LeaderRepository leaderRepository;

	@Autowired
	private LeaderSpecification leaderSpecification;

	@Test
	void givenAdmiralAckbarIsInTwoActionCards_thenTwoActionCardsWillBeReturned() {
		LeaderRequest leaderRequest = new LeaderRequest();
		leaderRequest.setName("Admiral Ackbar");

		Assertions.assertEquals(2, leaderRepository
				.findAll(leaderSpecification.getLeaders(leaderRequest).atRoot()).get(0)
				.getInActionCards().size());
	}
}
