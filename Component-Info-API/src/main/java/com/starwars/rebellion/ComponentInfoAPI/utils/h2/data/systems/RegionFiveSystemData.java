package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.SystemMapping;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.regions.RegionData;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionFourSystemData.DAGOBAH;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionFourSystemData.SULLUST;

public class RegionFiveSystemData {
    public static final System MUSTAFAR = getMustafar();
    public static final System BESPIN = getBespin();
    public static final System ENDOR = getEndor();
    public static final System HOTH = getHoth();

    public static List<System> fetch() {
        List<System> systems = new ArrayList<>();
        systems.add(MUSTAFAR);
        systems.add(BESPIN);
        systems.add(ENDOR);
        systems.add(HOTH);
        return systems;
    }

    private static System getMustafar() {
        System system = new System();

        system.setRegion(RegionData.REGION_FIVE);
        system.setName("Mustafar");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getShipProduction().setShipLight(1);
        system.getShipProduction().setShipMedium(1);
        system.setFirstProductionSymbol(SHIP_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(2);

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setLeft(DAGOBAH);
        systemMapping.setBottomRight(HOTH);
        systemMapping.setBottom(BESPIN);
        systemMapping.setBottomLeft(SULLUST);
        system.setSystemMapping(systemMapping);

        return system;
    }

    private static System getBespin() {
        System system = new System();

        system.setRegion(RegionData.REGION_FIVE);
        system.setName("Bespin");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getLandProduction().setLandMedium(1);
        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(1);

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setTopLeft(SULLUST);
        systemMapping.setTop(MUSTAFAR);
        systemMapping.setRight(HOTH);
        systemMapping.setBottom(ENDOR);
        system.setSystemMapping(systemMapping);

        return system;
    }

    private static System getEndor() {
        System system = new System();

        system.setRegion(RegionData.REGION_FIVE);
        system.setName("Endor");
        system.setRemote(true);

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setTop(BESPIN);
        systemMapping.setTopRight(HOTH);
        system.setSystemMapping(systemMapping);

        return system;
    }

    private static System getHoth() {
        System system = new System();

        system.setRegion(RegionData.REGION_FIVE);
        system.setName("Hoth");
        system.setRemote(true);

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setLeft(BESPIN);
        systemMapping.setTopLeft(MUSTAFAR);
        systemMapping.setBottomLeft(ENDOR);
        system.setSystemMapping(systemMapping);

        return system;
    }
}
