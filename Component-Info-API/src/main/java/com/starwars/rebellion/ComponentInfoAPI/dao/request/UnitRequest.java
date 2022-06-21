package com.starwars.rebellion.ComponentInfoAPI.dao.request;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.ProductionType;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.UnitType;
import lombok.Data;

@Data
public class UnitRequest {
    private Integer id;
    private String title;
    private Faction faction;
    private UnitType unitType;
    private ProductionType productionType;
    private Integer blackDie;
    private Integer redDie;
    private Integer health;
    private Character healthColor;
    private Integer shipCarryingCapacity;
    private Boolean invincible;
    private Boolean needsTransport;
    private Boolean structure;
    private Integer totalInGame;
}
