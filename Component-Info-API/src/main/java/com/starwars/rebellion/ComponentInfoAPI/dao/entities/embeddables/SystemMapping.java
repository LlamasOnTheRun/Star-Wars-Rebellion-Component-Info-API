package com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.OneToOne;

@Data
@Embeddable
public class SystemMapping {

    @OneToOne
    @JsonIgnoreProperties({"region", "loyalty", "remote", "landProduction",
            "shipProduction", "firstProductionSymbol", "queueTime", "systemMapping"})
    private System top;

    @OneToOne
    @JsonIgnoreProperties({"region", "loyalty", "remote", "landProduction",
            "shipProduction", "firstProductionSymbol", "queueTime", "systemMapping"})
    private System topLeft;

    @OneToOne
    @JsonIgnoreProperties({"region", "loyalty", "remote", "landProduction",
            "shipProduction", "firstProductionSymbol", "queueTime", "systemMapping"})
    private System topRight;

    @OneToOne
    @JsonIgnoreProperties({"region", "loyalty", "remote", "landProduction",
            "shipProduction", "firstProductionSymbol", "queueTime", "systemMapping"})
    private System bottom;

    @OneToOne
    @JsonIgnoreProperties({"region", "loyalty", "remote", "landProduction",
            "shipProduction", "firstProductionSymbol", "queueTime", "systemMapping"})
    private System bottomLeft;

    @OneToOne
    @JsonIgnoreProperties({"region", "loyalty", "remote", "landProduction",
            "shipProduction", "firstProductionSymbol", "queueTime", "systemMapping"})
    private System bottomRight;

    @OneToOne
    @JsonIgnoreProperties({"region", "loyalty", "remote", "landProduction",
            "shipProduction", "firstProductionSymbol", "queueTime", "systemMapping"})
    private System left;

    @OneToOne
    @JsonIgnoreProperties({"region", "loyalty", "remote", "landProduction",
            "shipProduction", "firstProductionSymbol", "queueTime", "systemMapping"})
    private System right;
}
