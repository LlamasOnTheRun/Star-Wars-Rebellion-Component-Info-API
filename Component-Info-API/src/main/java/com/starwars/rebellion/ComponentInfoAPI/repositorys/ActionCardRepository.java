package com.starwars.rebellion.ComponentInfoAPI.repositorys;

import com.starwars.rebellion.ComponentInfoAPI.dao.ActionCard;
import org.springframework.data.repository.CrudRepository;

public interface ActionCardRepository extends CrudRepository<ActionCard, Long> {
    ActionCard findByCardTextTitle(String title);
}