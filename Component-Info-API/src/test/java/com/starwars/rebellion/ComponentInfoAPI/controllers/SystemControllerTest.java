package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.SystemRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SystemControllerTest {

	@Autowired
	SystemController systemController;

	@Test
	void givenIDIsProvided_thenParticularDataIsOnlyReturned() {
		SystemRequest systemRequest = new SystemRequest();
		systemRequest.setId(SYSTEM_ID_EXAMPLE);

		List<System> systemList =  systemController.getSystem(systemRequest);

		assertEquals(1, systemList.size());
		assertEquals(SYSTEM_ID_EXAMPLE, systemList.get(0).getId());
	}

	@Test
	void givenSystemNameIsProvided_thenParticularDataIsOnlyReturned() {
		SystemRequest systemRequest = new SystemRequest();
		systemRequest.setName(SYSTEM_NAME_EXAMPLE);

		List<System> systemList =  systemController.getSystem(systemRequest);

		assertEquals(1, systemList.size());
		assertEquals(SYSTEM_NAME_EXAMPLE, systemList.get(0).getName());
	}

	@Test
	void givenRemoteIsProvided_thenParticularDataIsOnlyReturned() {
		SystemRequest systemRequest = new SystemRequest();
		systemRequest.setRemote(false);

		List<System> systemList =  systemController.getSystem(systemRequest);

		assertEquals(TOTAL_NON_REMOTE_SYSTEMS, systemList.size());
	}
}
