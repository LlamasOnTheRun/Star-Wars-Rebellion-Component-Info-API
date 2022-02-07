package com.starwars.rebellion.ComponentInfoAPI.dao.entities;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.LandProduction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.ShipProduction;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "System")
public class System {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    private Region region;
    private String name;
    private char loyalty = 'X';
    private boolean isRemote;
    @Embedded
    private LandProduction landProduction = new LandProduction();
    @Embedded
    private ShipProduction shipProduction = new ShipProduction();
    private char firstProductionSymbol = 'X';
    private int queueTime;
}
