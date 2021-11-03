package com.starwars.rebellion.ComponentInfoAPI.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LeaderControllerTest {

	@Autowired
	LeaderController leaderController;

	@Test
	void givenTestDataIsAvailable_ThenDarthVaderIsReturned() {
		Assertions.assertEquals("Darth Vader", leaderController.getLeader());
	}

}
