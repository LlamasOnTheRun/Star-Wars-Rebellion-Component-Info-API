package com.starwars.rebellion.ComponentInfoAPI.utils;

import org.springframework.stereotype.Component;

@Component
public class APIConstants {
    public static final String BASE_CONTROLLER_PATH="/components";
    public static final String GET_LEADER_ENDPOINT_REBEL="rebel/getLeader";
    public static final String GET_LEADER_ENDPOINT_EMPIRE="imperial/getLeader";
    public static final String GET_ALL_REBEL_LEADERS_ENDPOINT="rebel/getAllLeaders";
    public static final String GET_ALL_IMPERIAL_LEADERS_ENDPOINT="imperial/getAllLeaders";
    public static final String GET_ACTION_CARD_ENDPOINT="/actioncards";
    public static final String GET_ALL_REBEL_ACTION_CARDS_ENDPOINT = "/actioncards/rebel";
    public static final String GET_RING_ENDPOINT = "/ring";

    public static final int TOTAL_EMPIRE_ACTION_CARDS = 16;
    public static final int TOTAL_STARTING_EMPIRE_ACTION_CARDS = 12;
    public static final int TOTAL_NON_STARTING_EMPIRE_ACTION_CARDS = 4;
    public static final int TOTAL_REBEL_ACTION_CARDS = 18;
    public static final int TOTAL_STARTING_REBEL_ACTION_CARDS = 12;
    public static final int TOTAL_NON_STARTING_REBEL_ACTION_CARDS = 6;
    public static final int TOTAL_ACTION_CARDS = 34;

    public static final int TOTAL_REBEL_MISSION_CARDS = 29;
    public static final int TOTAL_UNIQUE_REBEL_MISSION_CARDS = 24;
    public static final int TOTAL_STARTING_REBEL_MISSION_CARDS = 4;
}

