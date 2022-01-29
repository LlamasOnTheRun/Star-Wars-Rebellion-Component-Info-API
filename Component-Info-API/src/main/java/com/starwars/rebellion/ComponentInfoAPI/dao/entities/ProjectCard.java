package com.starwars.rebellion.ComponentInfoAPI.dao.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class ProjectCard extends MissionCard {
    private boolean isProjectCard = true;
}
