package com.starwars.rebellion.ComponentInfoAPI.repositorys;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ActionCard;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ActionCardRepository extends CrudRepository<ActionCard, Integer> {
    ActionCard findByActionCardTextTitle(String title);
    List<ActionCard> findByIsStartingCard(boolean isStartingCard);
}