package com.starwars.rebellion.ComponentInfoAPI.utils;

import org.springframework.stereotype.Component;

@Component
public class APIConstants {
    public static final String BASE_CONTROLLER_PATH="/components";
    public static final String GET_LEADER_ENDPOINT="/leader";
    public static final String GET_ALL_REBEL_LEADERS_ENDPOINT="/leaders/rebel";
    public static final String GET_ACTION_CARD_ENDPOINT="/actioncards";
    public static final String GET_ALL_REBEL_ACTION_CARDS_ENDPOINT="/actioncards/rebel";
    public static final String GET_RING_ENDPOINT="/ring";
}
