package com.starwars.rebellion.ComponentInfoAPI;

import com.starwars.rebellion.ComponentInfoAPI.controllers.TestContoller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestControllerTest {

	@Autowired
	TestContoller testContoller;

	@Test
	void givenTestDataIsAvailable_ThenCaprisunIsReturned() {
		Assertions.assertEquals("caprisun", testContoller.getTestData());
	}

}
