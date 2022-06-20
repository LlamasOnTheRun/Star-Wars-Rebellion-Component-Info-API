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

        System targetedSystem;

        targetedSystem = ORD_MANTELL;
        targetedSystem.setSystemMapping(getOrdMantellSystemMapping());
        systems.add(targetedSystem);

        targetedSystem = ILUM;
        targetedSystem.setSystemMapping(getIlumSystemMapping());
        systems.add(targetedSystem);

        targetedSystem = MYGEETO;
        targetedSystem.setSystemMapping(getMygeetoSystemMapping());
        systems.add(targetedSystem);

        targetedSystem = DANTOOINE;
        targetedSystem.setSystemMapping(getDantooineSystemMapping());
        systems.add(targetedSystem);

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

        return system;
    }

    private static SystemMapping getOrdMantellSystemMapping() {
        SystemMapping systemMapping = new SystemMapping();

        systemMapping.setTop(MANDALORE);
        systemMapping.setTopRight(ALDERAAN);
        systemMapping.setRight(CORUSCANT);
        systemMapping.setBottomLeft(ILUM);
        systemMapping.setLeft(MYGEETO);

        return systemMapping;
    }

    private static System getIlum() {
        System system = new System();

        system.setRegion(RegionData.REGION_EIGHT);
        system.setName("Ilum");
        system.setRemote(true);

        return system;
    }

    private static SystemMapping getIlumSystemMapping() {
        SystemMapping systemMapping = new SystemMapping();

        systemMapping.setTopLeft(MYGEETO);
        systemMapping.setTopRight(ORD_MANTELL);

        return systemMapping;
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

        return system;
    }

    private static SystemMapping getMygeetoSystemMapping() {
        SystemMapping systemMapping = new SystemMapping();

        systemMapping.setLeft(DANTOOINE);
        systemMapping.setTop(DATHOMIR);
        systemMapping.setBottomRight(ILUM);
        systemMapping.setRight(ORD_MANTELL);
        systemMapping.setTopRight(MANDALORE);

        return systemMapping;
    }

    private static System getDantooine() {
        System system = new System();

        system.setRegion(RegionData.REGION_EIGHT);
        system.setName("Dantooine");
        system.setRemote(true);

        return system;
    }

    private static SystemMapping getDantooineSystemMapping() {
        SystemMapping systemMapping = new SystemMapping();

        systemMapping.setRight(MYGEETO);
        systemMapping.setTopRight(DATHOMIR);

        return systemMapping;
    }
}
