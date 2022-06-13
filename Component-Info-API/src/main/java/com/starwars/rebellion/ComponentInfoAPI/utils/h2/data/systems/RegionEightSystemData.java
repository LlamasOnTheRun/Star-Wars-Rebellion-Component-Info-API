package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.SystemMapping;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.regions.RegionData;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.NEUTRAL_LOYALTY;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.SHIP_PRODUCTION_SYMBOL_FIRST;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionSevenSystemData.DATHOMIR;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionSevenSystemData.MANDALORE;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionSixSystemData.ALDERAAN;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionSixSystemData.CORUSCANT;

public class RegionEightSystemData {
    public static final System ORD_MANTELL = getOrdMantell();
    public static final System ILUM = getIlum();
    public static final System MYGEETO = getMygeeto();
    public static final System DANTOOINE  = getDantooine();

    public static List<System> fetch() {
        List<System> systems = new ArrayList<>();
        systems.add(ORD_MANTELL);
        systems.add(ILUM);
        systems.add(MYGEETO);
        systems.add(DANTOOINE);
        return systems;
    }

    private static System getOrdMantell() {
        System system = new System();

        system.setRegion(RegionData.REGION_EIGHT);
        system.setName("Ord Mantell");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getLandProduction().setLandMedium(1);
        system.getShipProduction().setShipMedium(1);
        system.setFirstProductionSymbol(SHIP_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(2);

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setTop(MANDALORE);
        systemMapping.setRight(ALDERAAN);
        systemMapping.setBottomRight(CORUSCANT);
        systemMapping.setBottomLeft(ILUM);
        systemMapping.setLeft(MYGEETO);
        system.setSystemMapping(systemMapping);

        return system;
    }

    private static System getIlum() {
        System system = new System();

        system.setRegion(RegionData.REGION_EIGHT);
        system.setName("Ilum");
        system.setRemote(true);

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setTopLeft(MYGEETO);
        systemMapping.setTopRight(ORD_MANTELL);
        system.setSystemMapping(systemMapping);

        return system;
    }

    private static System getMygeeto() {
        System system = new System();

        system.setRegion(RegionData.REGION_EIGHT);
        system.setName("Mygeeto");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getLandProduction().setLandHeavy(1);
        system.getShipProduction().setShipLight(1);
        system.setFirstProductionSymbol(SHIP_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(2);

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setLeft(DANTOOINE);
        systemMapping.setTop(DATHOMIR);
        systemMapping.setBottomRight(ILUM);
        systemMapping.setRight(ORD_MANTELL);
        systemMapping.setTopRight(MANDALORE);
        system.setSystemMapping(systemMapping);

        return system;
    }

    private static System getDantooine() {
        System system = new System();

        system.setRegion(RegionData.REGION_EIGHT);
        system.setName("Dantooine");
        system.setRemote(true);

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setRight(MYGEETO);
        systemMapping.setTopRight(DATHOMIR);
        system.setSystemMapping(systemMapping);

        return system;
    }

}
