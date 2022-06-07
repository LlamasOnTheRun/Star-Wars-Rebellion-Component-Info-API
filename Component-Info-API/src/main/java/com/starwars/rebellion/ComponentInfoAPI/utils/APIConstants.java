package com.starwars.rebellion.ComponentInfoAPI.utils;

import org.springframework.stereotype.Component;

@Component
public class APIConstants {
    public static final String BASE_CONTROLLER_PATH="/components";
    public static final String ACTION_CARD_ENDPOINT = "/actioncards";
    public static final String ALL_ACTION_CARDS_ENDPOINT = "/actioncards/all";
    public static final String LEADER_ENDPOINT = "/leaders";
    public static final String ALL_LEADER_ENDPOINT = "/leaders/all";
    public static final String GET_RING_ENDPOINT = "/ring";
    public static final String ALL_RINGS_ENDPOINT = "/ring/all";
    public static final String MISSION_CARD_ENDPOINT = "/missioncards";
    public static final String GET_ALL_MISSION_CARD_ENDPOINT = "/missioncards/all";
    public static final String PROJECT_CARD_ENDPOINT = "/projectcards";
    public static final String GET_ALL_PROJECT_CARD_ENDPOINT = "/projectcards/all";
    public static final String REGION_ENDPOINT = "/regions";
    public static final String GET_ALL_REGION_ENDPOINT = "/regions/all";

    public static final int TOTAL_EMPIRE_ACTION_CARDS = 16;
    public static final int TOTAL_STARTING_EMPIRE_ACTION_CARDS = 12;
    public static final int TOTAL_NON_STARTING_EMPIRE_ACTION_CARDS = 4;
    public static final int TOTAL_REBEL_ACTION_CARDS = 18;
    public static final int TOTAL_STARTING_REBEL_ACTION_CARDS = 12;
    public static final int TOTAL_NON_STARTING_REBEL_ACTION_CARDS = 6;
    public static final int TOTAL_ACTION_CARDS = 34;

    public static final int TOTAL_DISTINCT_OBJECTIVE_CARDS = 14;
    public static final char INSPIRE_SYMPATHY_EDGE_CASE = '*';

    public static final int TOTAL_REBEL_LEADERS = 13;
    public static final int TOTAL_EMPIRE_LEADERS = 12;
    public static final int TOTAL_LEADERS = TOTAL_REBEL_LEADERS + TOTAL_EMPIRE_LEADERS;
    public static final int TOTAL_STARTING_LEADERS = 8;
    public static final int TOTAL_NON_STARTING_LEADERS =17;
    public static final int TOTAL_STARTING_MISSION_CARDS = 8;
    public static final int TOTAL_NON_STARTING_MISSION_CARDS = 40;
    public static final int TOTAL_UNIQUE_MISSION_CARDS = 48;
    public static final int TOTAL_MISSION_CARDS = 58;
    public static final int TOTAL_UNIQUE_PROJECT_CARDS = 5;
    public static final int TOTAL_PROJECT_CARDS = 10;

    public static final int TOTAL_REBEL_MISSION_CARDS = 29;
    public static final int TOTAL_UNIQUE_REBEL_MISSION_CARDS = 24;

    public static final int TOTAL_EMPIRE_MISSION_CARDS = 29;
    public static final int TOTAL_UNIQUE_EMPIRE_MISSION_CARDS = 24;

    public static final int TOTAL_RINGS = 7;

    public static final int TOTAL_REGIONS = 8;
    public static final char TOTAL_SYSTEMS = 32;

    public static final int HAN_SOLO_LEADER_ID = 9;
    public static final int REGION_ID_EXAMPLE = 120;

    public static final char NEUTRAL_LOYALTY = 'N';
    public static final char IMPERIAL_LOYALTY = 'I';
    public static final char SHIP_PRODUCTION_SYMBOL_FIRST = 'S';
    public static final char LAND_PRODUCTION_SYMBOL_FIRST = 'L';
    public static final char REMOTE_SYSTEM_IDENTIFICATION = 'X';

    public static final int DEATH_STAR_HEALTH = 0;
    public static final char BLACK_HEALTH_COLOR = 'B';
    public static final char RED_HEALTH_COLOR = 'R';
    public static final char NO_HEALTH_COLOR = 'P';
}

