package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ActualSystem;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SystemRepository extends CrudRepository<ActualSystem, Integer> {
    @Override
    List<ActualSystem> findAll();
}
