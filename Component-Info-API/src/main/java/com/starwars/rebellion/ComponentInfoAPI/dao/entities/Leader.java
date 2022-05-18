package com.starwars.rebellion.ComponentInfoAPI.dao.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MilitarySkillPoints;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MissionSkillPoints;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Rank;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Leader {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Embedded
    private MissionSkillPoints missionSkillPoints;
    @Embedded
    private MilitarySkillPoints militarySkillPoints;
    @Enumerated(EnumType.STRING)
    private Faction faction;
    private boolean isStartingLeader;
    @ManyToMany(targetEntity = ActionCard.class, mappedBy = "leaderChoices", fetch = FetchType.EAGER)
    @JsonIgnoreProperties("leaderChoices")
    private List<ActionCard> inActionCards;

    public Leader() { }

    public void setMilitarySkillPoints(Rank rank, int groundTacticDraw, int spaceTacticDraw) {
        militarySkillPoints = new MilitarySkillPoints();
        militarySkillPoints.setRank(rank);
        militarySkillPoints.setGroundTacticDraw(groundTacticDraw);
        militarySkillPoints.setSpaceTacticDraw(spaceTacticDraw);
    }

    public void setMissionSkillPoints(int intel, int specOps, int diplomacySkill, boolean proficientInLogistics) {
        missionSkillPoints = new MissionSkillPoints();
        missionSkillPoints.setIntel(intel);
        missionSkillPoints.setSpecOps(specOps);
        missionSkillPoints.setDiplomacySkill(diplomacySkill);
        missionSkillPoints.setProficientInLogistics(proficientInLogistics);
    }
}
