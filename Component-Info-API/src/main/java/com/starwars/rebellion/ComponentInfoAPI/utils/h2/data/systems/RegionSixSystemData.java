package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.regions.RegionData;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;

public class RegionSixSystemData {
    public static final System CORELLIA = getCorellia();
    public static final System CATO_NEIMOIDIA = getCatoNeimoidia();
    public static final System CORUSCANT = getCoruscant();
    public static final System ALDERAAN = getAlderaan();

    public static List<System> fetch() {
        List<System> systems = new ArrayList<>();
        systems.add(CORELLIA);
        systems.add(CATO_NEIMOIDIA);
        systems.add(CORUSCANT);
        systems.add(ALDERAAN);
        return systems;
    }

    private static System getCorellia() {
        System system = new System();

        system.setRegion(RegionData.REGION_SIX);
        system.setName("Corellia");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getShipProduction().setShipLight(1);
        system.getShipProduction().setShipHeavy(1);
        system.setFirstProductionSymbol(SHIP_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(2);

        return system;
    }

    private static System getCatoNeimoidia() {
        System system = new System();

        system.setRegion(RegionData.REGION_SIX);
        system.setName("Cato Neimoidia");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getShipProduction().setShipLight(1);
        system.getLandProduction().setLandMedium(1);
        system.setFirstProductionSymbol(SHIP_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(2);

        return system;
    }

    private static System getCoruscant() {
        System system = new System();

        system.setRegion(RegionData.REGION_SIX);
        system.setName("Coruscant");
        system.setRemote(false);
        system.setLoyalty(IMPERIAL_LOYALTY);
        system.getLandProduction().setLandLight(1);
        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(1);

        return system;
    }

    private static System getAlderaan() {
        System system = new System();

        system.setRegion(RegionData.REGION_SIX);
        system.setName("Alderann");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getLandProduction().setLandLight(1);
        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(1);

        return system;
    }
}
