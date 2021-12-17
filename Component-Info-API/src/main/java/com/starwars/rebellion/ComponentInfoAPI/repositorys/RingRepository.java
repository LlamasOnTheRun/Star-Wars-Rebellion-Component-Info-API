package com.starwars.rebellion.ComponentInfoAPI.repositorys;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Ring;
import org.springframework.data.repository.CrudRepository;

public interface RingRepository extends CrudRepository<Ring, Integer> {

    Ring findByTitle(String title);

}
