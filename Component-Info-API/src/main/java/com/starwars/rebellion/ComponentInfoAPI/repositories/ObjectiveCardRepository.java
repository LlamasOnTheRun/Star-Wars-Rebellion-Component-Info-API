package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ObjectiveCard;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;


public interface ObjectiveCardRepository extends JpaRepository<ObjectiveCard, Integer>, JpaSpecificationExecutor<ObjectiveCard> {
    List<ObjectiveCard> findAll(Specification<ObjectiveCard> objectiveCardSpecification);
}