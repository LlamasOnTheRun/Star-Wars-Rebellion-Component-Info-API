package com.starwars.rebellion.ComponentInfoAPI.dao.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToMany
    List<ActualSystem> systems;
    //TODO add onetomany annotation here for systems
}
