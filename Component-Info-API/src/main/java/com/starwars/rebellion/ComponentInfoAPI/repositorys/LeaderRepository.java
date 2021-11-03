package com.starwars.rebellion.ComponentInfoAPI.repositorys;

import com.starwars.rebellion.ComponentInfoAPI.dao.Leader;
import org.springframework.data.repository.CrudRepository;

public interface LeaderRepository extends CrudRepository<Leader, Long> {
    Leader save(Leader leader);
    Leader findByName(String name);
}