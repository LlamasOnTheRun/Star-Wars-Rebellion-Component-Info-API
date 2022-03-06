package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.tacticCards;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.TacticCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.CardText;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.TacticType;

import java.util.ArrayList;
import java.util.List;

public class SpaceTacticCardData {
    public static final TacticCard CRITICAL_HIT = getCriticalHit();

    public static List<TacticCard> fetch() {
        List<TacticCard> groundTacticCards = new ArrayList<>();
        groundTacticCards.add(CRITICAL_HIT);
        return groundTacticCards;
    }

    private static TacticCard getCriticalHit() {
        TacticCard tacticCard = new TacticCard();

        CardText cardText = new CardText();
        cardText.setTitle("Critical Hit");
        cardText.setDescription("Deal 1 damage");
        tacticCard.setCardText(cardText);

        tacticCard.setTacticType(TacticType.SPACE);
        tacticCard.setTotalInDeck(2);
        tacticCard.setLightsaberSymbolRequired(false);

        return tacticCard;
    }
}
