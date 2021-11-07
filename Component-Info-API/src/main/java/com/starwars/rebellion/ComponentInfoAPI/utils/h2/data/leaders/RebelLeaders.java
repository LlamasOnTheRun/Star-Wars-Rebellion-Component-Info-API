package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders;

import com.starwars.rebellion.ComponentInfoAPI.dao.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.Leader;
import com.starwars.rebellion.ComponentInfoAPI.dao.Rank;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RebelLeaders {

    private static List<Leader> rebelLeaderList;

    public static List<Leader> fetch() {
        rebelLeaderList = new ArrayList<>();

        addGeneralsToList();
        addAdmiralsToList();

        return rebelLeaderList;
    }

    private static void addGeneralsToList() {
        rebelLeaderList.add(LUKE_SKYWALKER);
    }

    private static void addAdmiralsToList() {

    }

    private static Leader ADMIRAL_ACKBAR = new Leader() {{
        setMissionSkill(0, 0, 2, true);
        setMilitarySkill(Rank.Admiral, 1, 3);
        setStartingLeader(false);
        setRingID(0);
        setFaction(Faction.REBEL);
        setName("Admiral Ackbar");
    }};

    private static Leader CHEWBACCA = new Leader() {{
        setMissionSkill(0, 3, 0, false);
        setMilitarySkill(Rank.General, 2, 1);
        setStartingLeader(false);
        setRingID(0);
        setFaction(Faction.REBEL);
        setName("Chewbacca");
    }};

    private static Leader GENERAL_MADINE = new Leader() {{
        setMissionSkill(2, 2, 0, false);
        setMilitarySkill(Rank.General, 3, 1);
        setStartingLeader(false);
        setRingID(0);
        setFaction(Faction.REBEL);
        setName("General Madine");
    }};

    private static Leader GENERAL_RIEEKAN = new Leader() {{
        setMissionSkill(0, 1, 1, true);
        setMilitarySkill(Rank.General, 3, 1);
        setStartingLeader(true);
        setRingID(0);
        setFaction(Faction.REBEL);
        setName("General Rieekan");
    }};

    private static Leader HAN_SOLO = new Leader() {{
        setMissionSkill(1,2,1,false);
        setMilitarySkill(Rank.Admiral,2,2);
        setStartingLeader(false);
        setRingID(0);
        setFaction(Faction.REBEL);
        setName("Han Solo");
    }};

    private static Leader JAN_DODONNA = new Leader() {{
        setMissionSkill(2,0,1,false);
        setMilitarySkill(Rank.Admiral,1,2);
        setStartingLeader(true);
        setRingID(0);
        setFaction(Faction.REBEL);
        setName("Jan Dodonna");
    }};

    private static Leader LUKE_SKYWALKER = new Leader() {{
        setMissionSkill(2, 1, 0, false);
        setMilitarySkill(Rank.General, 2, 2);
        setStartingLeader(false);
        setRingID(0);
        setFaction(Faction.REBEL);
        setName("Luke Skywalker");
    }};

    private static Leader LUKE_SKYWALKER_JEDI = new Leader() {{
        setMissionSkill(3, 2, 0, false);
        setMilitarySkill(Rank.General, 3, 3);
        setStartingLeader(false);
        setRingID(0);
        setFaction(Faction.REBEL);
        setName("Luke Skywalker (Jedi)");
    }};

    private static Leader WEDGE_ANTILLES = new Leader() {{
        setMissionSkill(0, 2, 0, false);
        setMilitarySkill(Rank.Admiral,1,3);
        setStartingLeader(false);
        setRingID(0);
        setFaction(Faction.REBEL);
        setName("Wedge Antilles");
    }};
}
