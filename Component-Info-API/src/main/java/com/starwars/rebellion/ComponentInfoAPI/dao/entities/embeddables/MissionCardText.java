package com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class MissionCardText {
    private String title;
    private String description;
}
