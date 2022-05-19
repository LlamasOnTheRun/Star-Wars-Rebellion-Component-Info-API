package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Ring;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface RingRepository extends JpaRepository<Ring, Integer>, JpaSpecificationExecutor<Ring> {

    Ring findByTitle(String title);
    @Override
    List<Ring> findAll();

    List<Ring> findAll(Specification<Ring> spec);
}
