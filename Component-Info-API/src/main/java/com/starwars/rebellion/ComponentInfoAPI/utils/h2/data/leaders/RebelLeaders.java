package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders;

import com.starwars.rebellion.ComponentInfoAPI.dao.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.Leader;
import com.starwars.rebellion.ComponentInfoAPI.dao.Rank;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RebelLeaders {

    public static List<Leader> fetch() {
        List<Leader> rebelLeaderList = new ArrayList<>();
        addGeneralsToList(rebelLeaderList);
        addAdmiralsToList(rebelLeaderList);

        return rebelLeaderList;
    }

    private static void addGeneralsToList(List<Leader> rebelLeaderList) {
        rebelLeaderList.add(getChewbacca());
        rebelLeaderList.add(getGeneralMadine());
        rebelLeaderList.add(getGeneralRieekan());
        rebelLeaderList.add(getLukeSkywalker());
        rebelLeaderList.add(getLukeSkywalkerJedi());
        rebelLeaderList.add(getObiWanKenobi());
        rebelLeaderList.add(getPrincessLeia());
    }

    private static void addAdmiralsToList(List<Leader> rebelLeaderList) {
        rebelLeaderList.add(getAdmiralAckbar());
        rebelLeaderList.add(getHanSolo());
        rebelLeaderList.add(getJanDodonna());
        rebelLeaderList.add(getLandoCalrissian());
        rebelLeaderList.add(getMonMothma());
        rebelLeaderList.add(getWedgeAntilles());
    }

    public static Leader getAdmiralAckbar() {
        Leader leader = new Leader();
        leader.setName("Admiral Ackbar");
        leader.setMissionSkill(0,0,2,true);
        leader.setMilitarySkill(Rank.Admiral,1,3);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    public static Leader getChewbacca() {
        Leader leader = new Leader();
        leader.setName("Chewbacca");
        leader.setMissionSkill(0,3,0,false);
        leader.setMilitarySkill(Rank.General,2,1);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    public static Leader getGeneralMadine() {
        Leader leader = new Leader();
        leader.setName("General Madine");
        leader.setMissionSkill(2, 2, 0, false);
        leader.setMilitarySkill(Rank.General, 3, 1);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    public static Leader getGeneralRieekan() {
        Leader leader = new Leader();
        leader.setName("General Rieekan");
        leader.setMissionSkill(0, 1, 1, true);
        leader.setMilitarySkill(Rank.General, 3, 1);
        leader.setStartingLeader(true);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    public static Leader getHanSolo() {
        Leader leader = new Leader();
        leader.setName("Han Solo");
        leader.setMissionSkill(1,2,1,false);
        leader.setMilitarySkill(Rank.Admiral,2,2);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    public static Leader getJanDodonna() {
        Leader leader = new Leader();
        leader.setName("Jan Dodonna");
        leader.setMissionSkill(2,0,1,false);
        leader.setMilitarySkill(Rank.Admiral,1,2);
        leader.setStartingLeader(true);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    public static Leader getLandoCalrissian() {
        Leader leader = new Leader();
        leader.setName("Lando Calrissian");
        leader.setMissionSkill(1,1,1,true);
        leader.setMilitarySkill(Rank.Admiral,2,2);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    public static Leader getLukeSkywalker() {
        Leader leader = new Leader();
        leader.setName("Luke Skywalker");
        leader.setMissionSkill(2, 1, 0, false);
        leader.setMilitarySkill(Rank.General, 2, 2);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    public static Leader getLukeSkywalkerJedi() {
        Leader leader = new Leader();
        leader.setName("Luke Skywalker (Jedi)");
        leader.setMissionSkill(3, 2, 0, false);
        leader.setMilitarySkill(Rank.General, 3, 3);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    public static Leader getMonMothma() {
        Leader leader = new Leader();
        leader.setName("Mon Mothma");
        leader.setMissionSkill(0,0,3,true);
        leader.setMilitarySkill(Rank.Admiral,0,0);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    public static Leader getObiWanKenobi() {
        Leader leader = new Leader();
        leader.setName("Obi Wan Kenobi");
        leader.setMissionSkill(3,0,1,false);
        leader.setMilitarySkill(Rank.General,0,0);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    public static Leader getPrincessLeia() {
        Leader leader = new Leader();
        leader.setName("Princess Leia");
        leader.setMissionSkill(2, 1, 2, false);
        leader.setMilitarySkill(Rank.General,1,1);
        leader.setStartingLeader(true);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    public static Leader getWedgeAntilles() {
        Leader leader = new Leader();
        leader.setName("Wedge Antilles");
        leader.setMissionSkill(0, 2, 0, false);
        leader.setMilitarySkill(Rank.Admiral,1,3);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }
}
