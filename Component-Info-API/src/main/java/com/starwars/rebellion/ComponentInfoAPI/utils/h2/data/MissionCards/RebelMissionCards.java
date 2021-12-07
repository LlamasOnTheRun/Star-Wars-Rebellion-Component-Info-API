package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.MissionCards;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.MissionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MissionCardText;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MissionSkillType;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders.RebelLeaders;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RebelMissionCards {
    public static final MissionCard FOR_THE_GREATER_GOOD = getForTheGreaterGood();

    public static List<MissionCard> fetch() {
        List<MissionCard> rebelMissionCards = new ArrayList<>();
        rebelMissionCards.add(FOR_THE_GREATER_GOOD);
        return rebelMissionCards;
    }

    private static MissionCard getForTheGreaterGood() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("""
                For The
                Greater Good
                """);
        cardText.setDescription("""
                Attempt in any system that
                contains a captured leader.
                
                If successful, rescue that leader and
                draw 1 objective card. The leader(s)
                assigned to this mission remain in
                this system.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(3);
        missionCard.setSkillType(MissionSkillType.Intel);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(RebelLeaders.OBI_WAN_KENOBI);
        return missionCard;
    }
}
