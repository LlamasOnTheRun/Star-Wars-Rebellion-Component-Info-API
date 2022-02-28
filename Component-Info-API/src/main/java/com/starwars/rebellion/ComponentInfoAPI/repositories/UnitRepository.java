package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Unit;
import org.springframework.data.repository.CrudRepository;


public interface UnitRepository extends CrudRepository<Unit, Integer> {
    Unit findByTitle(String title);
}