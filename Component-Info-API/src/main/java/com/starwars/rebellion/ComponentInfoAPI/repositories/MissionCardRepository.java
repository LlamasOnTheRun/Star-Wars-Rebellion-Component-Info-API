package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.MissionCard;
import org.springframework.data.repository.CrudRepository;


public interface MissionCardRepository extends CrudRepository<MissionCard, Integer> {
    MissionCard findByCardTextTitle(String title);
}