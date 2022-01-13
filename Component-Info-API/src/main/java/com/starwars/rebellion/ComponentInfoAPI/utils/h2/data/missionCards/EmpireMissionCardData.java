package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.missionCards;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.MissionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MissionCardText;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MissionSkillType;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders.EmpireLeaderData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpireMissionCardData {

    public static final MissionCard DISPLAY_OF_POWER = getDisplayOfPower();
    public static final MissionCard INTERROGATION_DROID = getInterrogationDroid();
    public static final MissionCard IMPERIAL_PROPAGANDA = getImperialPropaganda();

    public static List<MissionCard> fetch() {
        List<MissionCard> empireMissionCards = new ArrayList<>();
        empireMissionCards.add(DISPLAY_OF_POWER);
        empireMissionCards.add(INTERROGATION_DROID);
        empireMissionCards.add(IMPERIAL_PROPAGANDA);
        return empireMissionCards;
    }

    private static MissionCard getDisplayOfPower() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Display of Power");
        cardText.setDescription("""
                Attempt in any populous system.
                
                If successful, gain 2 loyalty in this system.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(3);
        missionCard.setSkillType(MissionSkillType.Diplomacy);
        missionCard.setTotalInDeck(1);
        return missionCard;
    }

    private static MissionCard getInterrogationDroid() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("""
                Interrogation
                Droid
                """);
        cardText.setDescription("""
                Attempt against a captured leader.
                Count all skill icons during this attempt.
                
                If successful, the Rebel player must
                name 3 systems. One of these
                systems must contain the Rebel base.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(3);
        missionCard.setSkillType(MissionSkillType.Intel);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.COLONEL_YULAREN);
        return missionCard;
    }

    private static MissionCard getImperialPropaganda() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("""
                Imperial
                Propaganda
                """);
        cardText.setDescription("""
                Attempt in any Imperial system.
                
                If successful, each system in this region
                that has Rebel loyalty becomes neutral.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(2);
        missionCard.setSkillType(MissionSkillType.Diplomacy);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.JANUS_GREEJATUS);
        return missionCard;
    }
}
