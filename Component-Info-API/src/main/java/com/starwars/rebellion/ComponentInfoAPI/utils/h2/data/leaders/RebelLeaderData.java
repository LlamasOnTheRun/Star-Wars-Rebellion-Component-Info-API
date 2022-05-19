package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Leader;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Rank;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RebelLeaderData {
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
        leader.setIntel(0);
        leader.setSpecOps(0);
        leader.setDiplomacySkill(2);
        leader.setProficientInLogistics(true);
        leader.setRank(Rank.ADMIRAL);
        leader.setGroundTacticDraw(1);
        leader.setSpaceTacticDraw(3);
        leader.setStartingLeader(false);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getChewbacca() {
        Leader leader = new Leader();
        leader.setName("Chewbacca");
        leader.setIntel(0);
        leader.setSpecOps(3);
        leader.setDiplomacySkill(0);
        leader.setProficientInLogistics(false);
        leader.setRank(Rank.GENERAL);
        leader.setGroundTacticDraw(2);
        leader.setSpaceTacticDraw(1);
        leader.setStartingLeader(false);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getGeneralMadine() {
        Leader leader = new Leader();
        leader.setName("General Madine");
        leader.setIntel(2);
        leader.setSpecOps(2);
        leader.setDiplomacySkill(0);
        leader.setProficientInLogistics(false);
        leader.setRank(Rank.GENERAL);
        leader.setGroundTacticDraw(3);
        leader.setSpaceTacticDraw(1);
        leader.setStartingLeader(false);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getGeneralRieekan() {
        Leader leader = new Leader();
        leader.setName("General Rieekan");
        leader.setIntel(0);
        leader.setSpecOps(1);
        leader.setDiplomacySkill(1);
        leader.setProficientInLogistics(true);
        leader.setRank(Rank.GENERAL);
        leader.setGroundTacticDraw(3);
        leader.setSpaceTacticDraw(1);
        leader.setStartingLeader(true);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getHanSolo() {
        Leader leader = new Leader();
        leader.setName("Han Solo");
        leader.setIntel(1);
        leader.setSpecOps(2);
        leader.setDiplomacySkill(1);
        leader.setProficientInLogistics(false);
        leader.setRank(Rank.ADMIRAL);
        leader.setGroundTacticDraw(2);
        leader.setSpaceTacticDraw(2);
        leader.setStartingLeader(false);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getJanDodonna() {
        Leader leader = new Leader();
        leader.setName("Jan Dodonna");
        leader.setIntel(2);
        leader.setSpecOps(0);
        leader.setDiplomacySkill(1);
        leader.setProficientInLogistics(false);
        leader.setRank(Rank.ADMIRAL);
        leader.setGroundTacticDraw(1);
        leader.setSpaceTacticDraw(2);
        leader.setStartingLeader(true);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getLandoCalrissian() {
        Leader leader = new Leader();
        leader.setName("Lando Calrissian");
        leader.setIntel(1);
        leader.setSpecOps(1);
        leader.setDiplomacySkill(1);
        leader.setProficientInLogistics(true);
        leader.setRank(Rank.ADMIRAL);
        leader.setGroundTacticDraw(2);
        leader.setSpaceTacticDraw(2);
        leader.setStartingLeader(false);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getLukeSkywalker() {
        Leader leader = new Leader();
        leader.setName("Luke Skywalker");
        leader.setIntel(2);
        leader.setSpecOps(1);
        leader.setDiplomacySkill(0);
        leader.setProficientInLogistics(false);
        leader.setRank(Rank.GENERAL);
        leader.setGroundTacticDraw(2);
        leader.setSpaceTacticDraw(2);
        leader.setStartingLeader(false);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getLukeSkywalkerJedi() {
        Leader leader = new Leader();
        leader.setName("Luke Skywalker (Jedi)");
        leader.setIntel(3);
        leader.setSpecOps(2);
        leader.setDiplomacySkill(0);
        leader.setProficientInLogistics(false);
        leader.setRank(Rank.GENERAL);
        leader.setGroundTacticDraw(3);
        leader.setSpaceTacticDraw(3);
        leader.setStartingLeader(false);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getMonMothma() {
        Leader leader = new Leader();
        leader.setName("Mon Mothma");
        leader.setIntel(0);
        leader.setSpecOps(0);
        leader.setDiplomacySkill(3);
        leader.setProficientInLogistics(true);
        leader.setRank(Rank.ADMIRAL);
        leader.setGroundTacticDraw(0);
        leader.setSpaceTacticDraw(0);
        leader.setStartingLeader(false);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getObiWanKenobi() {
        Leader leader = new Leader();
        leader.setName("Obi Wan Kenobi");
        leader.setIntel(3);
        leader.setSpecOps(0);
        leader.setDiplomacySkill(1);
        leader.setProficientInLogistics(false);
        leader.setRank(Rank.GENERAL);
        leader.setGroundTacticDraw(3);
        leader.setSpaceTacticDraw(1);
        leader.setStartingLeader(false);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getPrincessLeia() {
        Leader leader = new Leader();
        leader.setName("Princess Leia");
        leader.setIntel(2);
        leader.setSpecOps(1);
        leader.setDiplomacySkill(2);
        leader.setProficientInLogistics(false);
        leader.setRank(Rank.GENERAL);
        leader.setGroundTacticDraw(1);
        leader.setSpaceTacticDraw(1);
        leader.setStartingLeader(true);
        leader.setFaction(Faction.REBEL);
        return leader;
    }

    private static Leader getWedgeAntilles() {
        Leader leader = new Leader();
        leader.setName("Wedge Antilles");
        leader.setIntel(0);
        leader.setSpecOps(2);
        leader.setDiplomacySkill(0);
        leader.setProficientInLogistics(false);
        leader.setRank(Rank.ADMIRAL);
        leader.setGroundTacticDraw(1);
        leader.setSpaceTacticDraw(3);
        leader.setStartingLeader(false);
        leader.setFaction(Faction.REBEL);
        return leader;
    }
}
