package com.starwars.rebellion.ComponentInfoAPI.dao.entities;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.CardText;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.TacticType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class TacticCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private CardText cardText;
    private TacticType tacticType;
    private boolean isLightsaberSymbolRequired;
    private int totalInDeck;
}
