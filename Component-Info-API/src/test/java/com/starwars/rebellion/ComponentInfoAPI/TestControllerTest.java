package com.starwars.rebellion.ComponentInfoAPI;

import com.starwars.rebellion.ComponentInfoAPI.controllers.TestContoller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestControllerTest {

	@Autowired
	TestContoller testContoller;

	@Test
	void givenTestControllerUp_thenReturnsExpectedOutput() {
		Assertions.assertEquals("word", testContoller.getTestData());
	}

}
