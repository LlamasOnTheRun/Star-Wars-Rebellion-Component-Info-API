package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.regions.RegionData;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;

public class RegionSevenSystemData {
    public static final System MALASTARE = getMalastare();
    public static final System KASHYYYK = getKashyyyk();
    public static final System MANDALORE = getMandalore();
    public static final System DATHOMIR = getDathomir();

    public static List<System> fetch() {
        List<System> systems = new ArrayList<>();
        systems.add(MALASTARE);
        systems.add(KASHYYYK);
        systems.add(MANDALORE);
        systems.add(DATHOMIR);
        return systems;
    }

    private static System getMalastare() {
        System system = new System();

        system.setRegion(RegionData.REGION_SEVEN);
        system.setName("Malastare");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getLandProduction().setLandLight(1);
        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(1);

        return system;
    }

    private static System getKashyyyk() {
        System system = new System();

        system.setRegion(RegionData.REGION_SEVEN);
        system.setName("Kashyyyk");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getLandProduction().setLandLight(2);
        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(1);

        return system;
    }

    private static System getMandalore() {
        System system = new System();

        system.setRegion(RegionData.REGION_SEVEN);
        system.setName("Mandalore");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getLandProduction().setLandLight(1);
        system.getShipProduction().setShipLight(1);
        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(1);

        return system;
    }

    private static System getDathomir() {
        System system = new System();

        system.setRegion(RegionData.REGION_SEVEN);
        system.setName("Dathomir");
        system.setRemote(true);
        return system;
    }

}
