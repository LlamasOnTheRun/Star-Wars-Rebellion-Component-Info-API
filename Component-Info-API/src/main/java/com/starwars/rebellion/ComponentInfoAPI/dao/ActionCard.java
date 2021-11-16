package com.starwars.rebellion.ComponentInfoAPI.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ActionCard {
    @Id
    private long id;
    @Embedded
    private CardText cardText;
    @Enumerated(EnumType.STRING)
    private Faction faction;
    @OneToOne(targetEntity=Leader.class)
    private Leader recruitmentOptionOne;
    @OneToOne(targetEntity=Leader.class)
    private Leader recruitmentOptionTwo;
}
