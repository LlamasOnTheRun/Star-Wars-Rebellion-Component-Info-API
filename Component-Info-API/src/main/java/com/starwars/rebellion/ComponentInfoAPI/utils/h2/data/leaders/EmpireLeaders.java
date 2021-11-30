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
    public static List<Leader> fetch() {
        List<Leader> empireLeaderList = new ArrayList<>();
        addGeneralsToList(empireLeaderList);
        addAdmiralsToList(empireLeaderList);

        return empireLeaderList;
    }

    private static void addGeneralsToList(List<Leader> empireLeaderList) {
        empireLeaderList.add(colonelyularen());
        empireLeaderList.add(generalVeers());
        empireLeaderList.add(darthVader());
        empireLeaderList.add(generalTagge());
        empireLeaderList.add(bobaFett());
        empireLeaderList.add(moffJerjerrod());
    }

    private static void addAdmiralsToList(List<Leader> empireLeaderList) {
        empireLeaderList.add(admiralOzzel());
        empireLeaderList.add(emperorPalpatine());
        empireLeaderList.add(grandMoffTarkin());
        empireLeaderList.add(admiralPiett());
        empireLeaderList.add(soontirFel());
        empireLeaderList.add(janusGreejatus());
    }

    private static Leader colonelyularen() {
        Leader leader = new Leader();
        leader.setName("Colonel Yularen");
        leader.setMissionSkill(3,0,0,false);
        leader.setMilitarySkill(Rank.General,2,2);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader generalVeers() {
        Leader leader = new Leader();
        leader.setName("General Veers");
        leader.setMissionSkill(0,2,0,false);
        leader.setMilitarySkill(Rank.General,3,1);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader generalTagge() {
        Leader leader = new Leader();
        leader.setName("General Tagge");
        leader.setMissionSkill(0,1,0,true);
        leader.setMilitarySkill(Rank.General,2,1);
        leader.setStartingLeader(true);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader darthVader() {
        Leader leader = new Leader();
        leader.setName("Darth Vader");
        leader.setMissionSkill(0,3,2,false);
        leader.setMilitarySkill(Rank.General,3,2);
        leader.setStartingLeader(true);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader bobaFett() {
        Leader leader = new Leader();
        leader.setName("Boba Fett");
        leader.setMissionSkill(2,3,0,false);
        leader.setMilitarySkill(Rank.General,0,0);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader moffJerjerrod() {
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
    private static Leader admiralOzzel() {
        Leader leader = new Leader();
        leader.setName("Adiral Ozzel");
        leader.setMissionSkill(1,0,0,true);
        leader.setMilitarySkill(Rank.Admiral,1,2);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader emperorPalpatine() {
        Leader leader = new Leader();
        leader.setName("Emperor Palpatine");
        leader.setMissionSkill(2,0,3,false);
        leader.setMilitarySkill(Rank.Admiral,2,3);
        leader.setStartingLeader(true);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader grandMoffTarkin() {
        Leader leader = new Leader();
        leader.setName("Grand Moff Tarkin");
        leader.setMissionSkill(1,0,1,true);
        leader.setMilitarySkill(Rank.Admiral,1,2);
        leader.setStartingLeader(true);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader admiralPiett() {
        Leader leader = new Leader();
        leader.setName("Admiral Piett");
        leader.setMissionSkill(2,1,0,false);
        leader.setMilitarySkill(Rank.Admiral,1,3);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader soontirFel() {
        Leader leader = new Leader();
        leader.setName("Soontir Fel");
        leader.setMissionSkill(1,2,0,false);
        leader.setMilitarySkill(Rank.Admiral,1,2);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.IMPERIAL);

        return leader;
    }

    private static Leader janusGreejatus() {
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
