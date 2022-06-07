package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.repositories.RegionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RegionSpecificationTest {

    @Autowired
    private RegionRepository regionRepository;

    @Autowired
    private RegionSpecification regionSpecification;

    @Test
    void givenIDIsNull_thenPredicateIsNotAdded() {

    }

    @Test
    void givenIDIsBlank_thenPredicateIsNotAdded() {

    }

    @Test
    void givenIDIsProvided_thenPredicateIsAdded() {

    }

    @Test
    void givenSystemIsProvided_thenPredicateIsAdded() {

    }

    @Test
    void givenSystemIsProvidedWithSimilarNaming_thenPredicateIsAdded() {

    }

    @Test
    void givenSystemIsNull_thenPredicateIsNotAdded() {

    }

    @Test
    void givenSystemIsBlank_thenPredicateIsNotAdded() {

    }
}
