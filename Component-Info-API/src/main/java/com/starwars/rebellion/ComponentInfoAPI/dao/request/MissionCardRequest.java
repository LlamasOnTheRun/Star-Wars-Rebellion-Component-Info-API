package com.starwars.rebellion.ComponentInfoAPI.dao.request;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MissionSkillType;
import lombok.Data;

@Data
public class MissionCardRequest {
    private Integer id;
    private String title;
    private LeaderRequest leaderBonusSearch;
    private MissionSkillType skillType;
    private Integer minSkillNumRequired;
    private Faction faction;
    private Boolean isStartingCard;
    private Integer totalInDeck;
}
