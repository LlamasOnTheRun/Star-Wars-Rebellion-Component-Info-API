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
    public static final ActionCard BRILLIANT_ADMINISTRATOR = getBrilliantAdministrator();
    public static final ActionCard ACCORDING_TO_MY_DESIGN = getAccordingToMyDesign();

    public static List<ActionCard> fetch() {
        List<ActionCard> empireActionCards = new ArrayList<>();

        empireActionCards.add(MORE_DANGEROUS_THAN_YOU_REALIZE);
        empireActionCards.add(BRILLIANT_ADMINISTRATOR);
        empireActionCards.add(ACCORDING_TO_MY_DESIGN);

        return empireActionCards;
    }

    private static ActionCard getMoreDangerousThanYouRealize() {
        ActionCard actionCard = new ActionCard();
        ActionCardText actionCardText = new ActionCardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        actionCardText.setTitle("""
                More Dangerous
                Than You Realize
                """);
        actionCardText.setCardType("Start of Combat");
        actionCardText.setDescription("""
                Draw either 3 space tactic
                cards or 3 ground tactic cards.
                """);
        actionCard.setActionCardText(actionCardText);
        actionCard.setFaction(Faction.IMPERIAL);
        actionCard.setStartingCard(false);
        leaders.add(EmpireLeaders.GENERAL_TAGGE);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getBrilliantAdministrator() {
        ActionCard actionCard = new ActionCard();
        ActionCardText actionCardText = new ActionCardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        actionCardText.setTitle("""
                Brilliant
                Administrator
                """);
        actionCardText.setCardType("Assignment");
        actionCardText.setDescription("""
                Place this leader in any
                Imperial system. Then
                place units on the build
                queue using this system's
                resource icons and number.
                """);
        actionCard.setActionCardText(actionCardText);
        actionCard.setFaction(Faction.IMPERIAL);
        actionCard.setStartingCard(false);
        leaders.add(EmpireLeaders.GRAND_MOFF_TARKIN);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getAccordingToMyDesign() {
        ActionCard actionCard = new ActionCard();
        ActionCardText actionCardText = new ActionCardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        actionCardText.setTitle("""
                According
                To My Design
                """);
        actionCardText.setCardType("Start of Combat");
        actionCardText.setDescription("""
                For each battle during the
                first combat round, the Rebel
                player rolls 1 fewer red die
                and 2 fewer black dice.
                """);
        actionCard.setActionCardText(actionCardText);
        actionCard.setFaction(Faction.IMPERIAL);
        actionCard.setStartingCard(false);
        leaders.add(EmpireLeaders.EMPOROR_PALPATINE);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }
}
