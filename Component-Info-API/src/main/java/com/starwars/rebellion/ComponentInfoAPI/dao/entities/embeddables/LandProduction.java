package com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class LandProduction {
    private int landLight = 0;
    private int landMedium = 0;
    private int landHeavy = 0;
}
