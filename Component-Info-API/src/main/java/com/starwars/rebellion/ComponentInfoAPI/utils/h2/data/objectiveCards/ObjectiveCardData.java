
package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.objectiveCards;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ObjectiveCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.CardText;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.INSPIRE_SYMPATHY_EDGE_CASE;

@Service
public class ObjectiveCardData {
    public static final ObjectiveCard INSPIRE_SYMPATHY = getInspireSympathy();
    public static final ObjectiveCard DEFEND_THE_PEOPLE = getDefendThePeople();
    public static final ObjectiveCard LEAVE_NO_ONE_BEHIND = getLeaveNoOneBehind();
    public static final ObjectiveCard REGIONAL_SUPPORT = getRegionalSupport();
    public static final ObjectiveCard CUT_SUPPLY_LINES = getCutSupplyLines();
    public static final ObjectiveCard CRIPPLING_BLOW = getCripplingBlow();
    public static final ObjectiveCard REBEL_ASSAULT = getRebelAssault();
    public static final ObjectiveCard POPULAR_SUPPORT = getPopularSupport();
    public static final ObjectiveCard DEATH_STAR_PLANS = getDeathStarPlans();
    public static final ObjectiveCard LIBERATION = getLiberation();
    public static final ObjectiveCard ESTABLISH_OUTPOSTS = getEstablishOutposts();
    public static final ObjectiveCard MAJOR_VICTORY = getMajorVictory();
    public static final ObjectiveCard RETURN_OF_THE_JEDI = getReturnOfTheJedi();
    public static final ObjectiveCard HEART_OF_THE_EMPIRE = getHeartOfTheEmpire();

    public static List<ObjectiveCard> fetch() {
        List<ObjectiveCard> objectiveCards = new ArrayList<>();
        objectiveCards.add(INSPIRE_SYMPATHY);
        objectiveCards.add(DEFEND_THE_PEOPLE);
        objectiveCards.add(LEAVE_NO_ONE_BEHIND);
        objectiveCards.add(REGIONAL_SUPPORT);
        objectiveCards.add(CUT_SUPPLY_LINES);
        objectiveCards.add(CRIPPLING_BLOW);
        objectiveCards.add(REBEL_ASSAULT);
        objectiveCards.add(POPULAR_SUPPORT);
        objectiveCards.add(DEATH_STAR_PLANS);
        objectiveCards.add(LIBERATION);
        objectiveCards.add(ESTABLISH_OUTPOSTS);
        objectiveCards.add(MAJOR_VICTORY);
        objectiveCards.add(RETURN_OF_THE_JEDI);
        objectiveCards.add(HEART_OF_THE_EMPIRE);
        return objectiveCards;
    }

    private static ObjectiveCard getInspireSympathy() {
        ObjectiveCard objectiveCard = new ObjectiveCard();

        CardText cardText = new CardText();
        cardText.setTitle("Inspire Sympathy");
        cardText.setDescription("""
                Play to game 1 reputation to
                each destroyed system.
                """);
        objectiveCard.setCardText(cardText);

        objectiveCard.setActionType("Start of Refresh Phase");
        objectiveCard.setReputationGained(INSPIRE_SYMPATHY_EDGE_CASE);
        objectiveCard.setInDeckLevelThree(true);

        return objectiveCard;
    }

    private static ObjectiveCard getDefendThePeople() {
        ObjectiveCard objectiveCard = new ObjectiveCard();

        CardText cardText = new CardText();
        cardText.setTitle("Defend The People");
        cardText.setDescription("""
                Play if at least 4 Rebel
                systems contain a Rebel unit.
                """);
        objectiveCard.setCardText(cardText);

        objectiveCard.setActionType("Start of Refresh Phase");
        objectiveCard.setReputationGained('1');
        objectiveCard.setInDeckLevelOne(true);

        return objectiveCard;
    }

    private static ObjectiveCard getLeaveNoOneBehind() {
        ObjectiveCard objectiveCard = new ObjectiveCard();

        CardText cardText = new CardText();
        cardText.setTitle("Leave No One Behind");
        cardText.setDescription("""
                Play if there are no captured
                Rebel leaders.
                """);
        objectiveCard.setCardText(cardText);

        objectiveCard.setActionType("Start of Refresh Phase");
        objectiveCard.setReputationGained('1');
        objectiveCard.setInDeckLevelTwo(true);

        return objectiveCard;
    }

    private static ObjectiveCard getRegionalSupport() {
        ObjectiveCard objectiveCard = new ObjectiveCard();

        CardText cardText = new CardText();
        cardText.setTitle("Regional Support");
        cardText.setDescription("""
                Play if all populous systems in
                1 region have Rebel loyalty.
                """);
        objectiveCard.setCardText(cardText);

        objectiveCard.setActionType("Start of Refresh Phase");
        objectiveCard.setReputationGained('1');
        objectiveCard.setInDeckLevelOne(true);

        return objectiveCard;
    }

    private static ObjectiveCard getCutSupplyLines() {
        ObjectiveCard objectiveCard = new ObjectiveCard();

        CardText cardText = new CardText();
        cardText.setTitle("Cut Supply Lines");
        cardText.setDescription("""
                Play if at least 3 Imperial
                systems contain either a
                sabotage marker or
                a Rebel unit.
                """);
        objectiveCard.setCardText(cardText);

        objectiveCard.setActionType("Start of Refresh Phase");
        objectiveCard.setReputationGained('1');
        objectiveCard.setInDeckLevelOne(true);

        return objectiveCard;
    }

    private static ObjectiveCard getCripplingBlow() {
        ObjectiveCard objectiveCard = new ObjectiveCard();

        CardText cardText = new CardText();
        cardText.setTitle("Cut Supply Lines");
        cardText.setDescription("""
                Play after at least 3-health
                worth of Imperial ground units
                have been destroyed in a
                combat that you initiated.
                """);
        objectiveCard.setCardText(cardText);

        objectiveCard.setActionType("Combat");
        objectiveCard.setReputationGained('1');
        objectiveCard.setInDeckLevelOne(true);

        return objectiveCard;
    }

    private static ObjectiveCard getRebelAssault() {
        ObjectiveCard objectiveCard = new ObjectiveCard();

        CardText cardText = new CardText();
        cardText.setTitle("Rebel Assault");
        cardText.setDescription("""
                Play after a Star Destroyer
                or Super Star Destroyer has
                been destroyed in a combat
                that you initiated.
                """);
        objectiveCard.setCardText(cardText);

        objectiveCard.setActionType("Combat");
        objectiveCard.setReputationGained('1');
        objectiveCard.setInDeckLevelOne(true);

        return objectiveCard;
    }

    private static ObjectiveCard getPopularSupport() {
        ObjectiveCard objectiveCard = new ObjectiveCard();

        CardText cardText = new CardText();
        cardText.setTitle("Popular Support");
        cardText.setDescription("""
                Play if at least 6 systems
                have Rebel loyalty.
                """);
        objectiveCard.setCardText(cardText);

        objectiveCard.setActionType("Start of Refresh Phase");
        objectiveCard.setReputationGained('1');
        objectiveCard.setInDeckLevelTwo(true);

        return objectiveCard;
    }

    private static ObjectiveCard getDeathStarPlans() {
        ObjectiveCard objectiveCard = new ObjectiveCard();

        CardText cardText = new CardText();
        cardText.setTitle("Death Star Plans");
        cardText.setDescription("""
                If you have at least 1 fighter
                after the space battle step,
                reveal this card to roll 3 dice.
                                
                If you roll a (?), play this card 
                and destroy a Death Star in
                this system. Otherwise return
                this card to your hand.
                """); // todo will need to insert a special character here for (?) symbol
        objectiveCard.setCardText(cardText);

        objectiveCard.setActionType("Combat");
        objectiveCard.setReputationGained('2');
        objectiveCard.setInDeckLevelTwo(true);
        objectiveCard.setInDeckLevelThree(true);

        return objectiveCard;
    }

    private static ObjectiveCard getLiberation() {
        ObjectiveCard objectiveCard = new ObjectiveCard();

        CardText cardText = new CardText();
        cardText.setTitle("Liberation");
        cardText.setDescription("""
                Play after you win a ground
                battle in a subjugated system.
                """);
        objectiveCard.setCardText(cardText);

        objectiveCard.setActionType("Combat");
        objectiveCard.setReputationGained('1');
        objectiveCard.setInDeckLevelTwo(true);

        return objectiveCard;
    }

    private static ObjectiveCard getEstablishOutposts() {
        ObjectiveCard objectiveCard = new ObjectiveCard();

        CardText cardText = new CardText();
        cardText.setTitle("Establish Outposts");
        cardText.setDescription("""
                Play if at least 5 systems
                contain a Rebel unit.
                """);
        objectiveCard.setCardText(cardText);

        objectiveCard.setActionType("Start of Refresh Phase");
        objectiveCard.setReputationGained('1');
        objectiveCard.setInDeckLevelThree(true);

        return objectiveCard;
    }

    private static ObjectiveCard getMajorVictory() {
        ObjectiveCard objectiveCard = new ObjectiveCard();

        CardText cardText = new CardText();
        cardText.setTitle("Major Victory");
        cardText.setDescription("""
                Play after at least 3-health
                worth of Imperial ships have
                been destroyed in a combat
                that you initiated.
                """);
        objectiveCard.setCardText(cardText);

        objectiveCard.setActionType("Combat");
        objectiveCard.setReputationGained('1');
        objectiveCard.setInDeckLevelThree(true);

        return objectiveCard;
    }

    private static ObjectiveCard getReturnOfTheJedi() {
        ObjectiveCard objectiveCard = new ObjectiveCard();

        CardText cardText = new CardText();
        cardText.setTitle("Return of the Jedi");
        cardText.setDescription("""
                Play after you win a battle
                in Darth Vader's or Emperor
                Palpatine's system.
                                
                If Luke Skywalker (Jedi) is
                in this system, eliminate 1
                Imperial leader in this system.
                """);
        objectiveCard.setCardText(cardText);

        objectiveCard.setActionType("Combat");
        objectiveCard.setReputationGained('2');
        objectiveCard.setInDeckLevelThree(true);

        return objectiveCard;
    }

    private static ObjectiveCard getHeartOfTheEmpire() {
        ObjectiveCard objectiveCard = new ObjectiveCard();

        CardText cardText = new CardText();
        cardText.setTitle("Heart of the Empire");
        cardText.setDescription("""
                Play if the Coruscant system
                contains a Rebel unit and no
                Imperial units. Then return this
                card to your hand.
                """);
        objectiveCard.setCardText(cardText);

        objectiveCard.setActionType("Start of Refresh Phase");
        objectiveCard.setReputationGained('2');
        objectiveCard.setInDeckLevelTwo(true);

        return objectiveCard;
    }

}
