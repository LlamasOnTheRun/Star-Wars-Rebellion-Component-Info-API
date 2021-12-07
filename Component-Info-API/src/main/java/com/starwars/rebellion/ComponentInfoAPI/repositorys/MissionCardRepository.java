package com.starwars.rebellion.ComponentInfoAPI.repositorys;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ActionCard;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MissionCardRepository extends CrudRepository<ActionCard, Integer> {
    ActionCard findByCardTextTitle(String title);
}