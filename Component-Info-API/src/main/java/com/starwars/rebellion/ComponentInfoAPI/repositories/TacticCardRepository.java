package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.TacticCard;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;


public interface TacticCardRepository extends JpaRepository<TacticCard, Integer>, JpaSpecificationExecutor<TacticCard> {
    TacticCard findByCardTextTitle(String title);
    List<TacticCard> findAll(Specification<TacticCard> tacticCardSpecification);
    List<TacticCard> findAll();
}