package com.starwars.rebellion.ComponentInfoAPI.dao;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class MissionSkill {
    private int intel;
    private int specOps;
    private int diplomacySkill;
    private boolean proficientInLogistics;
}
