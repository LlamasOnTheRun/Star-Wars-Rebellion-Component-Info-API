package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.actionCards;

import com.starwars.rebellion.ComponentInfoAPI.dao.ActionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.CardText;
import com.starwars.rebellion.ComponentInfoAPI.dao.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.Leader;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders.RebelLeaders;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RebelActionCards {
    public static final ActionCard UNDERCOVER = getUndercover();
    public static final ActionCard ONE_IN_A_MILLION = getOneInAMillion();
    public static final ActionCard NOBLE_SACRIFICE = getNobleSacrifice();
    public static final ActionCard AN_OLD_FRIEND = getAnOldFriend();
    public static final ActionCard POINT_BLANK_ASSAULT = getPointBlankAssault();
    public static final ActionCard ITS_A_TRAP = getItsATrap();
    public static final ActionCard THE_MILLENNIUM_FALCON = getTheMillenniumFalcon();
    public static final ActionCard TARGET_THE_STAR_DESTROYERS = getTargetTheStarDestroyers();
    public static final ActionCard AMBUSH = getAmbush();
    public static final ActionCard INDEPENDENT_OPERATION = getIndependentOperation();
    public static final ActionCard WOOKIEE_GUARDIAN = getWookieeGuardian();
    public static final ActionCard SON_OF_SKYWALKER = getSonOfSkywalker();

    public static List<ActionCard> fetch() {
        List<ActionCard> rebelActionCards = new ArrayList<>();

        rebelActionCards.add(UNDERCOVER);
        rebelActionCards.add(ONE_IN_A_MILLION);
        rebelActionCards.add(NOBLE_SACRIFICE);
        rebelActionCards.add(AN_OLD_FRIEND);
        rebelActionCards.add(POINT_BLANK_ASSAULT);
        rebelActionCards.add(ITS_A_TRAP);
        rebelActionCards.add(THE_MILLENNIUM_FALCON);
        rebelActionCards.add(TARGET_THE_STAR_DESTROYERS);
        rebelActionCards.add(AMBUSH);
        rebelActionCards.add(INDEPENDENT_OPERATION);
        rebelActionCards.add(WOOKIEE_GUARDIAN);
        rebelActionCards.add(SON_OF_SKYWALKER);

        return rebelActionCards;
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
                mission's system.
                """);

        ActionCard actionCard = new ActionCard();
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        ArrayList<Leader> leaders = new ArrayList<>();
        leaders.add(RebelLeaders.LANDO_CALRISSIAN);
        leaders.add(RebelLeaders.OBI_WAN_KENOBI);
        actionCard.setLeaderChoices(leaders);
        return actionCard;
    }

    private static ActionCard getOneInAMillion() {
        CardText cardText = new CardText();
        cardText.setTitle("One In A Million");
        cardText.setCardType("Special");
        cardText.setDescription("""
                Use during either a combat
                or a mission. Instead of rolling
                up to 2 of your dice, place
                them on the table showing
                the results of your choice.
                """);

        ActionCard actionCard = new ActionCard();
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        ArrayList<Leader> leaders = new ArrayList<>();
        leaders.add(RebelLeaders.WEDGE_ANTILLES);
        leaders.add(RebelLeaders.LUKE_SKYWALKER);
        actionCard.setLeaderChoices(leaders);
        return actionCard;
    }

    private static ActionCard getAnOldFriend() {
        CardText cardText = new CardText();
        cardText.setTitle("An Old Friend");
        cardText.setCardType("Assignment");
        cardText.setDescription("""
                Place this leader in
                either the Bespin system
                to recruit Lando Calrissian
                or in the Kashyyyk System
                to recruit Chewbacca.
                Place the recruited leader
                in Han's Solo system.
                """);

        ActionCard actionCard = new ActionCard();
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        ArrayList<Leader> leaders = new ArrayList<>();
        leaders.add(RebelLeaders.HAN_SOLO);
        actionCard.setLeaderChoices(leaders);
        return actionCard;
    }

    private static ActionCard getNobleSacrifice() {
        CardText cardText = new CardText();
        cardText.setTitle("Noble Sacrifice");
        cardText.setCardType("Special");
        cardText.setDescription("""
                Use when this leader
                becomes captured. He is
                eliminated, and you gain
                1 reputation.
                """);

        ActionCard actionCard = new ActionCard();
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        ArrayList<Leader> leaders = new ArrayList<>();
        leaders.add(RebelLeaders.OBI_WAN_KENOBI);
        actionCard.setLeaderChoices(leaders);
        return actionCard;
    }

    private static ActionCard getPointBlankAssault() {
        CardText cardText = new CardText();
        cardText.setTitle("""
                Point-Blank
                Assault
                """);
        cardText.setCardType("Start of Combat");
        cardText.setDescription("""
                All units in this system have
                -1 health, to a minimum of 1.
                """);

        ActionCard actionCard = new ActionCard();
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        ArrayList<Leader> leaders = new ArrayList<>();
        leaders.add(RebelLeaders.ADMIRAL_ACKBAR);
        leaders.add(RebelLeaders.GENERAL_MADINE);
        actionCard.setLeaderChoices(leaders);
        return actionCard;
    }

    private static ActionCard getItsATrap() {
        CardText cardText = new CardText();
        cardText.setTitle("It's a Trap");
        cardText.setCardType("Start of Combat");
        cardText.setDescription("""
                During the first round
                of combat, your opponent
                cannot play space tactic cards.
                """);

        ActionCard actionCard = new ActionCard();
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        ArrayList<Leader> leaders = new ArrayList<>();
        leaders.add(RebelLeaders.ADMIRAL_ACKBAR);
        actionCard.setLeaderChoices(leaders);
        return actionCard;
    }

    private static ActionCard getTheMillenniumFalcon() {
        CardText cardText = new CardText();
        cardText.setTitle("""
                The Millennium
                Falcon
                """);
        cardText.setCardType("Immediate");
        cardText.setDescription("""
                Attach the Millennium
                Falcon ring to this leader.
                
                After you succeed at a mission
                in the Millennium Falcon's
                system, discord this ring
                to rescue 1 captured
                leader in this system.
                """);

        ActionCard actionCard = new ActionCard();
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        ArrayList<Leader> leaders = new ArrayList<>();
        leaders.add(RebelLeaders.HAN_SOLO);
        leaders.add(RebelLeaders.CHEWBACCA);
        actionCard.setLeaderChoices(leaders);
        return actionCard;
    }

    private static ActionCard getTargetTheStarDestroyers() {
        CardText cardText = new CardText();
        cardText.setTitle("""
                Target The
                Star Destroyers
                """);
        cardText.setCardType("Start of Combat");
        cardText.setDescription("""
                During the space battle
                of each combat round,
                treat up to 2 of your
                black ? as red ?.
                """); // TODO we will have to find a way to include symbols for the die into the text - Ryan Llamas

        ActionCard actionCard = new ActionCard();
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        ArrayList<Leader> leaders = new ArrayList<>();
        leaders.add(RebelLeaders.WEDGE_ANTILLES);
        actionCard.setLeaderChoices(leaders);
        return actionCard;
    }

    private static ActionCard getAmbush() {
        CardText cardText = new CardText();
        cardText.setTitle("Ambush");
        cardText.setCardType("Assignment");
        cardText.setDescription("""
                Place this leader in any
                system. Destroy up to 3-health
                worth of Imperial ground units
                of your choice in this system.
                """);

        ActionCard actionCard = new ActionCard();
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        ArrayList<Leader> leaders = new ArrayList<>();
        leaders.add(RebelLeaders.GENERAL_MADINE);
        actionCard.setLeaderChoices(leaders);
        return actionCard;
    }

    private static ActionCard getIndependentOperation() {
        CardText cardText = new CardText();
        cardText.setTitle("Independent Operation");
        cardText.setCardType("Assignment");
        cardText.setDescription("""
                Place this leader in any
                subjugated system. The
                Imperial player must move
                all his ground units from this
                system to any 1 Imperial system
                of his choice, ignoring adjacency
                and transport capacity.
                """);

        ActionCard actionCard = new ActionCard();
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        ArrayList<Leader> leaders = new ArrayList<>();
        leaders.add(RebelLeaders.LANDO_CALRISSIAN);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getWookieeGuardian() {
        CardText cardText = new CardText();
        cardText.setTitle("Wookie Guardian");
        cardText.setCardType("Special");
        cardText.setDescription("""
                Use when your opponent
                attempts a spec ops (?)
                mission, before rolling dice.
                The mission automatically fails.
                """); // TODO need to find a away to include mission symbols in text

        ActionCard actionCard = new ActionCard();
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        ArrayList<Leader> leaders = new ArrayList<>();
        leaders.add(RebelLeaders.CHEWBACCA);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getSonOfSkywalker() {
        CardText cardText = new CardText();
        cardText.setTitle("Son of Skywalker");
        cardText.setCardType("Special");
        cardText.setDescription("""
                After you succeed at a
                mission in this leader's system,
                search your mission deck for
                the "Seek Yoda" or "Daring
                Rescue" card and place it
                in your hand. Then shuffle
                your mission deck.
                """);

        ActionCard actionCard = new ActionCard();
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        ArrayList<Leader> leaders = new ArrayList<>();
        leaders.add(RebelLeaders.LUKE_SKYWALKER);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }
}
