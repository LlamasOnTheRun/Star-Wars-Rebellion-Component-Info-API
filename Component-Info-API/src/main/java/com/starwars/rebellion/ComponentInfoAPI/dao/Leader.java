package com.starwars.rebellion.ComponentInfoAPI.dao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Leader {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private MissionSkill missionSkill;
    private MilitarySkill militarySkill;
    private Faction faction;
    private boolean isStartingLeader;

    public Leader() { }

    public Leader(String name) {
        this.name = name;
    }

}
