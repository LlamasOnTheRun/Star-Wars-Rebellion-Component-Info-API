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
    public static final ActionCard IT_IS_YOUR_DESTINY = getItIsYourDestiny();
    public static final ActionCard KEEP_THEM_FROM_ESCAPING = getKeepThemFromEscaping();
    public static final ActionCard GOOD_INTEL = getGoodIntel();

    public static List<ActionCard> fetch() {
        List<ActionCard> empireActionCards = new ArrayList<>();

        empireActionCards.add(MORE_DANGEROUS_THAN_YOU_REALIZE);
        empireActionCards.add(BRILLIANT_ADMINISTRATOR);
        empireActionCards.add(ACCORDING_TO_MY_DESIGN);
        empireActionCards.add(IT_IS_YOUR_DESTINY);
        empireActionCards.add(KEEP_THEM_FROM_ESCAPING);
        empireActionCards.add(GOOD_INTEL);

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
        leaders.add(EmpireLeaders.EMPEROR_PALPATINE);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getItIsYourDestiny() {
        ActionCard actionCard = new ActionCard();
        ActionCardText actionCardText = new ActionCardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        actionCardText.setTitle("It Is Your Destiny");
        actionCardText.setCardType("Special");
        actionCardText.setDescription("""
                Use during a mission after a
                leader is rescued. Capture
                1 leader who attempted
                this mission.
                """);
        actionCard.setActionCardText(actionCardText);
        actionCard.setFaction(Faction.IMPERIAL);
        actionCard.setStartingCard(false);
        leaders.add(EmpireLeaders.DARTH_VADER);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getKeepThemFromEscaping() {
        ActionCard actionCard = new ActionCard();
        ActionCardText actionCardText = new ActionCardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        actionCardText.setTitle("""
                Keep Them
                From Escaping
                """);
        actionCardText.setCardType("Start of Combat");
        actionCardText.setDescription("""
                Rebel units cannot retreat.
                """);
        actionCard.setActionCardText(actionCardText);
        actionCard.setFaction(Faction.IMPERIAL);
        actionCard.setStartingCard(true);
        leaders.add(EmpireLeaders.ADMIRAL_PIETT);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getGoodIntel() {
        ActionCard actionCard = new ActionCard();
        ActionCardText actionCardText = new ActionCardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        actionCardText.setTitle("Good Intel");
        actionCardText.setCardType("Start of Combat");
        actionCardText.setDescription("""
                The Rebel player must keep
                his hand of tactic cards faceup.
                """);
        actionCard.setActionCardText(actionCardText);
        actionCard.setFaction(Faction.IMPERIAL);
        actionCard.setStartingCard(true);
        leaders.add(EmpireLeaders.SOONTIR_FEL);
        leaders.add(EmpireLeaders.COLONEL_YULAREN);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }
}