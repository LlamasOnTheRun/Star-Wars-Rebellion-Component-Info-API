package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.missionCards;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.MissionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MissionCardText;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MissionSkillType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpireMissionCardData {

    public static final MissionCard DISPLAY_OF_POWER = getDisplayOfPower();

    public static List<MissionCard> fetch() {
        List<MissionCard> empireMissionCards = new ArrayList<>();
        empireMissionCards.add(DISPLAY_OF_POWER);
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
}
