package com.starwars.rebellion.ComponentInfoAPI.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SystemRepository extends CrudRepository<System, Integer> {
    @Override
    List<System> findAll();
}
