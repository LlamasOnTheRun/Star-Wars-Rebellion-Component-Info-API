package com.starwars.rebellion.ComponentInfoAPI.utils.h2;

import com.starwars.rebellion.ComponentInfoAPI.dao.ActionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.CardText;
import com.starwars.rebellion.ComponentInfoAPI.dao.Faction;
import com.starwars.rebellion.ComponentInfoAPI.repositorys.ActionCardRepository;
import com.starwars.rebellion.ComponentInfoAPI.repositorys.LeaderRepository;

import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders.RebelLeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import org.springframework.stereotype.Component;

@Component
public class H2StartUpDataLoader implements ApplicationRunner {

    @Autowired
    private LeaderRepository leaderRepository;
    @Autowired
    private ActionCardRepository actionCardRepository;

    public void run(ApplicationArguments args) {
        saveLeaders();
        saveActionCard();
    }

    private void saveActionCard() {
        ActionCard actionCard = new ActionCard();

        CardText cardText = new CardText();
        cardText.setTitle("Undercover");
        cardText.setCardType("Special");
        cardText.setDescription("""
                Use when your opponent
                attempts a mission, before
                rolling dice. Move this leader
                from any system to the
                mission's system.""");
        actionCard.setCardText(cardText);

        actionCard.setFaction(Faction.REBEL);
        actionCard.setRecruitmentOptionOne(RebelLeaders.getLandoCalrissian());
        actionCard.setRecruitmentOptionTwo(RebelLeaders.getObiWanKenobi());

        actionCardRepository.save(actionCard);
    }

    private void saveLeaders() {
        leaderRepository.saveAll(RebelLeaders.fetch());
    }
}
