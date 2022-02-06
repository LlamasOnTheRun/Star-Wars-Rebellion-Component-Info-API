package com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class ShipProduction {
    private int shipLight;
    private int shipMedium;
    private int shipHeavy;
}
