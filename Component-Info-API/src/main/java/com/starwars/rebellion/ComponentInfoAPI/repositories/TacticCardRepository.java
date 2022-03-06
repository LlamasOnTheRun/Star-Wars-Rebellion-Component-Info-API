package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.TacticCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.TacticType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface TacticCardRepository extends CrudRepository<TacticCard, Integer> {
    TacticCard findByCardTextTitle(String title);
    List<TacticCard> findByTacticType(TacticType tacticType);
}