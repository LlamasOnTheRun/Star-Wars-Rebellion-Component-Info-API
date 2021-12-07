package com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@Embeddable
public class MilitarySkill {
    @Enumerated(EnumType.STRING)
    private Rank rank;
    private int groundTacticDraw;
    private int spaceTacticDraw;
}
