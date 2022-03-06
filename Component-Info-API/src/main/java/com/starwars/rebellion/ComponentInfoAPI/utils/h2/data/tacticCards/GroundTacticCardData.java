package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.tacticCards;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.TacticCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.CardText;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.TacticType;

import java.util.ArrayList;
import java.util.List;

public class GroundTacticCardData {
    public static final TacticCard ESCAPE_PLAN = getEscapePlan();

    public static List<TacticCard> fetch() {
        List<TacticCard> groundTacticCards = new ArrayList<>();
        groundTacticCards.add(ESCAPE_PLAN);
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
}
