package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.missionCards;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.MissionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ProjectCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.CardText;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MissionSkillType;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders.EmpireLeaderData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpireMissionCardData {

    public static final MissionCard DISPLAY_OF_POWER = getDisplayOfPower();
    public static final MissionCard INTERROGATION_DROID = getInterrogationDroid();
    public static final MissionCard IMPERIAL_PROPAGANDA = getImperialPropaganda();
    public static final MissionCard INTERROGATION = getInterrogation();
    public static final MissionCard ADDRESS_DELAYS = getAddressDelays();
    public static final MissionCard DOUBLE_OUR_EFFORTS = getDoubleOurEfforts();
    public static final MissionCard SECRET_WEAPONS_RESEARCH = getSecretWeaponsResearch();
    public static final MissionCard DETAINED = getDetained();
    public static final MissionCard HOMING_BEACON = getHomingBeacon();
    public static final MissionCard PLANETARY_CONQUEST = getPlanetaryConquest();
    public static final MissionCard LONG_RANGE_PROBE = getLongRangeProbe();
    public static final MissionCard COLLECT_BOUNTY = getCollectBounty();
    public static final MissionCard RETRIEVE_THE_PLANS = getRetrieveThePlans();
    public static final MissionCard HUNT_THEM_DOWN = getHuntThemDown();
    public static final MissionCard FEAR_WILL_KEEP_THEM_IN_LINE = getFearWillKeepThemInLine();
    public static final MissionCard RULE_BY_FEAR = getRuleByFear();
    public static final MissionCard PROBE_DROID_INITIATIVE = getProbeDroidInitiative();
    public static final MissionCard TRADE_NEGOTIATIONS = getTradeNegotiations();
    public static final MissionCard INTERCEPT_TRANSMISSION = getInterceptTransmission();
    public static final MissionCard CONSTRUCT_FACTORY = getConstructFactory();
    public static final MissionCard OVERSEE_PROJECT = getOverseeProject();
    public static final MissionCard SUPERLASER_ONLINE = getSuperLaserOnline();
    public static final MissionCard CONSTRUCT_SUPER_STAR_DESTROYER = getConstructSuperStarDestroyer();
    public static final MissionCard CONSTRUCT_DEATH_STAR = getConstructDeathStar();
    public static final MissionCard GATHER_INTEL = getGatherIntel();
    public static final MissionCard RESEARCH_AND_DEVELOPMENT = getResearchAndDevelopment();
    public static final MissionCard LURE_OF_THE_DARK_SIDE = getLureOfTheDarkSide();
    public static final MissionCard CARBON_FREEZING = getCarbonFreezing();
    public static final MissionCard CAPTURE_REBEL_OPERATIVE = getCaptureRebelOperative();

    public static List<MissionCard> fetch() {
        List<MissionCard> empireMissionCards = new ArrayList<>();
        empireMissionCards.add(DISPLAY_OF_POWER);
        empireMissionCards.add(INTERROGATION_DROID);
        empireMissionCards.add(IMPERIAL_PROPAGANDA);
        empireMissionCards.add(INTERROGATION);
        empireMissionCards.add(ADDRESS_DELAYS);
        empireMissionCards.add(DOUBLE_OUR_EFFORTS);
        empireMissionCards.add(SECRET_WEAPONS_RESEARCH);
        empireMissionCards.add(DETAINED);
        empireMissionCards.add(HOMING_BEACON);
        empireMissionCards.add(PLANETARY_CONQUEST);
        empireMissionCards.add(LONG_RANGE_PROBE);
        empireMissionCards.add(COLLECT_BOUNTY);
        empireMissionCards.add(RETRIEVE_THE_PLANS);
        empireMissionCards.add(HUNT_THEM_DOWN);
        empireMissionCards.add(FEAR_WILL_KEEP_THEM_IN_LINE);
        empireMissionCards.add(RULE_BY_FEAR);
        empireMissionCards.add(PROBE_DROID_INITIATIVE);
        empireMissionCards.add(TRADE_NEGOTIATIONS);
        empireMissionCards.add(INTERCEPT_TRANSMISSION);
        empireMissionCards.add(CONSTRUCT_FACTORY);
        empireMissionCards.add(OVERSEE_PROJECT);
        empireMissionCards.add(SUPERLASER_ONLINE);
        empireMissionCards.add(CONSTRUCT_SUPER_STAR_DESTROYER);
        empireMissionCards.add(CONSTRUCT_DEATH_STAR);
        empireMissionCards.add(GATHER_INTEL);
        empireMissionCards.add(RESEARCH_AND_DEVELOPMENT);
        empireMissionCards.add(LURE_OF_THE_DARK_SIDE);
        empireMissionCards.add(CARBON_FREEZING);
        empireMissionCards.add(CAPTURE_REBEL_OPERATIVE);
        return empireMissionCards;
    }

    private static MissionCard getDisplayOfPower() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("Display of Power");
        cardText.setDescription("""
                Attempt in any populous system.
                
                If successful, gain 2 loyalty in this system.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(3);
        missionCard.setSkillType(MissionSkillType.DIPLOMACY);
        missionCard.setTotalInDeck(1);
        return missionCard;
    }

    private static MissionCard getInterrogationDroid() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("""
                Interrogation
                Droid
                """);
        cardText.setDescription("""
                Attempt against a captured leader.
                Count all skill icons during this attempt.
                
                If successful, the Rebel player must
                name 3 systems. One of these
                systems must contain the Rebel base.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(3);
        missionCard.setSkillType(MissionSkillType.INTEL);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.COLONEL_YULAREN);
        return missionCard;
    }

    private static MissionCard getImperialPropaganda() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("""
                Imperial
                Propaganda
                """);
        cardText.setDescription("""
                Attempt in any Imperial system.
                
                If successful, each system in this region
                that has Rebel loyalty becomes neutral.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(2);
        missionCard.setSkillType(MissionSkillType.DIPLOMACY);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.JANUS_GREEJATUS);
        return missionCard;
    }

    private static MissionCard getInterrogation() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("Interrogation");
        cardText.setDescription("""
                Attempt against a captured leader.
                
                If successful, the Rebel player must
                reveal his hand of objective cards.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(2);
        missionCard.setSkillType(MissionSkillType.SPEC_OPS);
        missionCard.setTotalInDeck(2);
        return missionCard;
    }

    private static MissionCard getAddressDelays() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("Address Delays");
        cardText.setDescription("""
                Resolve in any Imperial system.
                                
                Place units on the build
                queue using this system's
                resource icons and number.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.LOGISTICS);
        missionCard.setTotalInDeck(2);
        return missionCard;
    }

    private static MissionCard getDoubleOurEfforts() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("""
                Double Our
                Efforts
                """);
        cardText.setDescription("""
                Resolve in any Imperial system.
                                
                Choose 1 unit on space 2 or 3 of the
                build queue and move it down 1 space.
                If Moff Jerjerrod resolves this mission,
                you can choose 1 additional unit.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.DIPLOMACY);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.MOFF_JERJERROD);
        return missionCard;
    }

    private static MissionCard getSecretWeaponsResearch() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("""
                Secret Weapons
                Research
                """);
        cardText.setDescription("""
                Resolve in any Imperial system.
                  
                Draw 2 project cards.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.LOGISTICS);
        missionCard.setTotalInDeck(2);
        return missionCard;
    }

    private static MissionCard getDetained() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("Detained");
        cardText.setDescription("""
                Attempt against a Rebel leader
                that is in any system.
                                
                If successful, that leader does not
                return to the leader pool during
                the next refresh phase.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.SPEC_OPS);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.GENERAL_TAGGE);
        return missionCard;
    }

    private static MissionCard getHomingBeacon() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("Homing Beacon");
        cardText.setDescription("""
                Attempt against a captured leader.
                                
                If successful, this leader is rescued. The
                Rebel player must place this leader in
                any system in the Rebel base's region.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(3);
        missionCard.setSkillType(MissionSkillType.INTEL);
        missionCard.setTotalInDeck(1);
        return missionCard;
    }

    private static MissionCard getPlanetaryConquest() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("""
                Planetary
                Conquest
                """);
        cardText.setDescription("""
                Attempt in any system.
                                
                If successful, move up to 1 AT-AT,
                1 AT-ST, and 2 Stormtroopers from
                any one system to this system, ignoring
                transport restrictions and adjacency.
                                
                If there are Rebel ground units in this
                system, resolve a combat.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(2);
        missionCard.setSkillType(MissionSkillType.SPEC_OPS);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.GENERAL_VEERS);
        return missionCard;
    }

    private static MissionCard getLongRangeProbe() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("Long-Range Probe");
        cardText.setDescription("""
                Attempt in any system.
                                
                If successful, the Rebel player must tell
                you if the Rebel base is in this system.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(2);
        missionCard.setSkillType(MissionSkillType.INTEL);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.ADMIRAL_PIETT);
        return missionCard;
    }

    private static MissionCard getCollectBounty() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("Collect Bounty");
        cardText.setDescription("""
                Attempt against a Rebel leader
                that is in any system.
                                
                If successful, capture that leader.
                Then move both that leader and this
                leader to the closest system that
                contains an Imperial unit.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(3);
        missionCard.setSkillType(MissionSkillType.SPEC_OPS);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.BOBA_FETT);
        return missionCard;
    }

    private static MissionCard getRetrieveThePlans() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("Retrieve The Plans");
        cardText.setDescription("""
                Attempt against a captured leader.
                                
                If successful, the Rebel player must
                reveal his hand of objective cards.
                Choose 1 of these cards to place on
                the bottom of the objective deck.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(3);
        missionCard.setSkillType(MissionSkillType.SPEC_OPS);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.DARTH_VADER);
        return missionCard;
    }

    private static MissionCard getHuntThemDown() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("Hunt Them Down");
        cardText.setDescription("""
                Attempt in any system.
                                
                If successful, destroy up to 2-health worth
                of units of your choice in this system.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(2);
        missionCard.setSkillType(MissionSkillType.SPEC_OPS);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.SOONTIR_FEL);
        return missionCard;
    }

    private static MissionCard getFearWillKeepThemInLine() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("""
                Fear Will Keep
                Them In Line
                """);
        cardText.setDescription("""
                Attempt in any system that contains
                a Death Start, Star Destroyer, or
                Super Star Destroyer.
                                
                If successful, gain 1 loyalty
                in 2 systems in this region.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.DIPLOMACY);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.GRAND_MOFF_TARKIN);
        return missionCard;
    }

    private static MissionCard getRuleByFear() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("Rule By Fear");
        cardText.setDescription("""
                Attempt in any populous system
                that contains an Imperial unit.
                                
                If successful, gain 1 loyalty in this system.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(true);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.DIPLOMACY);
        missionCard.setTotalInDeck(1);
        return missionCard;
    }

    private static MissionCard getProbeDroidInitiative() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("""
                Probe Droid
                Initiative
                """);
        cardText.setDescription("""
                Resolve in any system that contains a
                Star Destroyer or Super Star Destroyer.
                                
                Draw 2 cards from the probe deck.
                If Admiral Ozzel resolves this mission,
                draw 2 additional cards.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.INTEL);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.ADMIRAL_OZZEL);
        return missionCard;
    }

    private static MissionCard getTradeNegotiations() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("""
                Trade
                Negotiations
                """);
        cardText.setDescription("""
                Attempt in any populous system.
                                
                If successful, gain 1 loyalty in this system.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(2);
        missionCard.setSkillType(MissionSkillType.DIPLOMACY);
        missionCard.setTotalInDeck(2);
        return missionCard;
    }

    private static MissionCard getInterceptTransmission() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("""
                Intercept
                Transmission
                """);
        cardText.setDescription("""
                Attempt in any Rebel system.
                                
                If successful, the Rebel player draws
                8 cards from the probe deck. He gives
                you all cards belonging to systems that
                contain an Imperial unit. Then he shuffles
                the other cards back into the deck.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(2);
        missionCard.setSkillType(MissionSkillType.INTEL);
        missionCard.setTotalInDeck(2);
        return missionCard;
    }

    private static MissionCard getConstructFactory() {
        MissionCard missionCard = new ProjectCard();

        CardText cardText = new CardText();
        cardText.setTitle("Construct Factory");
        cardText.setDescription("""
                Resolve in any Imperial system.
                                
                Place units on the build
                queue using this system's resource
                icons and number. If there is a sabatoage
                marker in this system, remove the
                marker before resolving this ability.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.LOGISTICS);
        missionCard.setTotalInDeck(2);
        return missionCard;
    }

    private static MissionCard getOverseeProject() {
        MissionCard missionCard = new ProjectCard();

        CardText cardText = new CardText();
        cardText.setTitle("Oversee Project");
        cardText.setDescription("""
                Resolve in any system that contains
                an Imperial unit and no Rebel units.
                                
                Choose 1 Imperial unit on space
                1 or 2 of the build queue and
                deploy if in this system.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.LOGISTICS);
        missionCard.setTotalInDeck(2);
        return missionCard;
    }

    private static MissionCard getSuperLaserOnline() {
        MissionCard missionCard = new ProjectCard();

        CardText cardText = new CardText();
        cardText.setTitle("Superlaser Online");
        cardText.setDescription("""
                Resolve in any system
                that contains a Death Star.
                                
                Destroy this system and gain 1 loyalty
                in q populous system in this region.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.LOGISTICS);
        missionCard.setTotalInDeck(3);
        return missionCard;
    }

    private static MissionCard getConstructSuperStarDestroyer() {
        MissionCard missionCard = new ProjectCard();

        CardText cardText = new CardText();
        cardText.setTitle("""
                Construct Super
                Star Destroyer
                """);
        cardText.setDescription("""
                Resolve in any Imperial system
                that has a blue (?) resource icon.
                                
                Place 1 Super Star Destroyer
                on space 3 of the build queue.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.LOGISTICS);
        missionCard.setTotalInDeck(2);
        return missionCard;
    }

    private static MissionCard getConstructDeathStar() {
        MissionCard missionCard = new ProjectCard();

        CardText cardText = new CardText();
        cardText.setTitle("""
                Construct
                Death Star
                """);
        cardText.setDescription("""
                Resolve in any remote system that
                does not contain a Rebel unit.
                                
                Gain 1 Death Star Under Construction
                as this system and place 1 Death Star
                on space 3 of the build queue.
                                
                When the Death Star is deployed, it
                replaces the Death Star Under Construction.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.LOGISTICS);
        missionCard.setTotalInDeck(1);
        return missionCard;
    }

    private static MissionCard getGatherIntel() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("Gather Intel");
        cardText.setDescription("""
                Attempt in any Rebel system.
                                
                If successful, draw 1 probe card
                for every 4 Rebel units at the
                Rebel base (Minimum of 1 card).
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(true);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.INTEL);
        missionCard.setTotalInDeck(1);
        return missionCard;
    }

    private static MissionCard getResearchAndDevelopment() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("""
                Research And
                Development
                """);
        cardText.setDescription("""
                Resolve in any system that has Imperial
                loyalty. Choose 1 of the following:
                                
                - Draw 2 project cards. Choose 1
                to keep and place the other
                on the bottom of the deck.
                                
                - Remove a sabotage marker from this
                system and draw 1 project card.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(true);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.LOGISTICS);
        missionCard.setTotalInDeck(1);
        return missionCard;
    }

    private static MissionCard getLureOfTheDarkSide() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("""
                Lure Of The
                Dark Side
                """);
        cardText.setDescription("""
                Attempt against a captured leader.
                Count all skill icons during this attempt.
                                
                If successful, attach the Lure of the
                Dark Side ring to the Rebel leader.
                It becomes an Imperial leader for
                the rest of the game. If successful
                against Luke Skywalker, the Rebel
                player loses 1 reputation.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(3);
        missionCard.setSkillType(MissionSkillType.DIPLOMACY);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.EMPEROR_PALPATINE);
        return missionCard;
    }

    private static MissionCard getCarbonFreezing() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("Carbon Freezing");
        cardText.setDescription("""
                Attempt against a captured leader.
                                
                If successful, attach the Carbonite
                ring to that leader, and the Rebel
                player loses 1 reputation.
                                
                This leader is considered captured. When
                rescued, discard this attachment ring.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(3);
        missionCard.setSkillType(MissionSkillType.SPEC_OPS);
        missionCard.setTotalInDeck(1);
        return missionCard;
    }

    private static MissionCard getCaptureRebelOperative() {
        MissionCard missionCard = new MissionCard();

        CardText cardText = new CardText();
        cardText.setTitle("""
                Capture Rebel
                Operative
                """);
        cardText.setDescription("""
                Attempt against a Rebel leader that is in
                a system that contains a Imperial unit.
                                
                If successful, capture that leader.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(true);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.SPEC_OPS);
        missionCard.setTotalInDeck(1);
        return missionCard;
    }
}
