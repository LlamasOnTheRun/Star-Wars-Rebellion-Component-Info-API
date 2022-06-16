package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ActionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.ActionCardRequest;
import com.starwars.rebellion.ComponentInfoAPI.specification.ActionCardSpecification;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.domain.Specification;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ActionCardRepositoryTest {

	@Autowired
	ActionCardRepository actionCardRepository;

	@Autowired
	ActionCardSpecification specification;

	@Test
	void givenAllRebelActionCardDataIsAvailable_thenSixNonStartingCardsAreAvailable() {
		ActionCardRequest actionCardRequest = new ActionCardRequest();
		actionCardRequest.setStartingCard(false);
		actionCardRequest.setFaction(Faction.REBEL);
		Specification<ActionCard> actionCardSpecification = specification.getActionCards(actionCardRequest);

		assertEquals(TOTAL_NON_STARTING_REBEL_ACTION_CARDS, actionCardRepository.findAll(actionCardSpecification).size());
	}

	@Test
	void givenAllRebelActionCardDataIsAvailable_thenTwelveStartingCardsAreAvailable() {
		ActionCardRequest actionCardRequest = new ActionCardRequest();
		actionCardRequest.setStartingCard(true);
		actionCardRequest.setFaction(Faction.REBEL);
		Specification<ActionCard> actionCardSpecification = specification.getActionCards(actionCardRequest);

		assertEquals(TOTAL_STARTING_REBEL_ACTION_CARDS, actionCardRepository.findAll(actionCardSpecification).size());
	}

	@Test
	void givenAllRebelActionCardDataIsAvailable_thenEighteenCardsAreReturned() {
		ActionCardRequest actionCardRequest = new ActionCardRequest();
		actionCardRequest.setFaction(Faction.REBEL);
		Specification<ActionCard> actionCardSpecification = specification.getActionCards(actionCardRequest);

		assertEquals(TOTAL_REBEL_ACTION_CARDS, actionCardRepository.findAll(actionCardSpecification).size());
	}

	@Test
	void givenAllEmpireActionCardDataIsAvailable_thenFourNonStartingCardsAreAvailable() {
		ActionCardRequest actionCardRequest = new ActionCardRequest();
		actionCardRequest.setStartingCard(false);
		actionCardRequest.setFaction(Faction.IMPERIAL);
		Specification<ActionCard> actionCardSpecification = specification.getActionCards(actionCardRequest);

		assertEquals(TOTAL_NON_STARTING_EMPIRE_ACTION_CARDS, actionCardRepository.findAll(actionCardSpecification).size());
	}

	@Test
	void givenAllEmpireActionCardDataIsAvailable_thenTwelveStartingCardsAreAvailable() {
		ActionCardRequest actionCardRequest = new ActionCardRequest();
		actionCardRequest.setStartingCard(true);
		actionCardRequest.setFaction(Faction.IMPERIAL);
		Specification<ActionCard> actionCardSpecification = specification.getActionCards(actionCardRequest);

		assertEquals(TOTAL_STARTING_EMPIRE_ACTION_CARDS, actionCardRepository.findAll(actionCardSpecification).size());
	}

	@Test
	void givenAllEmpireActionCardDataIsAvailable_thenSixteenCardsAreReturned() {
		ActionCardRequest actionCardRequest = new ActionCardRequest();
		actionCardRequest.setFaction(Faction.IMPERIAL);
		Specification<ActionCard> actionCardSpecification = specification.getActionCards(actionCardRequest);

		assertEquals(TOTAL_EMPIRE_ACTION_CARDS, actionCardRepository.findAll(actionCardSpecification).size());
	}

	@Test
	void givenAllActionCardsAreAvailable_thenThirtyFourActionCardsAreReturned() {
		assertEquals(TOTAL_ACTION_CARDS, actionCardRepository.findAll().size());
	}
}