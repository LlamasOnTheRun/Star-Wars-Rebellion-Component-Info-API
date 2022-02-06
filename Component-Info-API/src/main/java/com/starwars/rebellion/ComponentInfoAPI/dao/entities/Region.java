package com.starwars.rebellion.ComponentInfoAPI.dao.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //TODO add onetomany annotation here for systems
}
