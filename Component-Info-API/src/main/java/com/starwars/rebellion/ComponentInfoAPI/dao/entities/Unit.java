package com.starwars.rebellion.ComponentInfoAPI.dao.entities;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.ProductionType;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.UnitType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.DEATH_STAR_HEALTH;

@Entity
@Getter
@Setter
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private Faction faction;
    private UnitType unitType;
    private ProductionType productionType;
    private int blackDie = 0;
    private int redDie = 0;
    private int health = DEATH_STAR_HEALTH;
    private char healthColor;
    private int shipCarryingCapacity = 0;
    private boolean invincible = false;
    private boolean needsTransport = false;
    private int totalInGame;
}
