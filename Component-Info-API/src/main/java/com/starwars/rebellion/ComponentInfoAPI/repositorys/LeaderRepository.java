package com.starwars.rebellion.ComponentInfoAPI.repositorys;

import com.starwars.rebellion.ComponentInfoAPI.dao.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.Leader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public interface LeaderRepository extends CrudRepository<Leader, Long> {
    Leader findByName(String name);
    List<Leader> findAllByFaction(Faction faction);
}