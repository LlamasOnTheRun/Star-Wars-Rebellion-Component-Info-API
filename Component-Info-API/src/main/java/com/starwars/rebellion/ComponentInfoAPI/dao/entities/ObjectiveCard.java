package com.starwars.rebellion.ComponentInfoAPI.dao.entities;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.CardText;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ObjectiveCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private char reputationGained;
    @Embedded
    private CardText cardText;
    private String actionText;
}
