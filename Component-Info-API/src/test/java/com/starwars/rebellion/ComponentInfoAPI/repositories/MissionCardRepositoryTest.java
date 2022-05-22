package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.request.MissionCardRequest;
import com.starwars.rebellion.ComponentInfoAPI.specification.MissionCardSpecification;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_UNIQUE_MISSION_CARDS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MissionCardRepositoryTest {

	@Autowired
	MissionCardRepository missionCardRepository;

	@Autowired
	MissionCardSpecification missionCardSpecification;

	@Test
	void givenAllMissionCardsAreAvailable_thenAllMissionCardCountIsReturned(){
		MissionCardRequest missionCardRequest = new MissionCardRequest();

		assertEquals(TOTAL_UNIQUE_MISSION_CARDS,
				missionCardRepository.findAll(missionCardSpecification.getMissionCards(missionCardRequest)).size());
	}

}
