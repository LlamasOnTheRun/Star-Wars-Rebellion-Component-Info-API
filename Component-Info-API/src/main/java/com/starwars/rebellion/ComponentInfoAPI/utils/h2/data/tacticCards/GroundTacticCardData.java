package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.tacticCards;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.TacticCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.CardText;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.TacticType;

import java.util.ArrayList;
import java.util.List;

public class GroundTacticCardData {
    public static final TacticCard ESCAPE_PLAN = getEscapePlan();
    public static final TacticCard UNSTOPPABLE_ASSAULT = getUnstoppableAssault();
    public static final TacticCard DEFENSIVE_FORMATION = getDefensiveFormation();
    public static final TacticCard CRITICAL_HIT = getCriticalHit();
    public static final TacticCard BOMBARDMENT = getBombardment();
    public static final TacticCard ONSLAUGHT = getOnslaught();
    public static final TacticCard DIG_IN = getDigIn();
    public static final TacticCard BRILLIANT_STRATEGY = getBrilliantStrategy();
    public static final TacticCard CONCENTRATE_FIRE = getConcentrateFire();
    public static final TacticCard TAKE_IT_DOWN = getTakeItDown();

    public static List<TacticCard> fetch() {
        List<TacticCard> groundTacticCards = new ArrayList<>();
        groundTacticCards.add(ESCAPE_PLAN);
        groundTacticCards.add(UNSTOPPABLE_ASSAULT);
        groundTacticCards.add(DEFENSIVE_FORMATION);
        groundTacticCards.add(CRITICAL_HIT);
        groundTacticCards.add(BOMBARDMENT);
        groundTacticCards.add(ONSLAUGHT);
        groundTacticCards.add(DIG_IN);
        groundTacticCards.add(BRILLIANT_STRATEGY);
        groundTacticCards.add(CONCENTRATE_FIRE);
        groundTacticCards.add(TAKE_IT_DOWN);
        return groundTacticCards;
    }

    private static TacticCard getEscapePlan() {
        TacticCard tacticCard = new TacticCard();

        CardText cardText = new CardText();
        cardText.setTitle("Escape Plan");
        cardText.setDescription("""
                During this combat
                round, your units
                can retreat ignoring
                transport restrictions.
                """);
        tacticCard.setCardText(cardText);

        tacticCard.setTacticType(TacticType.GROUND);
        tacticCard.setTotalInDeck(1);
        tacticCard.setLightsaberSymbolRequired(true);

        return tacticCard;
    }

    private static TacticCard getUnstoppableAssault() {
        TacticCard tacticCard = new TacticCard();

        CardText cardText = new CardText();
        cardText.setTitle("""
                Unstoppable
                Assault
                """);
        cardText.setDescription("""
                During this ground
                battle step, your
                opponent cannot
                block damage.
                """);
        tacticCard.setCardText(cardText);

        tacticCard.setTacticType(TacticType.GROUND);
        tacticCard.setTotalInDeck(1);
        tacticCard.setLightsaberSymbolRequired(true);

        return tacticCard;
    }

    private static TacticCard getDefensiveFormation() {
        TacticCard tacticCard = new TacticCard();

        CardText cardText = new CardText();
        cardText.setTitle("""
                Defensive
                Formation
                """);
        cardText.setDescription("Block 1 damage.");
        tacticCard.setCardText(cardText);

        tacticCard.setTacticType(TacticType.GROUND);
        tacticCard.setTotalInDeck(3);
        tacticCard.setLightsaberSymbolRequired(false);

        return tacticCard;
    }

    private static TacticCard getCriticalHit() {
        TacticCard tacticCard = new TacticCard();

        CardText cardText = new CardText();
        cardText.setTitle("Critical Hit");
        cardText.setDescription("Deal 1 damage.");
        tacticCard.setCardText(cardText);

        tacticCard.setTacticType(TacticType.GROUND);
        tacticCard.setTotalInDeck(2);
        tacticCard.setLightsaberSymbolRequired(false);

        return tacticCard;
    }

    private static TacticCard getBombardment() {
        TacticCard tacticCard = new TacticCard();

        CardText cardText = new CardText();
        cardText.setTitle("Bombardment");
        cardText.setDescription("""
                Deal damage
                equal to the red
                attack value of 1
                of your ships.
                """);
        tacticCard.setCardText(cardText);

        tacticCard.setTacticType(TacticType.GROUND);
        tacticCard.setTotalInDeck(1);
        tacticCard.setLightsaberSymbolRequired(true);

        return tacticCard;
    }

    private static TacticCard getOnslaught() {
        TacticCard tacticCard = new TacticCard();

        CardText cardText = new CardText();
        cardText.setTitle("Bombardment");
        cardText.setDescription("""
                Deal 1 damage to
                up to 2 different
                ground units.
                """);
        tacticCard.setCardText(cardText);

        tacticCard.setTacticType(TacticType.GROUND);
        tacticCard.setTotalInDeck(1);
        tacticCard.setLightsaberSymbolRequired(true);

        return tacticCard;
    }

    private static TacticCard getDigIn() {
        TacticCard tacticCard = new TacticCard();

        CardText cardText = new CardText();
        cardText.setTitle("Dig In");
        cardText.setDescription("""
                Discard 1 ground tactic
                card from your hand to
                block up to 2 damage.
                """);
        tacticCard.setCardText(cardText);

        tacticCard.setTacticType(TacticType.GROUND);
        tacticCard.setTotalInDeck(2);
        tacticCard.setLightsaberSymbolRequired(false);

        return tacticCard;
    }

    private static TacticCard getBrilliantStrategy() {
        TacticCard tacticCard = new TacticCard();

        CardText cardText = new CardText();
        cardText.setTitle("""
                Brilliant
                Strategy
                """);
        cardText.setDescription("""
                Draw 2 tactic cards
                from either deck,
                of 1 from each.
                """);
        tacticCard.setCardText(cardText);

        tacticCard.setTacticType(TacticType.GROUND);
        tacticCard.setTotalInDeck(1);
        tacticCard.setLightsaberSymbolRequired(true);

        return tacticCard;
    }

    private static TacticCard getConcentrateFire() {
        TacticCard tacticCard = new TacticCard();

        CardText cardText = new CardText();
        cardText.setTitle("Concentrate Fire");
        cardText.setDescription("Reroll up to 2 of your dice");
        tacticCard.setCardText(cardText);

        tacticCard.setTacticType(TacticType.GROUND);
        tacticCard.setTotalInDeck(2);
        tacticCard.setLightsaberSymbolRequired(false);

        return tacticCard;
    }

    private static TacticCard getTakeItDown() {
        TacticCard tacticCard = new TacticCard();

        CardText cardText = new CardText();
        cardText.setTitle("Take It Down");
        cardText.setDescription("""
                Deal 2 damage
                to 1 ground unit.
                """);
        tacticCard.setCardText(cardText);

        tacticCard.setTacticType(TacticType.GROUND);
        tacticCard.setTotalInDeck(1);
        tacticCard.setLightsaberSymbolRequired(true);

        return tacticCard;
    }
}
