package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Leader;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface LeaderRepository extends JpaRepository<Leader, Integer>, JpaSpecificationExecutor<Leader> {
    List<Leader> findAll(Specification<Leader> spec);
}