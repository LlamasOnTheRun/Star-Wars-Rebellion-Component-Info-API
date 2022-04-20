package com.starwars.rebellion.ComponentInfoAPI.specification;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ActionCardSpecificationTest {

    @Autowired
    private ActionCardSpecification actionCardSpecification;

    @Test
    void givenIDIsLessThanOne_thenIDEqualPredicateIsNotAdded() {

    }

    @Test
    void givenIDIsGreaterThanZero_thenIDEqualPredicateIsAdded() {

    }

    @Test
    void givenFactionIsEmpire_thenFactionEqualPredicateIsAdded() {

    }

    @Test
    void givenFactionIsRebel_thenFactionEqualPredicateIsAdded() {

    }

    @Test
    void givenFactionIsBlank_thenFactionEqualPredicateIsNotAdded() {

    }

    @Test
    void givenFactionIsNull_thenFactionEqualPredicateIsNotAdded() {

    }

    @Test
    void givenTitleIsSimilar_thenTitlePredicateIsAdded() {

    }

    @Test
    void givenTitleIsExact_thenTitlePredicateIsAdded() {

    }

    @Test
    void givenTitleIsNull_thenTitlePredicateIsNotAdded() {

    }
}
