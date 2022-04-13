package com.starwars.rebellion.ComponentInfoAPI.dao.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.ActionCardText;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class ActionCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Embedded
    private ActionCardText actionCardText;
    @Enumerated(EnumType.STRING)
    private Faction faction;
    @ManyToMany
    @JsonIgnoreProperties("inActionCards")
    private List<Leader> leaderChoices;
    private boolean isStartingCard;
}
