package com.starwars.rebellion.ComponentInfoAPI.dao.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Rank;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Leader {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Rank rank;
    private int groundTacticDraw;
    private int spaceTacticDraw;
    private int intel;
    private int specOps;
    private int diplomacySkill;
    private boolean proficientInLogistics;
    @Enumerated(EnumType.STRING)
    private Faction faction;
    private boolean isStartingLeader;
    @ManyToMany(targetEntity = ActionCard.class, mappedBy = "leaderChoices", fetch = FetchType.EAGER)
    @JsonIgnoreProperties("leaderChoices")
    private List<ActionCard> inActionCards;

    public Leader() { }
}
