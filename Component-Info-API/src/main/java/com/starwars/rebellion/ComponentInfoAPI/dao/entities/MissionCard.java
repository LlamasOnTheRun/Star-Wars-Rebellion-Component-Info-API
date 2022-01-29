package com.starwars.rebellion.ComponentInfoAPI.dao.entities;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MissionCardText;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MissionSkillType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class MissionCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Embedded
    private MissionCardText cardText;
    @OneToOne
    private Leader leaderBonus;
    @Enumerated(EnumType.STRING)
    private MissionSkillType skillType;
    private int minSkillNumRequired;
    @Enumerated(EnumType.STRING)
    private Faction faction;
    private boolean isStartingCard;
    private int totalInDeck;
    private boolean isProjectCard = false;
}
