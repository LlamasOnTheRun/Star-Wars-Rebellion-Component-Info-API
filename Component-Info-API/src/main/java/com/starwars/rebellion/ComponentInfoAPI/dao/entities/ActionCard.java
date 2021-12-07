package com.starwars.rebellion.ComponentInfoAPI.dao.entities;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.CardText;
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
    private CardText cardText;
    @Enumerated(EnumType.STRING)
    private Faction faction;
    @ManyToMany
    private List<Leader> leaderChoices;
    private boolean isStartingCard;
    //TODO need to add ring object with manytoone relationship here
}
