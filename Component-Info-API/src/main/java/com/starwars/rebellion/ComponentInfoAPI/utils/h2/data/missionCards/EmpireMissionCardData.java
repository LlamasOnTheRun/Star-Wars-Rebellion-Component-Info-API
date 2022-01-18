package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.missionCards;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.MissionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MissionCardText;
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
        return empireMissionCards;
    }

    private static MissionCard getDisplayOfPower() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Display of Power");
        cardText.setDescription("""
                Attempt in any populous system.
                
                If successful, gain 2 loyalty in this system.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.IMPERIAL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(3);
        missionCard.setSkillType(MissionSkillType.Diplomacy);
        missionCard.setTotalInDeck(1);
        return missionCard;
    }

    private static MissionCard getInterrogationDroid() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
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
        missionCard.setSkillType(MissionSkillType.Intel);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.COLONEL_YULAREN);
        return missionCard;
    }

    private static MissionCard getImperialPropaganda() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
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
        missionCard.setSkillType(MissionSkillType.Diplomacy);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.JANUS_GREEJATUS);
        return missionCard;
    }

    private static MissionCard getInterrogation() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
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
        missionCard.setSkillType(MissionSkillType.SpecOps);
        missionCard.setTotalInDeck(2);
        return missionCard;
    }

    private static MissionCard getAddressDelays() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
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
        missionCard.setSkillType(MissionSkillType.Logistics);
        missionCard.setTotalInDeck(2);
        return missionCard;
    }

    private static MissionCard getDoubleOurEfforts() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
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
        missionCard.setSkillType(MissionSkillType.Diplomacy);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.MOFF_JERJERROD);
        return missionCard;
    }

    private static MissionCard getSecretWeaponsResearch() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
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
        missionCard.setSkillType(MissionSkillType.Logistics);
        missionCard.setTotalInDeck(2);
        return missionCard;
    }

    private static MissionCard getDetained() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
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
        missionCard.setSkillType(MissionSkillType.SpecOps);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.GENERAL_TAGGE);
        return missionCard;
    }

    private static MissionCard getHomingBeacon() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
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
        missionCard.setSkillType(MissionSkillType.Intel);
        missionCard.setTotalInDeck(1);
        return missionCard;
    }

    private static MissionCard getPlanetaryConquest() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
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
        missionCard.setSkillType(MissionSkillType.SpecOps);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.GENERAL_VEERS);
        return missionCard;
    }

    private static MissionCard getLongRangeProbe() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
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
        missionCard.setSkillType(MissionSkillType.Intel);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.ADMIRAL_PIETT);
        return missionCard;
    }

    private static MissionCard getCollectBounty() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
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
        missionCard.setSkillType(MissionSkillType.SpecOps);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.BOBA_FETT);
        return missionCard;
    }

    private static MissionCard getRetrieveThePlans() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
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
        missionCard.setSkillType(MissionSkillType.SpecOps);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.DARTH_VADER);
        return missionCard;
    }

    private static MissionCard getHuntThemDown() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
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
        missionCard.setSkillType(MissionSkillType.SpecOps);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.SOONTIR_FEL);
        return missionCard;
    }

    private static MissionCard getFearWillKeepThemInLine() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
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
        missionCard.setSkillType(MissionSkillType.Diplomacy);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(EmpireLeaderData.GRAND_MOFF_TARKIN);
        return missionCard;
    }
}
