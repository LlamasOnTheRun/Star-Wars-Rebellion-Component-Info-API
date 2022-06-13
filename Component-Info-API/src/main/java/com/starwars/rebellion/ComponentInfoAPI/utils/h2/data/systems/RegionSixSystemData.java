package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.SystemMapping;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.regions.RegionData;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionEightSystemData.ORD_MANTELL;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionFourSystemData.SULLUST;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionSevenSystemData.*;

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

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setLeft(CORUSCANT);
        systemMapping.setTopLeft(ALDERAAN);
        systemMapping.setTop(CATO_NEIMOIDIA);
        systemMapping.setTopRight(SULLUST);
        system.setSystemMapping(systemMapping);

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

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setLeft(ALDERAAN);
        systemMapping.setTopLeft(KASHYYYK);
        systemMapping.setTop(MALASTARE);
        systemMapping.setRight(SULLUST);
        systemMapping.setBottomRight(CORELLIA);
        system.setSystemMapping(systemMapping);

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

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setLeft(ORD_MANTELL);
        systemMapping.setTopLeft(ALDERAAN);
        systemMapping.setRight(CORELLIA);
        system.setSystemMapping(systemMapping);

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

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setLeft(ORD_MANTELL);
        systemMapping.setTopLeft(MANDALORE);
        systemMapping.setTop(KASHYYYK);
        systemMapping.setTopRight(CATO_NEIMOIDIA);
        systemMapping.setRight(CORELLIA);
        systemMapping.setBottomRight(CORUSCANT);
        system.setSystemMapping(systemMapping);

        return system;
    }
}
