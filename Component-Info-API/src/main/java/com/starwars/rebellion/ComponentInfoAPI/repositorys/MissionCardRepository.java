package com.starwars.rebellion.ComponentInfoAPI.repositorys;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.MissionCard;
import org.springframework.data.repository.CrudRepository;


public interface MissionCardRepository extends CrudRepository<MissionCard, Integer> {
    MissionCard findByMissionCardTextTitle(String title);
}