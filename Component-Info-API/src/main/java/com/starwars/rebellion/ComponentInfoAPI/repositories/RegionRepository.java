package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Region;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RegionRepository extends CrudRepository<Region, Integer> {
    List<Region> findAll();
}
