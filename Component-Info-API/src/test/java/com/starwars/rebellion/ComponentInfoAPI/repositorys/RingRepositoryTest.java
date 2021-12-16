package com.starwars.rebellion.ComponentInfoAPI.repositorys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RingRepositoryTest {
   @Autowired
   private RingRepository ringRepository;

   @Test
   void givenRingRepositoryIsUp_C3PORingIsAvailable_thenTitleReturns(){
       Assertions.assertEquals("C3PO", ringRepository.findByTitle("C3PO").getTitle());
   }


   @Test
   void givenAllRingDataIsAvailable_thenSevenRingsShouldBeReturned() {
      Assertions.assertEquals(7, ringRepository.findAll().size());
   }
}
