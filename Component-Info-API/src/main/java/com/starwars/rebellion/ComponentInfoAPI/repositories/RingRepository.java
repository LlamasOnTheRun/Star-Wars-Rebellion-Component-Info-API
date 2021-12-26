package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Ring;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RingRepository extends CrudRepository<Ring, Integer> {

    Ring findByTitle(String title);
    @Override
    List<Ring> findAll();
}
