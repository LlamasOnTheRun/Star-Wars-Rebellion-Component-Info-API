package com.starwars.rebellion.ComponentInfoAPI.repositorys;

import com.starwars.rebellion.ComponentInfoAPI.dao.ActionCard;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ActionCardRepository extends CrudRepository<ActionCard, Integer> {
    ActionCard findByCardTextTitle(String title);
    List<ActionCard> findByIsStartingCard(boolean isStartingCard);
}