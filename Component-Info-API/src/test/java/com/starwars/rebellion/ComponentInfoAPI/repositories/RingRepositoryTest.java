package com.starwars.rebellion.ComponentInfoAPI.repositories;

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

  /* TODO - Until all action card data is available, then make connection between action card and rings
   @Test
   void givenAllRing_andAllActionCardDataIsAvailable_thenThreeRingsWithActionCardsShouldBeReturned(){
      Assertions.assertEquals(3, );
   }
   */

  /* TODO - Until all mission card data is available, then make connection between mission card and rings
   @Test
   void givenAllRing_andAllMissionCardDataIsAvailable_thenFourRingsWithMissionCardsShouldBeReturned(){
      Assertions.assertEquals(4, );
   }
   */
}
