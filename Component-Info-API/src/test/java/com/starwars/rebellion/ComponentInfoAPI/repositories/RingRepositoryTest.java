package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.request.RingRequest;
import com.starwars.rebellion.ComponentInfoAPI.specification.RingSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_RINGS;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RingRepositoryTest {

   @Autowired
   private RingRepository ringRepository;

   @Autowired
   private RingSpecification ringSpecification;

   @Test
   void givenRingData_thenEquivalentRingShouldBeReturned() {
      RingRequest ringRequest = new RingRequest();

      Assertions.assertEquals(TOTAL_RINGS, ringRepository.findAll(ringSpecification.getRings(ringRequest)).size());
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
