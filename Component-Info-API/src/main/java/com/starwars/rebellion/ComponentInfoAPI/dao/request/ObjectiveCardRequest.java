package com.starwars.rebellion.ComponentInfoAPI.dao.request;

import lombok.Data;

@Data
public class ObjectiveCardRequest {
    private int id;
    private String title;
    private boolean deckLevelOne;
    private boolean deckLevelTwo;
    private boolean deckLevelThree;
}
