package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.request.ProjectCardRequest;
import com.starwars.rebellion.ComponentInfoAPI.specification.ProjectCardSpecification;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_PROJECT_CARDS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProjectCardRepositoryTest {
   @Autowired
   ProjectCardRepository projectCardRepository;

   @Autowired
   ProjectCardSpecification projectCardSpecification;


   @Test
   void givenAllProjectCardsAreAvailable_thenAllProjectCardCountIsReturned(){
       ProjectCardRequest projectCardRequest = new ProjectCardRequest();

       assertEquals(TOTAL_PROJECT_CARDS,
               projectCardRepository.findAll(projectCardSpecification.getProjectCards(projectCardRequest)).size());
   }
}
