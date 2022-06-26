package com.starwars.rebellion.ComponentInfoAPI.dao.request;

import lombok.Data;

@Data
public class ObjectiveCardRequest {
    private Integer id;
    private String title;
    private Boolean deckLevelOne;
    private Boolean deckLevelTwo;
    private Boolean deckLevelThree;
}
