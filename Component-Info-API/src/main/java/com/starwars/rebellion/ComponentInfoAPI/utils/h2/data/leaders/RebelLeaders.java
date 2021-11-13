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
        rebelLeaderList.add(chewbacca());
        rebelLeaderList.add(generalMadine());
        rebelLeaderList.add(generalRieekan());
        rebelLeaderList.add(lukeSkywalker());
        rebelLeaderList.add(lukeSkywalkerJedi());
        rebelLeaderList.add(obiWanKenobi());
        rebelLeaderList.add(princessLeia());
    }

    private static void addAdmiralsToList(List<Leader> rebelLeaderList) {
        rebelLeaderList.add(admiralAckbar());
        rebelLeaderList.add(hanSolo());
        rebelLeaderList.add(janDodonna());
        rebelLeaderList.add(landoCalrissian());
        rebelLeaderList.add(monMothma());
        rebelLeaderList.add(wedgeAntilles());
    }

    private static Leader admiralAckbar() {
        Leader leader = new Leader();
        leader.setName("Admiral Ackbar");
        leader.setMissionSkill(0,0,2,true);
        leader.setMilitarySkill(Rank.Admiral,1,3);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);

        return leader;
    }

    private static Leader chewbacca() {
        Leader leader = new Leader();
        leader.setName("Chewbacca");
        leader.setMissionSkill(0,3,0,false);
        leader.setMilitarySkill(Rank.General,2,1);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);

        return leader;
    }

    private static Leader generalMadine() {
        Leader leader = new Leader();
        leader.setName("General Madine");
        leader.setMissionSkill(2, 2, 0, false);
        leader.setMilitarySkill(Rank.General, 3, 1);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);

        return leader;
    }

    private static Leader generalRieekan() {
        Leader leader = new Leader();
        leader.setName("General Rieekan");
        leader.setMissionSkill(0, 1, 1, true);
        leader.setMilitarySkill(Rank.General, 3, 1);
        leader.setStartingLeader(true);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);

        return leader;
    }

    private static Leader hanSolo() {
        Leader leader = new Leader();
        leader.setName("Han Solo");
        leader.setMissionSkill(1,2,1,false);
        leader.setMilitarySkill(Rank.Admiral,2,2);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);

        return leader;
    }

    private static Leader janDodonna() {
        Leader leader = new Leader();
        leader.setName("Jan Dodonna");
        leader.setMissionSkill(2,0,1,false);
        leader.setMilitarySkill(Rank.Admiral,1,2);
        leader.setStartingLeader(true);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);

        return leader;
    }

    private static Leader landoCalrissian() {
        Leader leader = new Leader();
        leader.setName("Lando Calrissian");
        leader.setMissionSkill(1,1,1,true);
        leader.setMilitarySkill(Rank.Admiral,2,2);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);

        return leader;
    }

    private static Leader lukeSkywalker() {
        Leader leader = new Leader();
        leader.setName("Luke Skywalker");
        leader.setMissionSkill(2, 1, 0, false);
        leader.setMilitarySkill(Rank.General, 2, 2);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);

        return leader;
    }

    private static Leader lukeSkywalkerJedi() {
        Leader leader = new Leader();
        leader.setName("Luke Skywalker (Jedi)");
        leader.setMissionSkill(3, 2, 0, false);
        leader.setMilitarySkill(Rank.General, 3, 3);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);

        return leader;
    }

    private static Leader monMothma() {
        Leader leader = new Leader();
        leader.setName("Mon Mothma");
        leader.setMissionSkill(0,0,3,true);
        leader.setMilitarySkill(Rank.Admiral,0,0);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);

        return leader;
    }

    private static Leader obiWanKenobi() {
        Leader leader = new Leader();
        leader.setName("Obi Wan Kenobi");
        leader.setMissionSkill(3,0,1,false);
        leader.setMilitarySkill(Rank.General,0,0);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);

        return leader;
    }

    private static Leader princessLeia() {
        Leader leader = new Leader();
        leader.setName("Princess Leia");
        leader.setMissionSkill(2, 1, 2, false);
        leader.setMilitarySkill(Rank.General,1,1);
        leader.setStartingLeader(true);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);

        return leader;
    }

    private static Leader wedgeAntilles() {
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
