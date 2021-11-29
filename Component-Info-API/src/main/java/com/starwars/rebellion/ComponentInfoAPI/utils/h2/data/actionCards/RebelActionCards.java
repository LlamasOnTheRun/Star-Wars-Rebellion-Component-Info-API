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
    public static final ActionCard REBEL_PLANNING = getRebelPlanning();
    public static final ActionCard RESOURCEFUL_ASTROMECH = getResourcefulAstromech();
    public static final ActionCard START_THE_EVACUATION = getStartTheEvacuation();
    public static final ActionCard HUMAN_CYBORG_RELATIONS = getHumanCyborgRelations();
    public static final ActionCard OUR_MOST_DESPERATE_HOUR = getOurMostDesperateHour();
    public static final ActionCard TEMPORARY_ALLIANCE = getTemporaryAlliance();


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
        rebelActionCards.add(REBEL_PLANNING);
        rebelActionCards.add(RESOURCEFUL_ASTROMECH);
        rebelActionCards.add(START_THE_EVACUATION);
        rebelActionCards.add(HUMAN_CYBORG_RELATIONS);
        rebelActionCards.add(OUR_MOST_DESPERATE_HOUR);
        rebelActionCards.add(TEMPORARY_ALLIANCE);

        return rebelActionCards;
    }

    private static ActionCard getUndercover() {
        ActionCard actionCard = new ActionCard();
        CardText cardText = new CardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        cardText.setTitle("Undercover");
        cardText.setCardType("Special");
        cardText.setDescription("""
                Use when your opponent
                attempts a mission, before
                rolling dice. Move this leader
                from any system to the
                mission's system.
                """);
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        actionCard.setStartingCard(true);
        leaders.add(RebelLeaders.LANDO_CALRISSIAN);
        leaders.add(RebelLeaders.OBI_WAN_KENOBI);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getOneInAMillion() {
        ActionCard actionCard = new ActionCard();
        CardText cardText = new CardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        cardText.setTitle("One In A Million");
        cardText.setCardType("Special");
        cardText.setDescription("""
                Use during either a combat
                or a mission. Instead of rolling
                up to 2 of your dice, place
                them on the table showing
                the results of your choice.
                """);
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        actionCard.setStartingCard(true);
        leaders.add(RebelLeaders.WEDGE_ANTILLES);
        leaders.add(RebelLeaders.LUKE_SKYWALKER);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getAnOldFriend() {
        ActionCard actionCard = new ActionCard();
        CardText cardText = new CardText();
        ArrayList<Leader> leaders = new ArrayList<>();

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
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        actionCard.setStartingCard(true);
        leaders.add(RebelLeaders.HAN_SOLO);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getNobleSacrifice() {
        ActionCard actionCard = new ActionCard();
        CardText cardText = new CardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        cardText.setTitle("Noble Sacrifice");
        cardText.setCardType("Special");
        cardText.setDescription("""
                Use when this leader
                becomes captured. He is
                eliminated, and you gain
                1 reputation.
                """);
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        actionCard.setStartingCard(true);
        leaders.add(RebelLeaders.OBI_WAN_KENOBI);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getPointBlankAssault() {
        ActionCard actionCard = new ActionCard();
        CardText cardText = new CardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        cardText.setTitle("""
                Point-Blank
                Assault
                """);
        cardText.setCardType("Start of Combat");
        cardText.setDescription("""
                All units in this system have
                -1 health, to a minimum of 1.
                """);
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        actionCard.setStartingCard(true);
        leaders.add(RebelLeaders.ADMIRAL_ACKBAR);
        leaders.add(RebelLeaders.GENERAL_MADINE);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getItsATrap() {
        ActionCard actionCard = new ActionCard();
        CardText cardText = new CardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        cardText.setTitle("It's a Trap");
        cardText.setCardType("Start of Combat");
        cardText.setDescription("""
                During the first round
                of combat, your opponent
                cannot play space tactic cards.
                """);
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        actionCard.setStartingCard(true);
        leaders.add(RebelLeaders.ADMIRAL_ACKBAR);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getTheMillenniumFalcon() {
        ActionCard actionCard = new ActionCard();
        CardText cardText = new CardText();
        ArrayList<Leader> leaders = new ArrayList<>();

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
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        actionCard.setStartingCard(true);
        leaders.add(RebelLeaders.HAN_SOLO);
        leaders.add(RebelLeaders.CHEWBACCA);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getTargetTheStarDestroyers() {
        ActionCard actionCard = new ActionCard();
        CardText cardText = new CardText();
        ArrayList<Leader> leaders = new ArrayList<>();

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
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        actionCard.setStartingCard(true);
        leaders.add(RebelLeaders.WEDGE_ANTILLES);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getAmbush() {
        ActionCard actionCard = new ActionCard();
        CardText cardText = new CardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        cardText.setTitle("Ambush");
        cardText.setCardType("Assignment");
        cardText.setDescription("""
                Place this leader in any
                system. Destroy up to 3-health
                worth of Imperial ground units
                of your choice in this system.
                """);
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        actionCard.setStartingCard(true);
        leaders.add(RebelLeaders.GENERAL_MADINE);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getIndependentOperation() {
        ActionCard actionCard = new ActionCard();
        CardText cardText = new CardText();
        ArrayList<Leader> leaders = new ArrayList<>();

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
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        actionCard.setStartingCard(true);
        leaders.add(RebelLeaders.LANDO_CALRISSIAN);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getWookieeGuardian() {
        ActionCard actionCard = new ActionCard();
        CardText cardText = new CardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        cardText.setTitle("Wookie Guardian");
        cardText.setCardType("Special");
        cardText.setDescription("""
                Use when your opponent
                attempts a spec ops (?)
                mission, before rolling dice.
                The mission automatically fails.
                """); // TODO need to find a away to include mission symbols in text
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        actionCard.setStartingCard(true);
        leaders.add(RebelLeaders.CHEWBACCA);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getSonOfSkywalker() {
        ActionCard actionCard = new ActionCard();
        CardText cardText = new CardText();
        ArrayList<Leader> leaders = new ArrayList<>();

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
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        actionCard.setStartingCard(true);
        leaders.add(RebelLeaders.LUKE_SKYWALKER);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getRebelPlanning() {
        ActionCard actionCard = new ActionCard();
        CardText cardText = new CardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        cardText.setTitle("Rebel Planning");
        cardText.setCardType("Assignment");
        cardText.setDescription("""
                Place this leader in the
                "Rebel Base" space. Then
                draw 1 objective card.
                """);
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        actionCard.setStartingCard(false);
        leaders.add(RebelLeaders.JAN_DODONNA);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getResourcefulAstromech() {
        ActionCard actionCard = new ActionCard();
        CardText cardText = new CardText();

        cardText.setTitle("""
                Resourceful
                Astromech
                """);
        cardText.setCardType("Immediate");
        cardText.setDescription("""
                Attach the R2-D2 ring
                to any leader.
                
                After your opponent rolls dice
                during a mission in R2-D2's
                system, discard this ring to
                turn 1 of your opponent's
                dice to its blank side.
                """);
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        actionCard.setStartingCard(false);
        //TODO Add ring here in future as no leaders are needed for this data card

        return actionCard;
    }

    private static ActionCard getStartTheEvacuation() {
        ActionCard actionCard = new ActionCard();
        CardText cardText = new CardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        cardText.setTitle("""
                Start the
                Evacuation
                """);
        cardText.setCardType("Assignment");
        cardText.setDescription("""
                Place this leader in any
                system that does not contain
                Imperial units. Then move any
                of your units from the "Rebel
                Base" space to this system
                as if they were adjacent.
                """);
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        actionCard.setStartingCard(false);
        leaders.add(RebelLeaders.GENERAL_RIEEKAN);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getHumanCyborgRelations() {
        ActionCard actionCard = new ActionCard();
        CardText cardText = new CardText();

        cardText.setTitle("""
                Human-Cyborg
                Relations
                """);
        cardText.setCardType("Immediate");
        cardText.setDescription("""
                Attach the C-3PO ring
                to any leader.
                
                When you fail a diplomacy (?)
                mission in C-3PO's system,
                discard this ring to make the
                mission succeed instead.
                """);// TODO need to find a away to include mission symbols in text
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        actionCard.setStartingCard(false);
        //TODO Add ring here in future as no leaders are needed for this data card

        return actionCard;
    }

    private static ActionCard getOurMostDesperateHour() {
        ActionCard actionCard = new ActionCard();
        CardText cardText = new CardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        cardText.setTitle("""
                Our Most
                Desperate Hour
                """);
        cardText.setCardType("Assignment");
        cardText.setDescription("""
                Search your mission deck for
                1 card of your choice and
                assign this leader to that
                mission. Then shuffle your
                mission deck.
                """);
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        actionCard.setStartingCard(false);
        leaders.add(RebelLeaders.PRINCESS_LEIA);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }

    private static ActionCard getTemporaryAlliance() {
        ActionCard actionCard = new ActionCard();
        CardText cardText = new CardText();
        ArrayList<Leader> leaders = new ArrayList<>();

        cardText.setTitle("""
                Temporary
                Alliance
                """);
        cardText.setCardType("Assignment");
        cardText.setDescription("""
                Place this leader in any
                neutral system. Then
                place units on the build
                queue using this system's
                resource icons and number.
                """);
        actionCard.setCardText(cardText);
        actionCard.setFaction(Faction.REBEL);
        actionCard.setStartingCard(false);
        leaders.add(RebelLeaders.MON_MOTHMA);
        actionCard.setLeaderChoices(leaders);

        return actionCard;
    }
}
