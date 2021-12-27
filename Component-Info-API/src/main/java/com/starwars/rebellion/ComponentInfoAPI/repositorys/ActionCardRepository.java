package com.starwars.rebellion.ComponentInfoAPI.repositorys;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ActionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ActionCardRepository extends CrudRepository<ActionCard, Integer> {
    ActionCard findByActionCardTextTitle(String title);
    List<ActionCard> findByIsStartingCardAndFaction(boolean isStartingCard, Faction faction);
    List<ActionCard> findByFaction(Faction faction);
}