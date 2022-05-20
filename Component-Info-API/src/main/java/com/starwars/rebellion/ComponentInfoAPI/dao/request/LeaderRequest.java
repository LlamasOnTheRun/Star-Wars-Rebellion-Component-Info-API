package com.starwars.rebellion.ComponentInfoAPI.dao.request;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import lombok.Data;

@Data
public class LeaderRequest {
    private Integer id;
    private String name;
    private Faction faction;
    private Boolean startingLeader;
}
