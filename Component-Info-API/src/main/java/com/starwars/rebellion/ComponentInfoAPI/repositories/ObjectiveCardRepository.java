package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ObjectiveCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ObjectiveCardRepository extends CrudRepository<ObjectiveCard, Integer> {
    @Override
    List<ObjectiveCard> findAll();
}