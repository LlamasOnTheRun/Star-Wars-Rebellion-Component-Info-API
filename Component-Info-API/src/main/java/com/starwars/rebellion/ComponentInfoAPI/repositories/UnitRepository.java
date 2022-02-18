package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.MissionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UnitRepository extends CrudRepository<MissionCard, Integer> {
    MissionCard findByCardTextTitle(String title);

    List<MissionCard> findAllByFaction(Faction faction);

    List<MissionCard> findAllByFactionAndIsProjectCard(Faction faction, boolean isProjectCard);

    List<MissionCard> findAllByIsStartingCard(boolean returnOnlyStartingCards);
}