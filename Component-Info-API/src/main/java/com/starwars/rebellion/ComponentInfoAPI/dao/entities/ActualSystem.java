package com.starwars.rebellion.ComponentInfoAPI.dao.entities;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.LandProduction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.ShipProduction;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="System")
public class ActualSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    private Region region;
    private String name;
    private char loyalty;
    private boolean isRemote;
    @Embedded
    private LandProduction landProduction;
    @Embedded
    private ShipProduction shipProduction;
    private char firstProductionSymbol;
    private int queueTime;
}
