package com.starwars.rebellion.ComponentInfoAPI.dao.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @OneToMany(targetEntity = System.class, mappedBy = "region", fetch = FetchType.EAGER)
    @JsonIgnoreProperties("region")
    List<System> systems;
}
