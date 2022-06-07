package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Region;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Integer>, JpaSpecificationExecutor<Region> {
    List<Region> findAll(Specification<Region> spec);
}
