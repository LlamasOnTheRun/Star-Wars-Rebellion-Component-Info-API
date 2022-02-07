package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.regions.RegionData;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;

public class RegionTwoSystemData {
    public static final System KESSEL = getKessel();
    public static final System TOYDARIA = getToydaria();
    public static final System NAL_HUTTA = getNalHutta();
    public static final System BOTHAWUI = getBothawui();

    public static List<System> fetch() {
        List<System> systems = new ArrayList<>();
        systems.add(KESSEL);
        systems.add(TOYDARIA);
        systems.add(NAL_HUTTA);
        systems.add(BOTHAWUI);
        return systems;
    }

    private static System getKessel() {
        System system = new System();

        system.setRegion(RegionData.REGION_TWO);
        system.setName("Kessel");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getLandProduction().setLandLight(1);
        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(1);

        return system;
    }

    private static System getToydaria() {
        System system = new System();

        system.setRegion(RegionData.REGION_TWO);
        system.setName("Toydaria");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getShipProduction().setShipMedium(1);
        system.setFirstProductionSymbol(SHIP_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(2);

        return system;
    }

    private static System getNalHutta() {
        System system = new System();

        system.setRegion(RegionData.REGION_TWO);
        system.setName("Nal Hutta");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getShipProduction().setShipLight(1);
        system.getLandProduction().setLandLight(1);
        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(2);

        return system;
    }

    private static System getBothawui() {
        System system = new System();

        system.setRegion(RegionData.REGION_TWO);
        system.setName("Bothawui");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getShipProduction().setShipMedium(1);
        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(1);

        return system;
    }
}
