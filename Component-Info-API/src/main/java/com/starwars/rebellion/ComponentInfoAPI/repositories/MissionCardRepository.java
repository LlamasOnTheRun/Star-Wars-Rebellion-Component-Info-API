package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.MissionCard;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;


public interface MissionCardRepository extends JpaRepository<MissionCard, Integer>, JpaSpecificationExecutor<MissionCard> {
    List<MissionCard> findAll(Specification<MissionCard> missionCardSpecification);
}