package com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class LandProduction {
    private int landLight;
    private int landMedium;
    private int landHeavy;
}
