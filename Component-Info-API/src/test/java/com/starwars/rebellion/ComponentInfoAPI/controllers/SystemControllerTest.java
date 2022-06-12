package com.starwars.rebellion.ComponentInfoAPI.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SystemControllerTest {

	@Autowired
	SystemController systemController;

	@Test
	void givenIDIsProvided_thenParticularDataIsOnlyReturned() {
		SystemRequest systemRequest = new SystemRequest();
		systemRequest.setId(1);

		List<System> systemList =  systemController.getSystem(systemRequest);

		assertEquals(1, systemList.size());
		assertEquals(1, systemList.get(0).getId());
	}
}
