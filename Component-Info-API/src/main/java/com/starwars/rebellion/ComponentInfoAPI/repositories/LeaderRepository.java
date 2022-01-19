package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Leader;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LeaderRepository extends CrudRepository<Leader, Integer> {
    Leader findByName(String name);
    List<Leader> findAllByFaction(Faction faction);
}