package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.actionCards;

import com.starwars.rebellion.ComponentInfoAPI.dao.ActionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.CardText;
import com.starwars.rebellion.ComponentInfoAPI.dao.Faction;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders.RebelLeaders;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpireActionCards {
    public static final ActionCard UNDERCOVER = getUndercover();

    public static List<ActionCard> fetch() {
        List<ActionCard> empireActionCards = new ArrayList<>();
        empireActionCards.add(UNDERCOVER);

        return empireActionCards;
    }

    private static ActionCard getUndercover() {
        CardText cardText = new CardText();
        cardText.setTitle("Undercover");
        cardText.setCardType("Special");
        cardText.setDescription("""
                Use when your opponent
                attempts a mission, before
                rolling dice. Move this leader
                from any system to the
                mission's system.""");

        ActionCard actionCard = new ActionCard();
        actionCard.setCardText(cardText);

        actionCard.setFaction(Faction.REBEL);
        actionCard.setRecruitmentOptionOne(RebelLeaders.LANDO_CALRISSIAN);
        actionCard.setRecruitmentOptionTwo(RebelLeaders.OBI_WAN_KENOBI);
        return actionCard;
    }
}
