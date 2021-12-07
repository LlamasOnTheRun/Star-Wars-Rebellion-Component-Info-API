package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders;

import com.starwars.rebellion.ComponentInfoAPI.dao.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.Leader;
import com.starwars.rebellion.ComponentInfoAPI.dao.Rank;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//blue: intel
//yellow: diplo.
//red: spec ops
//white with arrow: logistics

@Service
public class EmpireLeaders {
    public static final Leader COLONEL_YULAREN = getColonelyularen();
    public static final Leader GENERAL_VEERS = getGeneralVeers();
    public static final Leader GENERAL_TAGGE = getGeneralTagge();
    public static final Leader DARTH_VADER = getDarthVader();
    public static final Leader BOBA_FETT = getBobaFett();
    public static final Leader MOFF_JERJERROD = getMoffJerjerrod();
    public static final Leader ADMIRAL_OZZEL = getAdmiralOzzel();
    public static final Leader EMPOROR_PALPATINE = getEmperorPalpatine();
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
        empireLeaderList.add(EMPOROR_PALPATINE);
        empireLeaderList.add(GRAND_MOFF_TARKIN);
        empireLeaderList.add(ADMIRAL_PIETT);
        empireLeaderList.add(SOONTIR_FEL);
        empireLeaderList.add(JANUS_GREEJATUS);
    }

    private static Leader getColonelyularen() {
        Leader leader = new Leader();
        leader.setName("Colonel Yularen");
        leader.setMissionSkill(3,0,0,false);
        leader.setMilitarySkill(Rank.General,2,2);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getGeneralVeers() {
        Leader leader = new Leader();
        leader.setName("General Veers");
        leader.setMissionSkill(0,2,0,false);
        leader.setMilitarySkill(Rank.General,3,1);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getGeneralTagge() {
        Leader leader = new Leader();
        leader.setName("General Tagge");
        leader.setMissionSkill(0,1,0,true);
        leader.setMilitarySkill(Rank.General,2,1);
        leader.setStartingLeader(true);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getDarthVader() {
        Leader leader = new Leader();
        leader.setName("Darth Vader");
        leader.setMissionSkill(0,3,2,false);
        leader.setMilitarySkill(Rank.General,3,2);
        leader.setStartingLeader(true);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getBobaFett() {
        Leader leader = new Leader();
        leader.setName("Boba Fett");
        leader.setMissionSkill(2,3,0,false);
        leader.setMilitarySkill(Rank.General,0,0);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getMoffJerjerrod() {
        Leader leader = new Leader();
        leader.setName("Moff Jerjerrod");
        leader.setMissionSkill(0,0,1,true);
        leader.setMilitarySkill(Rank.General,1,1);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    //--------------------------Admirals------------------------
    private static Leader getAdmiralOzzel() {
        Leader leader = new Leader();
        leader.setName("Adiral Ozzel");
        leader.setMissionSkill(1,0,0,true);
        leader.setMilitarySkill(Rank.Admiral,1,2);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getEmperorPalpatine() {
        Leader leader = new Leader();
        leader.setName("Emperor Palpatine");
        leader.setMissionSkill(2,0,3,false);
        leader.setMilitarySkill(Rank.Admiral,2,3);
        leader.setStartingLeader(true);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getGrandMoffTarkin() {
        Leader leader = new Leader();
        leader.setName("Grand Moff Tarkin");
        leader.setMissionSkill(1,0,1,true);
        leader.setMilitarySkill(Rank.Admiral,1,2);
        leader.setStartingLeader(true);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getAdmiralPiett() {
        Leader leader = new Leader();
        leader.setName("Admiral Piett");
        leader.setMissionSkill(2,1,0,false);
        leader.setMilitarySkill(Rank.Admiral,1,3);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getSoontirFel() {
        Leader leader = new Leader();
        leader.setName("Soontir Fel");
        leader.setMissionSkill(1,2,0,false);
        leader.setMilitarySkill(Rank.Admiral,1,2);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader getJanusGreejatus() {
        Leader leader = new Leader();
        leader.setName("Janus GreeJatus");
        leader.setMissionSkill(1,0,2,false);
        leader.setMilitarySkill(Rank.Admiral,0,0);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }
}
