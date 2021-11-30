package com.starwars.rebellion.ComponentInfoAPI.repositorys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LeaderRepositoryTest {

	@Autowired
	LeaderRepository leaderRepository;

	@Test
	void givenAdmiralAckbarIsInTwoActionCards_thenTwoActionCardsWillBeReturned() {
		Assertions.assertEquals(2, leaderRepository.findByName("Admiral Ackbar").getInActionCards().size());
	}
}
