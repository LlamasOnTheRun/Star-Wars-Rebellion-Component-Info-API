package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ActionCard;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ActionCardRepository extends JpaRepository<ActionCard, Integer>, JpaSpecificationExecutor<ActionCard> {

    List<ActionCard> findAll(Specification<ActionCard> spec);
}