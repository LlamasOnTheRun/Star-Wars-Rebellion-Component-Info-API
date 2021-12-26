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
    public static final ActionCard READY_FOR_ACTION = getReadyForAction();
    public static final ActionCard BLINDSIDE = getBlindside();
    public static final ActionCard FULLY_OPERATIONAL = getFullyOperational();
    public static final ActionCard PROCEEDING_AS_PLANNED = getProceedingAsPlanned();
    public static final ActionCard LOCAL_RUMORS = getLocalRumors();

    public static List<ActionCard> fetch() {
        List<ActionCard> empireActionCards = new ArrayList<>();

        empireActionCards.add(MORE_DANGEROUS_THAN_YOU_REALIZE);
        empireActionCards.add(BRILLIANT_ADMINISTRATOR);
        empireActionCards.add(ACCORDING_TO_MY_DESIGN);
        empireActionCards.add(IT_IS_YOUR_DESTINY);
        empireActionCards.add(KEEP_THEM_FROM_ESCAPING);
        empireActionCards.add(GOOD_INTEL);
        empireActionCards.add(READY_FOR_ACTION);
        empireActionCards.add(BLINDSIDE);
        empireActionCards.add(FULLY_OPERATIONAL);
        empireActionCards.add(PROCEEDING_AS_PLANNED);
        empireActionCards.add(LOCAL_RUMORS);

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

    private static ActionCard getReadyForAction() {
        ActionCard actionCard = new ActionCard();
        ActionCardText actionCardText = new ActionCardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        actionCardText.setTitle("Ready For Action");
        actionCardText.setCardType("Start of Combat");
        actionCardText.setDescription("""
                Take this leader from your
                leader pool and place him
                in this system. This leader
                cannot retreat, and he
                returns to your leader pool
                at the end of the combat.
                """);
        actionCard.setActionCardText(actionCardText);
        actionCard.setFaction(Faction.IMPERIAL);
        actionCard.setStartingCard(true);
        leaders.add(EmpireLeaders.ADMIRAL_PIETT);
        leaders.add(EmpireLeaders.GENERAL_VEERS);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getBlindside() {
        ActionCard actionCard = new ActionCard();
        ActionCardText actionCardText = new ActionCardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        actionCardText.setTitle("Blindside");
        actionCardText.setCardType("Special");
        actionCardText.setDescription("""
                Use before revealing this
                leader's mission. Your
                opponent cannot send
                leaders from his leader pool
                to oppose this mission.
                """);
        actionCard.setActionCardText(actionCardText);
        actionCard.setFaction(Faction.IMPERIAL);
        actionCard.setStartingCard(true);
        leaders.add(EmpireLeaders.JANUS_GREEJATUS);
        leaders.add(EmpireLeaders.BOBA_FETT);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getFullyOperational() {
        ActionCard actionCard = new ActionCard();
        ActionCardText actionCardText = new ActionCardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        actionCardText.setTitle("Fully Operational");
        actionCardText.setCardType("Start of Combat");
        actionCardText.setDescription("""
                If either a Death Star
                or Death Star Under
                Construction is in this system,
                destroy 1 Rebel ship of your
                choice in the system.
                """);
        actionCard.setActionCardText(actionCardText);
        actionCard.setFaction(Faction.IMPERIAL);
        actionCard.setStartingCard(true);
        leaders.add(EmpireLeaders.MOFF_JERJERROD);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getProceedingAsPlanned() {
        ActionCard actionCard = new ActionCard();
        ActionCardText actionCardText = new ActionCardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        actionCardText.setTitle("""
                Proceeding
                As Planned
                """);
        actionCardText.setCardType("Assignment");
        actionCardText.setDescription("""
                Search the project deck for
                1 card of your choice and
                assign this leader to that
                mission. Then shuffle your
                project deck.
                """);
        actionCard.setActionCardText(actionCardText);
        actionCard.setFaction(Faction.IMPERIAL);
        actionCard.setStartingCard(true);
        leaders.add(EmpireLeaders.ADMIRAL_OZZEL);
        leaders.add(EmpireLeaders.MOFF_JERJERROD);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getLocalRumors() {
        ActionCard actionCard = new ActionCard();
        ActionCardText actionCardText = new ActionCardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        actionCardText.setTitle("Local Rumors");
        actionCardText.setCardType("Assignment");
        actionCardText.setDescription("""
                Place this leader in any system
                that contains an Imperial unit.
                The Rebel player must state
                whether the Rebel base
                is in this region.
                """);
        actionCard.setActionCardText(actionCardText);
        actionCard.setFaction(Faction.IMPERIAL);
        actionCard.setStartingCard(true);
        leaders.add(EmpireLeaders.COLONEL_YULAREN);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }
}