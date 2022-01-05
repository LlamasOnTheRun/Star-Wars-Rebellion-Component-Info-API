package com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Lob;

@Data
@Embeddable
public class MissionCardText {
    private String title;
    @Lob
    private String description;
}
