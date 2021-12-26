package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.actionCards;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ActionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Leader;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.ActionCardText;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders.EmpireLeaders;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpireActionCards {
    public static final ActionCard MORE_DANGEROUS_THAN_YOU_REALIZE = getMoreDangerousThanYouRealize();

    public static List<ActionCard> fetch() {
        List<ActionCard> empireActionCards = new ArrayList<>();

        empireActionCards.add(MORE_DANGEROUS_THAN_YOU_REALIZE);

        return empireActionCards;
    }

    private static ActionCard getMoreDangerousThanYouRealize() {
        ActionCard actionCard = new ActionCard();
        ActionCardText actionCardText = new ActionCardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        actionCardText.setTitle("More Dangerous Than You Realize");
        actionCardText.setCardType("Start of Combat");
        actionCardText.setDescription("""
                Draw either 3 space tactic
                cards or 3 ground tactic cards.
                """);
        actionCard.setActionCardText(actionCardText);
        actionCard.setFaction(Faction.IMPERIAL);
        actionCard.setStartingCard(true);
        leaders.add(EmpireLeaders.GENERAL_TAGGE);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }
}
