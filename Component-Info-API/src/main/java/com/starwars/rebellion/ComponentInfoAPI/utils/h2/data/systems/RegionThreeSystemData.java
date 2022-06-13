package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.SystemMapping;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.regions.RegionData;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionFourSystemData.NABOO;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionFourSystemData.UTAPAU;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionSevenSystemData.MALASTARE;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionTwoSystemData.BOTHAWUI;

public class RegionThreeSystemData {
    public static final System RODIA = getRodia();
    public static final System TATOOINE = getTatooine();
    public static final System GEONOSIS = getGeonosis();
    public static final System RYLOTH = getRyloth();

    public static List<System> fetch() {
        List<System> systems = new ArrayList<>();
        systems.add(RODIA);
        systems.add(TATOOINE);
        systems.add(GEONOSIS);
        systems.add(RYLOTH);
        return systems;
    }

    private static System getRodia() {
        System system = new System();

        system.setRegion(RegionData.REGION_THREE);
        system.setName("Rodia");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getLandProduction().setLandLight(1);
        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(1);

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setLeft(BOTHAWUI);
        systemMapping.setTop(TATOOINE);
        systemMapping.setRight(GEONOSIS);
        systemMapping.setBottomRight(NABOO);
        systemMapping.setBottom(MALASTARE);
        system.setSystemMapping(systemMapping);

        return system;
    }

    private static System getTatooine() {
        System system = new System();

        system.setRegion(RegionData.REGION_THREE);
        system.setName("Tatooine");
        system.setRemote(true);

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setRight(RYLOTH);
        systemMapping.setBottomRight(GEONOSIS);
        systemMapping.setBottom(RODIA);
        systemMapping.setBottomLeft(BOTHAWUI);
        system.setSystemMapping(systemMapping);

        return system;
    }

    private static System getGeonosis() {
        System system = new System();

        system.setRegion(RegionData.REGION_THREE);
        system.setName("Geonosis");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getShipProduction().setShipLight(1);
        system.getLandProduction().setLandHeavy(1);
        system.setFirstProductionSymbol(SHIP_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(2);

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setLeft(RODIA);
        systemMapping.setTopLeft(TATOOINE);
        systemMapping.setTop(RYLOTH);
        systemMapping.setBottomRight(UTAPAU);
        systemMapping.setBottom(NABOO);
        system.setSystemMapping(systemMapping);

        return system;
    }

    private static System getRyloth() {
        System system = new System();

        system.setRegion(RegionData.REGION_THREE);
        system.setName("Ryloth");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getLandProduction().setLandLight(1);
        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(1);

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setLeft(TATOOINE);
        systemMapping.setBottom(GEONOSIS);
        system.setSystemMapping(systemMapping);

        return system;
    }
}
