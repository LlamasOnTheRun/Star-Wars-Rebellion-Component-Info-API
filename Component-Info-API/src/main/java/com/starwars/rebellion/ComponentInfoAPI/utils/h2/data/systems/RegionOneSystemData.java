package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.SystemMapping;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.regions.RegionData;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionSevenSystemData.*;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionTwoSystemData.KESSEL;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionTwoSystemData.TOYDARIA;

public class RegionOneSystemData {
    public static final System MON_CALAMARI = getMonCalamari();
    public static final System FELUCIA = getFelucia();
    public static final System YAVIN = getYavin();
    public static final System SALEUCAMI = getSaleucami();

    public static List<System> fetch() {
        List<System> systems = new ArrayList<>();
        systems.add(MON_CALAMARI);
        systems.add(FELUCIA);
        systems.add(YAVIN);
        systems.add(SALEUCAMI);
        return systems;
    }

    private static System getMonCalamari() {
        System system = new System();

        system.setRegion(RegionData.REGION_ONE);
        system.setName("Mon Calamari");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getShipProduction().setShipLight(1);
        system.getShipProduction().setShipHeavy(1);
        system.setFirstProductionSymbol(SHIP_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(3);

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setBottomRight(SALEUCAMI);
        systemMapping.setBottom(FELUCIA);
        system.setSystemMapping(systemMapping);

        return system;
    }

    private static System getFelucia() {
        System system = new System();

        system.setRegion(RegionData.REGION_ONE);
        system.setName("Felucia");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getLandProduction().setLandLight(1);
        system.setFirstProductionSymbol(SHIP_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(3);

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setLeft(YAVIN);
        systemMapping.setTop(MON_CALAMARI);
        systemMapping.setRight(SALEUCAMI);
        systemMapping.setBottomLeft(MANDALORE);
        system.setSystemMapping(systemMapping);

        return system;
    }

    private static System getYavin() {
        System system = new System();

        system.setRegion(RegionData.REGION_ONE);
        system.setName("Yavin");
        system.setRemote(true);

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setRight(FELUCIA);
        systemMapping.setBottom(DATHOMIR);
        system.setSystemMapping(systemMapping);

        return system;
    }

    private static System getSaleucami() {
        System system = new System();

        system.setRegion(RegionData.REGION_ONE);
        system.setName("Saleucami");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getLandProduction().setLandMedium(1);
        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(1);

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setLeft(FELUCIA);
        systemMapping.setTopLeft(MON_CALAMARI);
        systemMapping.setTopRight(KESSEL);
        systemMapping.setRight(TOYDARIA);
        systemMapping.setBottomRight(KASHYYYK);
        systemMapping.setBottom(MANDALORE);
        system.setSystemMapping(systemMapping);

        return system;
    }
}
