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
    public static final String GET_UNIT_ENDPOINT = "/units";
    public static final String GET_ALL_UNIT_ENDPOINT = "/units/all";
    public static final String SYSTEM_ENDPOINT = "/systems";
    public static final String GET_ALL_SYSTEM_ENDPOINT = "/systems/all";
    public static final String OBJECTIVE_CARD_ENDPOINT = "/objectivecards";
    public static final String ALL_OBJECTIVE_CARDS_ENDPOINT = "/objectivecards/all";

    public static final int TOTAL_EMPIRE_ACTION_CARDS = 16;
    public static final int TOTAL_STARTING_EMPIRE_ACTION_CARDS = 12;
    public static final int TOTAL_NON_STARTING_EMPIRE_ACTION_CARDS = 4;
    public static final int TOTAL_REBEL_ACTION_CARDS = 18;
    public static final int TOTAL_STARTING_REBEL_ACTION_CARDS = 12;
    public static final int TOTAL_NON_STARTING_REBEL_ACTION_CARDS = 6;
    public static final int TOTAL_ACTION_CARDS = 34;

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

    public static final int TOTAL_NON_REMOTE_SYSTEMS = 24;
    public static final int TOTAL_REMOTE_SYSTEMS = 8;

    public static final int TOTAL_REBEL_MISSION_CARDS = 29;
    public static final int TOTAL_UNIQUE_REBEL_MISSION_CARDS = 24;

    public static final int TOTAL_EMPIRE_MISSION_CARDS = 29;
    public static final int TOTAL_UNIQUE_EMPIRE_MISSION_CARDS = 24;

    public static final int TOTAL_RINGS = 7;

    public static final int TOTAL_REGIONS = 8;
    public static final char TOTAL_SYSTEMS = 32;

    public static final int TOTAL_OBJECTIVE_CARDS = 14;
    public static final int TOTAL_LEVEL_ONE_OBJECTIVE_CARDS = 5;
    public static final int TOTAL_LEVEL_TWO_OBJECTIVE_CARDS = 5;
    public static final int TOTAL_LEVEL_THREE_OBJECTIVE_CARDS = 5;
    
    public static final int TOTAL_UNIQUE_UNITS = 18;
    public static final int TOTAL_UNITS = 103;
    public static final int TOTAL_UNIQUE_REBEL_UNITS = 9;
    public static final int TOTAL_REBEL_UNITS = 50;
    public static final int TOTAL_UNIQUE_EMPIRE_UNITS = 9;
    public static final int TOTAL_EMPIRE_UNITS = 53;
    public static final int TOTAL_UNIQUE_SHIP_UNITS = 11;
    public static final int TOTAL_UNIQUE_GROUND_UNITS = 7;
    public static final int TOTAL_UNIQUE_LIGHT_UNITS = 6;
    public static final int TOTAL_UNIQUE_MEDIUM_UNITS = 4;
    public static final int TOTAL_UNIQUE_HEAVY_UNITS = 5;
    public static final int TOTAL_UNIQUE_PROJECT_UNITS = 3;
    public static final int TOTAL_UNIQUE_UNITS_W_BLACK_DIE_ZERO = 6;
    public static final int TOTAL_UNIQUE_UNITS_W_BLACK_DIE_ONE = 11;
    public static final int TOTAL_UNIQUE_UNITS_W_BLACK_DIE_TWO = 1;
    public static final int TOTAL_UNIQUE_UNITS_W_RED_DIE_ZERO = 8;
    public static final int TOTAL_UNIQUE_UNITS_W_RED_DIE_ONE = 5;
    public static final int TOTAL_UNIQUE_UNITS_W_RED_DIE_TWO = 3;
    public static final int TOTAL_UNIQUE_UNITS_W_RED_DIE_THREE = 1;
    public static final int TOTAL_UNIQUE_UNITS_W_RED_DIE_FOUR = 1;
    public static final int TOTAL_UNIQUE_UNITS_W_ONE_HEALTH = 5;
    public static final int TOTAL_UNIQUE_UNITS_W_TWO_HEALTH = 5;
    public static final int TOTAL_UNIQUE_UNITS_W_THREE_HEALTH = 3;
    public static final int TOTAL_UNIQUE_UNITS_W_FOUR_HEALTH = 3;
    public static final int TOTAL_UNIQUE_UNITS_W_SIX_HEALTH = 1;
    public static final int TOTAL_UNIQUE_UNITS_W_RED_HEALTH_COLOR = 11;
    public static final int TOTAL_UNIQUE_UNITS_W_BLACK_HEALTH_COLOR = 6;
    public static final int TOTAL_UNIQUE_UNITS_W_NO_HEALTH_COLOR = 1;
    public static final int TOTAL_UNIQUE_UNITS_W_ZERO_SHIP_CAPACITY = 11;
    public static final int TOTAL_UNIQUE_UNITS_W_TWO_SHIP_CAPACITY = 1;
    public static final int TOTAL_UNIQUE_UNITS_W_FOUR_SHIP_CAPACITY = 3;
    public static final int TOTAL_UNIQUE_UNITS_W_SIX_SHIP_CAPACITY = 1;
    public static final int TOTAL_UNIQUE_UNITS_W_EIGHT_SHIP_CAPACITY = 2;
    public static final int TOTAL_UNIQUE_NON_INVINCIBLE_UNITS = 17;
    public static final int TOTAL_UNIQUE_INVINCIBLE_UNITS = 1;
    public static final int TOTAL_UNIQUE_UNITS_NEED_TRANSPORT = 6;
    public static final int TOTAL_UNIQUE_UNITS_DO_NOT_NEED_TRANSPORT = 12;
    public static final int TOTAL_UNIQUE_NON_STRUCTURE_UNITS = 15;
    public static final int TOTAL_UNIQUE_STRUCTURE_UNITS = 3;
    public static final int TOTAL_UNIQUE_UNITS_W_TOTAL_IN_GAME_ONE = 1;
    public static final int TOTAL_UNIQUE_UNITS_W_TOTAL_IN_GAME_TWO = 2;
    public static final int TOTAL_UNIQUE_UNITS_W_TOTAL_IN_GAME_THREE = 6;
    public static final int TOTAL_UNIQUE_UNITS_W_TOTAL_IN_GAME_FOUR = 1;
    public static final int TOTAL_UNIQUE_UNITS_W_TOTAL_IN_GAME_FIVE = 3;
    public static final int TOTAL_UNIQUE_UNITS_W_TOTAL_IN_GAME_SIX = 1;
    public static final int TOTAL_UNIQUE_UNITS_W_TOTAL_IN_GAME_TEN = 1;
    public static final int TOTAL_UNIQUE_UNITS_W_TOTAL_IN_GAME_TWELVE = 1;
    public static final int TOTAL_UNIQUE_UNITS_W_TOTAL_IN_GAME_FIFTEEN = 1;
    public static final int TOTAL_UNIQUE_UNITS_W_TOTAL_IN_GAME_EIGHTEEN = 1;

    public static final int HAN_SOLO_LEADER_ID = 9;
    public static final int INSPIRE_SYMPATHY_OBJECTIVE_CARD_ID = 160;
    public static final String INSPIRE_SYMPATHY_OBJECTIVE_CARD_TITLE = "Inspire Sympathy";
    public static final int REGION_ID_EXAMPLE = 120;
    public static final int SYSTEM_ID_EXAMPLE = 128;
    public static final String SYSTEM_NAME_EXAMPLE = "Mon Calamari";

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

