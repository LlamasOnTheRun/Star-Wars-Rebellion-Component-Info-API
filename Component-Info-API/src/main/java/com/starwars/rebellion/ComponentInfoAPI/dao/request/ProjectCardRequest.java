package com.starwars.rebellion.ComponentInfoAPI.dao.request;

import lombok.Data;

@Data
public class ProjectCardRequest {
    private Integer id;
    private String title;
    private Boolean isProjectCard = true;
    private Integer totalInDeck;
}
