package com.starwars.rebellion.ComponentInfoAPI.dao.entities;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MilitarySkill;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MissionSkill;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Rank;
import lombok.*;

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
    private MissionSkill missionSkill;
    @Embedded
    private MilitarySkill militarySkill;
    @Enumerated(EnumType.STRING)
    private Faction faction;
    private boolean isStartingLeader;
    private boolean outOfAction = false; //TODO may get rid of
    private int ringID; //TODO may get rid of
    @ManyToMany(targetEntity= ActionCard.class, mappedBy="leaderChoices", fetch = FetchType.EAGER)
    private List<ActionCard> inActionCards;

    public Leader() { }

    public void setMilitarySkill(Rank rank, int groundTacticDraw, int spaceTacticDraw) {
        militarySkill = new MilitarySkill();
        militarySkill.setRank(rank);
        militarySkill.setGroundTacticDraw(groundTacticDraw);
        militarySkill.setSpaceTacticDraw(spaceTacticDraw);
    }

    public void setMissionSkill(int intel, int specOps, int diplomacySkill, boolean proficientInLogistics) {
        missionSkill = new MissionSkill();
        missionSkill.setIntel(intel);
        missionSkill.setSpecOps(specOps);
        missionSkill.setDiplomacySkill(diplomacySkill);
        missionSkill.setProficientInLogistics(proficientInLogistics);
    }
}
