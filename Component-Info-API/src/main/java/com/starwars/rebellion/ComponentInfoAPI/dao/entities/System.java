package com.starwars.rebellion.ComponentInfoAPI.dao.entities;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.LandProduction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.ShipProduction;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.REMOTE_SYSTEM_IDENTIFICATION;

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
    private char loyalty = REMOTE_SYSTEM_IDENTIFICATION;
    private boolean isRemote;
    @Embedded
    private LandProduction landProduction = new LandProduction();
    @Embedded
    private ShipProduction shipProduction = new ShipProduction();
    private char firstProductionSymbol = REMOTE_SYSTEM_IDENTIFICATION;
    private int queueTime;
}
