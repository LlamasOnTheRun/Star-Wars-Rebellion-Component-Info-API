package com.starwars.rebellion.ComponentInfoAPI.dao;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Embedded;

import javax.persistence.*;

import static org.springframework.data.relational.core.mapping.Embedded.OnEmpty.USE_EMPTY;

@Entity
@Data
public class Leader {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Embedded(onEmpty = USE_EMPTY)
    private MissionSkill missionSkill;
    @Embedded(onEmpty = USE_EMPTY)
    private MilitarySkill militarySkill;
    @Enumerated(EnumType.STRING)
    private Faction faction;
    private boolean isStartingLeader;
    private boolean outOfAction = false;
    //TODO Add FK config here for future ring data object
    private int ringID;

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
