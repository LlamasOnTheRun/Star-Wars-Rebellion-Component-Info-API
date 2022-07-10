package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Ring;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.RingRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.RingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_RINGS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RingSpecificationTest {

    @Autowired
    private RingSpecification ringSpecification;

    @Autowired
    private RingRepository ringRepository;

    @Test
    void givenIDIsLessThanOne_thenIDEqualPredicateIsNotAdded() {
        RingRequest ringRequest = new RingRequest();
        ringRequest.setId(0);
        List<Ring> ringList = ringRepository.findAll(ringSpecification.getRings(ringRequest));

        assertEquals(TOTAL_RINGS, ringList.size());
    }

    @Test
    void givenIDIsGreaterThanZero_thenIDEqualPredicateIsAdded(){
        RingRequest ringRequest = new RingRequest();
        ringRequest.setId(61);

        List<Ring> ringList = ringRepository.findAll(ringSpecification.getRings(ringRequest));

        assertEquals(1, ringList.size());
    }

    @Test
    void givenIDDoesNotExist_thenIDEqualPredicateIsStillAdded(){
        RingRequest ringRequest = new RingRequest();
        ringRequest.setId(1);

        List<Ring> ringList = ringRepository.findAll(ringSpecification.getRings(ringRequest));

        assertEquals(0, ringList.size());
    }

   @Test
   void givenTitleIsExact_thenTitlePredicateIsAdded() {
        RingRequest ringRequest = new RingRequest();
        ringRequest.setTitle("Master Yoda");

        List<Ring> ringList = ringRepository.findAll(ringSpecification.getRings((ringRequest)));

        assertEquals(1, ringList.size());
   }

    @Test
    void givenTitleIsSimilar_thenTitlePredicateIsAdded() {
        RingRequest ringRequest = new RingRequest();
        ringRequest.setTitle("aster");

        List<Ring> ringList = ringRepository.findAll(ringSpecification.getRings(ringRequest));

        assertEquals(1, ringList.size());
        assertEquals("Master Yoda", ringList.get(0).getTitle());
    }

    @Test
    void givenTitleWithoutSpaces_thenTitlePredicateIsAdded() {
        RingRequest ringRequest = new RingRequest();
        ringRequest.setTitle("R2D2");

        List<Ring> ringList = ringRepository.findAll(ringSpecification.getRings(ringRequest));

        assertEquals(1, ringList.size());
    }

    @Test
    void givenTitleIsNull_thenTitlePredicateIsNotAdded() {
        RingRequest ringRequest = new RingRequest();
        ringRequest.setTitle(null);

        List<Ring> ringList = ringRepository.findAll(ringSpecification.getRings(ringRequest));

        assertEquals(TOTAL_RINGS, ringList.size());
    }

    @Test
    void givenTitleIsBlank_thenTitlePredicateIsNotAdded() {
        RingRequest ringRequest = new RingRequest();
        ringRequest.setTitle("");

        List<Ring> ringList = ringRepository.findAll(ringSpecification.getRings(ringRequest));

        assertEquals(TOTAL_RINGS, ringList.size());
    }

}
