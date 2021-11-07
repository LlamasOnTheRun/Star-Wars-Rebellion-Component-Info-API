package com.starwars.rebellion.ComponentInfoAPI.repositorys;

import com.starwars.rebellion.ComponentInfoAPI.dao.Leader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaderRepository extends CrudRepository<Leader, Long> {
    Leader save(Leader leader);
    Leader save(List<Leader> leader);
    Leader findByName(String name);
}