package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.regions.RegionData;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.NEUTRAL_LOYALTY;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.SHIP_PRODUCTION_SYMBOL_FIRST;

public class RegionFiveSystemData {
    public static final System MUSTAFAR = getMustafar();

    public static List<System> fetch() {
        List<System> systems = new ArrayList<>();
        systems.add(MUSTAFAR);
        return systems;
    }

    private static System getMustafar() {
        System system = new System();

        system.setRegion(RegionData.REGION_ONE);
        system.setName("Mon Calamari");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getShipProduction().setShipLight(1);
        system.getShipProduction().setShipHeavy(1);
        system.setFirstProductionSymbol(SHIP_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(3);

        return system;
    }
}
