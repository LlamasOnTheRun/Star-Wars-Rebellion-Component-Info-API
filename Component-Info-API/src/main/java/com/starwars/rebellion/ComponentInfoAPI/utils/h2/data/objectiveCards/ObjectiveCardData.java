
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

    public static List<ObjectiveCard> fetch() {
        List<ObjectiveCard> objectiveCards = new ArrayList<>();
        objectiveCards.add(INSPIRE_SYMPATHY);
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

        objectiveCard.setActionText("Start of Refresh Phase");
        objectiveCard.setReputationGained(INSPIRE_SYMPATHY_EDGE_CASE);

        return objectiveCard;
    }

}
