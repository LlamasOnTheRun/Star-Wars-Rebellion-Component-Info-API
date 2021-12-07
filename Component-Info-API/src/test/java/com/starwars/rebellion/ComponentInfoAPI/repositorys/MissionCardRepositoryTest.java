package com.starwars.rebellion.ComponentInfoAPI.repositorys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MissionCardRepositoryTest {

	@Autowired
	MissionCardRepository missionCardRepository;

	@Test
	void givenForTheGreaterGoodDataIsAvailable_thenDataIsReturned() {
		Assertions.assertEquals("For The Greater Good", missionCardRepository.findByTitle("For The Greater Good").getTitle());
	}
}
