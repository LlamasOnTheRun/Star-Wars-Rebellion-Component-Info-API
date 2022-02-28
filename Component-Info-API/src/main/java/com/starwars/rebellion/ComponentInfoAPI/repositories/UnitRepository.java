package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Unit;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.UnitType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UnitRepository extends CrudRepository<Unit, Integer> {
    Unit findByTitle(String title);
    List<Unit> findByFaction(Faction faction);
    List<Unit> findByFactionAndUnitType(Faction faction, UnitType unitType);
}