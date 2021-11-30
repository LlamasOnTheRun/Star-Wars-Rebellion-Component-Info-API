package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders;

import com.starwars.rebellion.ComponentInfoAPI.dao.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.Leader;
import com.starwars.rebellion.ComponentInfoAPI.dao.Rank;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RebelLeaders {
    public static final Leader CHEWBACCA = getChewbacca();
    public static final Leader GENERAL_MADINE = getGeneralMadine();
    public static final Leader GENERAL_RIEEKAN = getGeneralRieekan();
    public static final Leader LUKE_SKYWALKER = getLukeSkywalker();
    public static final Leader LUKE_SKYWALKER_JEDI = getLukeSkywalkerJedi();
    public static final Leader OBI_WAN_KENOBI = getObiWanKenobi();
    public static final Leader PRINCESS_LEIA = getPrincessLeia();
    public static final Leader ADMIRAL_ACKBAR = getAdmiralAckbar();
    public static final Leader HAN_SOLO = getHanSolo();
    public static final Leader JAN_DODONNA = getJanDodonna();
    public static final Leader LANDO_CALRISSIAN = getLandoCalrissian();
    public static final Leader MON_MOTHMA = getMonMothma();
    public static final Leader WEDGE_ANTILLES = getWedgeAntilles();

    public static List<Leader> fetch() {
        List<Leader> rebelLeaderList = new ArrayList<>();
        addGeneralsToList(rebelLeaderList);
        addAdmiralsToList(rebelLeaderList);

        return rebelLeaderList;
    }

    private static void addGeneralsToList(List<Leader> rebelLeaderList) {
        rebelLeaderList.add(CHEWBACCA);
        rebelLeaderList.add(GENERAL_MADINE);
        rebelLeaderList.add(GENERAL_RIEEKAN);
        rebelLeaderList.add(LUKE_SKYWALKER);
        rebelLeaderList.add(LUKE_SKYWALKER_JEDI);
        rebelLeaderList.add(OBI_WAN_KENOBI);
        rebelLeaderList.add(PRINCESS_LEIA);
    }

    private static void addAdmiralsToList(List<Leader> rebelLeaderList) {
        rebelLeaderList.add(ADMIRAL_ACKBAR);
        rebelLeaderList.add(HAN_SOLO);
        rebelLeaderList.add(JAN_DODONNA);
        rebelLeaderList.add(LANDO_CALRISSIAN);
        rebelLeaderList.add(MON_MOTHMA);
        rebelLeaderList.add(WEDGE_ANTILLES);
    }

    private static Leader getAdmiralAckbar() {
        Leader leader = new Leader();
        leader.setName("Admiral Ackbar");
        leader.setMissionSkill(0,0,2,true);
        leader.setMilitarySkill(Rank.Admiral,1,3);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getChewbacca() {
        Leader leader = new Leader();
        leader.setName("Chewbacca");
        leader.setMissionSkill(0,3,0,false);
        leader.setMilitarySkill(Rank.General,2,1);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getGeneralMadine() {
        Leader leader = new Leader();
        leader.setName("General Madine");
        leader.setMissionSkill(2, 2, 0, false);
        leader.setMilitarySkill(Rank.General, 3, 1);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getGeneralRieekan() {
        Leader leader = new Leader();
        leader.setName("General Rieekan");
        leader.setMissionSkill(0, 1, 1, true);
        leader.setMilitarySkill(Rank.General, 3, 1);
        leader.setStartingLeader(true);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getHanSolo() {
        Leader leader = new Leader();
        leader.setName("Han Solo");
        leader.setMissionSkill(1,2,1,false);
        leader.setMilitarySkill(Rank.Admiral,2,2);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getJanDodonna() {
        Leader leader = new Leader();
        leader.setName("Jan Dodonna");
        leader.setMissionSkill(2,0,1,false);
        leader.setMilitarySkill(Rank.Admiral,1,2);
        leader.setStartingLeader(true);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getLandoCalrissian() {
        Leader leader = new Leader();
        leader.setName("Lando Calrissian");
        leader.setMissionSkill(1,1,1,true);
        leader.setMilitarySkill(Rank.Admiral,2,2);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getLukeSkywalker() {
        Leader leader = new Leader();
        leader.setName("Luke Skywalker");
        leader.setMissionSkill(2, 1, 0, false);
        leader.setMilitarySkill(Rank.General, 2, 2);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getLukeSkywalkerJedi() {
        Leader leader = new Leader();
        leader.setName("Luke Skywalker (Jedi)");
        leader.setMissionSkill(3, 2, 0, false);
        leader.setMilitarySkill(Rank.General, 3, 3);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getMonMothma() {
        Leader leader = new Leader();
        leader.setName("Mon Mothma");
        leader.setMissionSkill(0,0,3,true);
        leader.setMilitarySkill(Rank.Admiral,0,0);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getObiWanKenobi() {
        Leader leader = new Leader();
        leader.setName("Obi Wan Kenobi");
        leader.setMissionSkill(3,0,1,false);
        leader.setMilitarySkill(Rank.General,0,0);
        leader.setStartingLeader(false);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getPrincessLeia() {
        Leader leader = new Leader();
        leader.setName("Princess Leia");
        leader.setMissionSkill(2, 1, 2, false);
        leader.setMilitarySkill(Rank.General,1,1);
        leader.setStartingLeader(true);
        leader.setRingID(0);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getWedgeAntilles() {
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
