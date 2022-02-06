package com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class ShipProduction {
    private int shipLight = 0;
    private int shipMedium = 0;
    private int shipHeavy = 0;
}
