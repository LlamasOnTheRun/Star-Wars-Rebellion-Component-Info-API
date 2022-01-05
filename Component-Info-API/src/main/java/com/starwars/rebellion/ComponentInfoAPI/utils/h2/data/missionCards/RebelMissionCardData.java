package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.missionCards;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.MissionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MissionCardText;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.MissionSkillType;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.leaders.RebelLeaderData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RebelMissionCardData {
    public static final MissionCard FOR_THE_GREATER_GOOD = getForTheGreaterGood();
    public static final MissionCard STOLEN_PLANS = getStolenPlans();
    public static final MissionCard WOOKIE_UPRISING = getWookieUprising();
    public static final MissionCard PUBLIC_UPRISING = getPublicUprising();
    public static final MissionCard BASE_DEFENSES = getBaseDefenses();
    public static final MissionCard COVERT_OPERATION = getCovertOperation();
    public static final MissionCard BUILD_ALLIANCE = getBuildAlliance();
    public static final MissionCard CONTINGENCY_PLAN = getContingencyPlan();
    public static final MissionCard PLAN_THE_ASSAULT = getPlanTheAssault();
    public static final MissionCard DARING_SUPPORT = getDaringSupport();
    public static final MissionCard SUPPORT_OF_MON_CALAMARI = getSupportOfMonCalamari();
    public static final MissionCard DEMOLITION = getDemolition();
    public static final MissionCard ESTABLISHED_TRADE_RELATIONS = getEstablishTradeRelations();
    public static final MissionCard HIT_AND_RUN = getHitAndRun();
    public static final MissionCard INCITE_REBELLION = getInciteRebellion();
    public static final MissionCard INFILTRATION = getInfiltration();
    public static final MissionCard HIDDEN_FLEET = getHiddenFleet();
    public static final MissionCard MISDIRECTION = getMisdirection();
    public static final MissionCard PLANT_FALSE_LEAD = getPlantFalseLead();
    public static final MissionCard GET_RAPID_MOBILIZATION = getRapidMobilization();
    public static final MissionCard SEEK_YODA = getSeekYoda();
    public static final MissionCard ROUGE_SQUADRON_RAID = getRougeSquadronRaid();
    public static final MissionCard SABOTAGE = getSabotage();
    public static final MissionCard LEAD_THE_STRIKE_TEAM = getLeadStrikeTeam();

    public static List<MissionCard> fetch() {
        List<MissionCard> rebelMissionCards = new ArrayList<>();
        rebelMissionCards.add(FOR_THE_GREATER_GOOD);
        rebelMissionCards.add(STOLEN_PLANS);
        rebelMissionCards.add(WOOKIE_UPRISING);
        rebelMissionCards.add(PUBLIC_UPRISING);
        rebelMissionCards.add(BASE_DEFENSES);
        rebelMissionCards.add(COVERT_OPERATION);
        rebelMissionCards.add(BUILD_ALLIANCE);
        rebelMissionCards.add(CONTINGENCY_PLAN);
        rebelMissionCards.add(PLAN_THE_ASSAULT);
        rebelMissionCards.add(DARING_SUPPORT);
        rebelMissionCards.add(SUPPORT_OF_MON_CALAMARI);
        rebelMissionCards.add(DEMOLITION);
        rebelMissionCards.add(ESTABLISHED_TRADE_RELATIONS);
        rebelMissionCards.add(HIT_AND_RUN);
        rebelMissionCards.add(INCITE_REBELLION);
        rebelMissionCards.add(INFILTRATION);
        rebelMissionCards.add(HIDDEN_FLEET);
        rebelMissionCards.add(MISDIRECTION);
        rebelMissionCards.add(PLANT_FALSE_LEAD);
        rebelMissionCards.add(GET_RAPID_MOBILIZATION);
        rebelMissionCards.add(SEEK_YODA);
        rebelMissionCards.add(ROUGE_SQUADRON_RAID);
        rebelMissionCards.add(SABOTAGE);
        rebelMissionCards.add(LEAD_THE_STRIKE_TEAM);
        return rebelMissionCards;
    }

    private static MissionCard getForTheGreaterGood() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("""
                For The
                Greater Good
                """);
        cardText.setDescription("""
                Attempt in any system that
                contains a captured leader.
                
                If successful, rescue that leader and
                draw 1 objective card. The leader(s)
                assigned to this mission remain in
                this system.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(3);
        missionCard.setSkillType(MissionSkillType.Intel);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(RebelLeaderData.OBI_WAN_KENOBI);
        return missionCard;
    }

    private static MissionCard getStolenPlans() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Stolen Plans");
        cardText.setDescription("""
                Attempt in any system that
                contains an Imperial unit.
                                
                If successful, look at the top 4 cards of
                the objective deck. Place those cards
                on top of the deck in any order.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(2);
        missionCard.setSkillType(MissionSkillType.Intel);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(RebelLeaderData.PRINCESS_LEIA);
        return missionCard;
    }

    private static MissionCard getWookieUprising() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Wookie Uprising");
        cardText.setDescription("""
                Attempt in the Kashyyyk system.
                                
                If successful, gain 1 loyalty in this
                system and destroy up to 4-health worth
                of units of your choice in this system.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(3);
        missionCard.setSkillType(MissionSkillType.SpecOps);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(RebelLeaderData.CHEWBACCA);
        return missionCard;
    }

    private static MissionCard getDemolition() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Demolition");
        cardText.setDescription("""
                Attempt in any Imperial system.
                                
                If successful, for each of this system's
                resource icons, destroy 1 unit of the
                build queue that matches the icon.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(3);
        missionCard.setSkillType(MissionSkillType.SpecOps);
        missionCard.setTotalInDeck(1);
        return missionCard;
    }

    private static MissionCard getSupportOfMonCalamari() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("""
                Support of
                Mon Calamari
                """);
        cardText.setDescription("""
                Attempt in the Mon Calamari system.
                                
                If successful, either gain 2 loyalty in this
                system or place a Mon Calamari Cruiser
                on space 3 of the build queue.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(2);
        missionCard.setSkillType(MissionSkillType.Diplomacy);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(RebelLeaderData.ADMIRAL_ACKBAR);
        return missionCard;
    }

    private static MissionCard getDaringSupport() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Daring Rescue");
        cardText.setDescription("""
                Attempt in any system that
                contains a captured leader.
                                
                If successful, rescue that leader.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(2);
        missionCard.setSkillType(MissionSkillType.Diplomacy);
        missionCard.setTotalInDeck(2);
        return missionCard;
    }

    private static MissionCard getEstablishTradeRelations() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Establish Trade Relations");
        cardText.setDescription("""
                Attempt in any system that does
                not contain a sabotage marker.
                                
                If successful, gain 1 loyalty in the
                system and place units on the build
                queue using this system's resources
                icons and number.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(3);
        missionCard.setSkillType(MissionSkillType.Diplomacy);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(RebelLeaderData.MON_MOTHMA);
        return missionCard;
    }

    private static MissionCard getHitAndRun() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Hit And Run");
        cardText.setDescription("""
                Attempt in any system.
                                
                If successful, destroy up to 2-health worth
                of units of your choice in this system.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(2);
        missionCard.setSkillType(MissionSkillType.SpecOps);
        missionCard.setTotalInDeck(2);
        return missionCard;
    }

    private static MissionCard getInfiltration() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Infiltration");
        cardText.setDescription("""
                Attempt in any system that
                contains an Imperial unit.
                                
                If successful, look at the top 2 cards
                of the objective deck. Place 1 card on
                the top of the deck and the other card
                on the bottom.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(true);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.Intel);
        missionCard.setTotalInDeck(1);
        return missionCard;
    }

    private static MissionCard getMisdirection() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Misdirection");
        cardText.setDescription("""
                Attempt in any system that
                contains an Imperial unit.
                                
                If successful, choose 1 of your leaders.
                Imperial leaders in the leader pool
                cannot be sent to oppose that
                leader's mission this round.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.SpecOps);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(RebelLeaderData.GENERAL_MADINE);
        return missionCard;
    }

    private static MissionCard getBuildAlliance() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Build Alliance");
        cardText.setDescription("""
                Attempt in any populous system.
                If there are Rebel units in this
                system, roll 2 additional dice.
                                
                If successful, gain 1 loyalty in this system.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(true);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.Diplomacy);
        missionCard.setTotalInDeck(1);
        return missionCard;
    }

    private static MissionCard getPublicUprising() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Public Uprising");
        cardText.setDescription("""
                Attempt in any subjugated system.
                                
                If successful, gain 1 (?) and 2 (?) units
                (ships and/or ground units) in the
                system. Then resolve a combat.
                """);//todo will have to find a way to add symbols to text
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(3);
        missionCard.setSkillType(MissionSkillType.Diplomacy);
        missionCard.setTotalInDeck(1);
        return missionCard;
    }

    private static MissionCard getHiddenFleet() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Hidden Fleet");
        cardText.setDescription("""
                Resolve in any system that does not
                contain an Imperial unit.
                                
                Move units from the "Rebel Base" space
                to this system as if they were adjacent.
                Leaders in the "Rebel Base" space do
                not prevent this movement.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.Logistics);
        missionCard.setTotalInDeck(3);
        return missionCard;
    }

    private static MissionCard getPlanTheAssault() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("""
                Plan the
                Assault
                """);
        cardText.setDescription("""
                Attempt in any system that
                contains an Imperial ship.
                                
                If successful, move ships (but not ground
                units) from the "Rebel Base" space to
                this system as if they were adjacent.
                Leaders in the "Rebel Base" space
                do not prevent this movement.
                Then resolve a combat in this system.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(2);
        missionCard.setSkillType(MissionSkillType.Intel);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(RebelLeaderData.JAN_DODONNA);
        return missionCard;
    }

    private static MissionCard getPlantFalseLead() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Plant False Lead");
        cardText.setDescription("""
                Resolve in any system that contains
                an Imperial unit.
                                
                Randomly take 4 of the Imperial
                player's probe cards. Place these
                cards on the top and/or bottom of the
                deck in any order without showing
                them to the imperial player.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.Logistics);
        missionCard.setTotalInDeck(1);
        return missionCard;
    }

    private static MissionCard getContingencyPlan() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Contingency Plan");
        cardText.setDescription("""
                Assign this leader to a starting mission
                from your hand, even one that was
                already attempted or resolved this round.
                                
                If Lando Calrissian was assigned to
                this mission, he gains 2 additional
                successes when he attempts a
                mission later this round.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.Logistics);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(RebelLeaderData.LANDO_CALRISSIAN);
        return missionCard;
    }

    private static MissionCard getRapidMobilization() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Rapid Mobilization");
        cardText.setDescription("""
                Resolve in the "Rebel Base" space. At the
                end of this phase, choose 1 of the following:
                                
                - If the Rebel base in not revealed,
                move up to 5 units from 1 system to the
                "Rebel Base" space, ignoring adjacency.
                                
                - Establish a new Rebel base. If 2
                leaders are assigned to this mission,
                draw 8 probe cards instead of 4.
                """);//todo will have to find a way to add bullenten points for the front end
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(true);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.Logistics);
        missionCard.setTotalInDeck(1);
        return missionCard;
    }

    private static MissionCard getSeekYoda() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Seek Yoda");
        cardText.setDescription("""
                Resolve in the Dagobah system.
                                
                Attach the Master Yoda ring to this leader.
                Once per game round, when this leader
                is in the same system as a mission or
                combat, you may reroll 1 of your dice.
                                
                If Luke Skywalker resolves this
                mission, also replace his leader
                with Luke Skywalker (Jedi).
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.Intel);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(RebelLeaderData.LUKE_SKYWALKER);
        return missionCard;
    }

    private static MissionCard getRougeSquadronRaid() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("""
                Rouge
                Squadron Raid
                """);
        cardText.setDescription("""
                Attempt in any Imperial system.
                                
                If successful, destroy up to 4-health worth
                of units of your choice on the build queue.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(2);
        missionCard.setSkillType(MissionSkillType.SpecOps);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(RebelLeaderData.WEDGE_ANTILLES);
        return missionCard;
    }

    private static MissionCard getSabotage() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Sabotage");
        cardText.setDescription("""
                Attempt in any system.
                                
                If successful, place a sabotage marker
                in this system. This marker prevents
                players from building units from and
                deploying units in this system.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(true);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.SpecOps);
        missionCard.setTotalInDeck(1);
        return missionCard;
    }

    private static MissionCard getBaseDefenses() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Base Defenses");
        cardText.setDescription("""
                Attempt in any Rebel system.
                                
                If successful, gain 1 Ion Cannon
                and 1 Shield Generator in the
                "Rebel Base" space.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.Diplomacy);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(RebelLeaderData.GENERAL_RIEEKAN);
        return missionCard;
    }

    private static MissionCard getCovertOperation() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Covert Operation");
        cardText.setDescription("""
                Attempt in any system that
                contains Imperial units.
                                
                If successful, draw 2 objective cards.
                Choose 1 to keep and place the
                other on the bottom of the deck.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(1);
        missionCard.setSkillType(MissionSkillType.Intel);
        missionCard.setTotalInDeck(1);
        return missionCard;
    }

    private static MissionCard getInciteRebellion() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("Incite Rebellion");
        cardText.setDescription("""
                Attempt in any subjugated system.
                                
                If successful, gain 3 Rebel Troopers
                in this system. Then resolve a combat.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(2);
        missionCard.setSkillType(MissionSkillType.Diplomacy);
        missionCard.setTotalInDeck(2);
        return missionCard;
    }

    private static MissionCard getLeadStrikeTeam() {
        MissionCard missionCard = new MissionCard();

        MissionCardText cardText = new MissionCardText();
        cardText.setTitle("""
                Lead the
                Strike Team
                """);
        cardText.setDescription("""
                Attempt in any system.
                                
                If successful ,move up to 4 ground
                units from the "Rebel Base" space
                to the system, ignoring transport
                restrictions and adjacency.
                                
                If there are Imperial ground units in
                this system, resolve a combat.
                """);
        missionCard.setCardText(cardText);

        missionCard.setFaction(Faction.REBEL);
        missionCard.setStartingCard(false);
        missionCard.setMinSkillNumRequired(2);
        missionCard.setSkillType(MissionSkillType.SpecOps);
        missionCard.setTotalInDeck(1);
        missionCard.setLeaderBonus(RebelLeaderData.HAN_SOLO);
        return missionCard;
    }
}
