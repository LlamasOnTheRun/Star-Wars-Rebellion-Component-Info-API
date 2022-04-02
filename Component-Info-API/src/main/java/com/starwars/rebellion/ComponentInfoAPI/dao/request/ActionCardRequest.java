package com.starwars.rebellion.ComponentInfoAPI.dao.request;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import lombok.Data;

@Data
public class ActionCardRequest {
    private int id;
    private Faction faction;
    private String leaderName;
    private boolean startingCard;
}
