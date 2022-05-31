package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Leader;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Rank;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpireLeaderData {
    public static final Leader COLONEL_YULAREN = getColonelyularen();
    public static final Leader GENERAL_VEERS = getGeneralVeers();
    public static final Leader GENERAL_TAGGE = getGeneralTagge();
    public static final Leader DARTH_VADER = getDarthVader();
    public static final Leader BOBA_FETT = getBobaFett();
    public static final Leader MOFF_JERJERROD = getMoffJerjerrod();
    public static final Leader ADMIRAL_OZZEL = getAdmiralOzzel();
    public static final Leader EMPEROR_PALPATINE = getEmperorPalpatine();
    public static final Leader GRAND_MOFF_TARKIN = getGrandMoffTarkin();
    public static final Leader ADMIRAL_PIETT = getAdmiralPiett();
    public static final Leader SOONTIR_FEL = getSoontirFel();
    public static final Leader JANUS_GREEJATUS = getJanusGreejatus();

    public static List<Leader> fetch() {
        List<Leader> empireLeaderList = new ArrayList<>();
        addGeneralsToList(empireLeaderList);
        addAdmiralsToList(empireLeaderList);

        return empireLeaderList;
    }

    private static void addGeneralsToList(List<Leader> empireLeaderList) {
        empireLeaderList.add(COLONEL_YULAREN);
        empireLeaderList.add(GENERAL_VEERS);
        empireLeaderList.add(GENERAL_TAGGE);
        empireLeaderList.add(DARTH_VADER);
        empireLeaderList.add(BOBA_FETT);
        empireLeaderList.add(MOFF_JERJERROD);
    }

    private static void addAdmiralsToList(List<Leader> empireLeaderList) {
        empireLeaderList.add(ADMIRAL_OZZEL);
        empireLeaderList.add(EMPEROR_PALPATINE);
        empireLeaderList.add(GRAND_MOFF_TARKIN);
        empireLeaderList.add(ADMIRAL_PIETT);
        empireLeaderList.add(SOONTIR_FEL);
        empireLeaderList.add(JANUS_GREEJATUS);
    }

    private static Leader getColonelyularen() {
        Leader leader = new Leader();
        leader.setName("Colonel Yularen");
        leader.setIntel(3);
        leader.setSpecOps(0);
        leader.setDiplomacySkill(0);
        leader.setProficientInLogistics(false);
        leader.setRank(Rank.GENERAL);
        leader.setGroundTacticDraw(2);
        leader.setSpaceTacticDraw(2);
        leader.setStartingLeader(false);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getGeneralVeers() {
        Leader leader = new Leader();
        leader.setName("General Veers");
        leader.setIntel(0);
        leader.setSpecOps(2);
        leader.setDiplomacySkill(0);
        leader.setProficientInLogistics(false);
        leader.setRank(Rank.GENERAL);
        leader.setGroundTacticDraw(3);
        leader.setSpaceTacticDraw(1);
        leader.setStartingLeader(false);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getGeneralTagge() {
        Leader leader = new Leader();
        leader.setName("General Tagge");
        leader.setIntel(0);
        leader.setSpecOps(1);
        leader.setDiplomacySkill(0);
        leader.setProficientInLogistics(true);
        leader.setRank(Rank.GENERAL);
        leader.setGroundTacticDraw(2);
        leader.setSpaceTacticDraw(1);
        leader.setStartingLeader(true);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getDarthVader() {
        Leader leader = new Leader();
        leader.setName("Darth Vader");
        leader.setIntel(0);
        leader.setSpecOps(3);
        leader.setDiplomacySkill(2);
        leader.setProficientInLogistics(false);
        leader.setRank(Rank.GENERAL);
        leader.setGroundTacticDraw(3);
        leader.setSpaceTacticDraw(2);
        leader.setStartingLeader(true);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getBobaFett() {
        Leader leader = new Leader();
        leader.setName("Boba Fett");
        leader.setIntel(2);
        leader.setSpecOps(3);
        leader.setDiplomacySkill(0);
        leader.setProficientInLogistics(false);
        leader.setRank(Rank.GENERAL);
        leader.setGroundTacticDraw(0);
        leader.setSpaceTacticDraw(0);
        leader.setStartingLeader(false);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getMoffJerjerrod() {
        Leader leader = new Leader();
        leader.setName("Moff Jerjerrod");
        leader.setIntel(0);
        leader.setSpecOps(0);
        leader.setDiplomacySkill(1);
        leader.setProficientInLogistics(true);
        leader.setRank(Rank.GENERAL);
        leader.setGroundTacticDraw(1);
        leader.setSpaceTacticDraw(1);
        leader.setStartingLeader(false);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getAdmiralOzzel() {
        Leader leader = new Leader();
        leader.setName("Adiral Ozzel");
        leader.setIntel(1);
        leader.setSpecOps(0);
        leader.setDiplomacySkill(0);
        leader.setProficientInLogistics(true);
        leader.setRank(Rank.ADMIRAL);
        leader.setGroundTacticDraw(1);
        leader.setSpaceTacticDraw(2);
        leader.setStartingLeader(false);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getEmperorPalpatine() {
        Leader leader = new Leader();
        leader.setName("Emperor Palpatine");
        leader.setIntel(2);
        leader.setSpecOps(0);
        leader.setDiplomacySkill(3);
        leader.setProficientInLogistics(false);
        leader.setRank(Rank.ADMIRAL);
        leader.setGroundTacticDraw(2);
        leader.setSpaceTacticDraw(3);
        leader.setStartingLeader(true);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getGrandMoffTarkin() {
        Leader leader = new Leader();
        leader.setName("Grand Moff Tarkin");
        leader.setIntel(1);
        leader.setSpecOps(0);
        leader.setDiplomacySkill(1);
        leader.setProficientInLogistics(true);
        leader.setRank(Rank.ADMIRAL);
        leader.setGroundTacticDraw(1);
        leader.setSpaceTacticDraw(2);
        leader.setStartingLeader(true);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getAdmiralPiett() {
        Leader leader = new Leader();
        leader.setName("Admiral Piett");
        leader.setIntel(2);
        leader.setSpecOps(1);
        leader.setDiplomacySkill(0);
        leader.setProficientInLogistics(false);
        leader.setRank(Rank.ADMIRAL);
        leader.setGroundTacticDraw(1);
        leader.setSpaceTacticDraw(3);
        leader.setStartingLeader(false);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getSoontirFel() {
        Leader leader = new Leader();
        leader.setName("Soontir Fel");
        leader.setIntel(1);
        leader.setSpecOps(2);
        leader.setDiplomacySkill(0);
        leader.setProficientInLogistics(false);
        leader.setRank(Rank.ADMIRAL);
        leader.setGroundTacticDraw(1);
        leader.setSpaceTacticDraw(2);
        leader.setStartingLeader(false);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getJanusGreejatus() {
        Leader leader = new Leader();
        leader.setName("Janus GreeJatus");
        leader.setIntel(1);
        leader.setSpecOps(0);
        leader.setDiplomacySkill(2);
        leader.setProficientInLogistics(false);
        leader.setRank(Rank.ADMIRAL);
        leader.setGroundTacticDraw(0);
        leader.setSpaceTacticDraw(0);
        leader.setStartingLeader(false);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }
}
