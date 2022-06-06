package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Region;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RegionControllerTest {

	@Autowired
	RegionController regionController;

	@Test
	@Transactional
	void givenIDIsProvided_thenParticularDataIsOnlyReturned() {
		RegionRequest regionRequest = new RegionRequest();
		regionRequest.setId(1);

		List<Region> regionList =  regionController.getRegion(regionRequest);

		assertEquals(1, regionList.size());
		assertEquals(1, regionList.get(0).getId());
	}
}
