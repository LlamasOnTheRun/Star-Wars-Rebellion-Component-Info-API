package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Region;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.RegionRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.REGION_ID_EXAMPLE;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_REGIONS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RegionControllerTest {

	@Autowired
	RegionController regionController;

	@Test
	void givenIDIsProvided_thenParticularDataIsOnlyReturned() {
		RegionRequest regionRequest = new RegionRequest();
		regionRequest.setId(REGION_ID_EXAMPLE);

		List<Region> regionList =  regionController.getRegion(regionRequest);

		assertEquals(1, regionList.size());
		assertEquals(REGION_ID_EXAMPLE, regionList.get(0).getId());
	}

	@Test
	void givenIDIsNull_thenAllDataIsReturned() {
		RegionRequest regionRequest = new RegionRequest();
		regionRequest.setId(null);

		List<Region> regionList =  regionController.getRegion(regionRequest);

		assertEquals(TOTAL_REGIONS, regionList.size());
		assertEquals(REGION_ID_EXAMPLE, regionList.get(0).getId());
	}

	@Test
	void givenSystemNameIsProvided_thenParticularDataIsOnlyReturned() {
		RegionRequest regionRequest = new RegionRequest();
		regionRequest.setContainsSystem("Felucia");

		List<Region> regionList =  regionController.getRegion(regionRequest);

		assertEquals(1, regionList.size());
		assertEquals(REGION_ID_EXAMPLE, regionList.get(0).getId());
	}

	@Test
	void givenSystemNameIsBlank_thenAllDataIsReturned() {
		RegionRequest regionRequest = new RegionRequest();
		regionRequest.setContainsSystem("");

		List<Region> regionList =  regionController.getRegion(regionRequest);

		assertEquals(TOTAL_REGIONS, regionList.size());
		assertEquals(REGION_ID_EXAMPLE, regionList.get(0).getId());
	}

	@Test
	void givenSystemNameIsNull_thenAllDataIsReturned() {
		RegionRequest regionRequest = new RegionRequest();
		regionRequest.setContainsSystem(null);

		List<Region> regionList =  regionController.getRegion(regionRequest);

		assertEquals(TOTAL_REGIONS, regionList.size());
		assertEquals(REGION_ID_EXAMPLE, regionList.get(0).getId());
	}

	@Test
	void givenSimilarSystemName_thenParticularDataIsOnlyReturned() {
		RegionRequest regionRequest = new RegionRequest();
		regionRequest.setContainsSystem("mOn CaLaMaRi");

		List<Region> regionList =  regionController.getRegion(regionRequest);

		assertEquals(TOTAL_REGIONS, regionList.size());
		assertEquals(REGION_ID_EXAMPLE, regionList.get(0).getId());
	}
}
