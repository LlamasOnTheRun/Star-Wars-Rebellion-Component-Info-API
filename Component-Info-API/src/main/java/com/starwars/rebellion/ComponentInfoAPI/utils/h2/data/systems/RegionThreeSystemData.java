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

        System targetedSystem;

        targetedSystem = RODIA;
        targetedSystem.setSystemMapping(getRodiaSystemMapping());
        systems.add(targetedSystem);

        targetedSystem = TATOOINE;
        targetedSystem.setSystemMapping(getTatooineSystemMapping());
        systems.add(targetedSystem);

        targetedSystem = GEONOSIS;
        targetedSystem.setSystemMapping(getGeonosisSystemMapping());
        systems.add(targetedSystem);

        targetedSystem = RYLOTH;
        targetedSystem.setSystemMapping(getRylothSystemMapping());
        systems.add(targetedSystem);

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

        return system;
    }

    private static SystemMapping getRodiaSystemMapping() {
        SystemMapping systemMapping = new SystemMapping();

        systemMapping.setLeft(BOTHAWUI);
        systemMapping.setTop(TATOOINE);
        systemMapping.setRight(GEONOSIS);
        systemMapping.setBottomRight(NABOO);
        systemMapping.setBottom(MALASTARE);

        return systemMapping;
    }

    private static System getTatooine() {
        System system = new System();

        system.setRegion(RegionData.REGION_THREE);
        system.setName("Tatooine");
        system.setRemote(true);

        return system;
    }

    private static SystemMapping getTatooineSystemMapping() {
        SystemMapping systemMapping = new SystemMapping();

        systemMapping.setRight(RYLOTH);
        systemMapping.setBottomRight(GEONOSIS);
        systemMapping.setBottom(RODIA);
        systemMapping.setBottomLeft(BOTHAWUI);

        return systemMapping;
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

        return system;
    }

    private static SystemMapping getGeonosisSystemMapping() {
        SystemMapping systemMapping = new SystemMapping();

        systemMapping.setLeft(RODIA);
        systemMapping.setTopLeft(TATOOINE);
        systemMapping.setTop(RYLOTH);
        systemMapping.setBottomRight(UTAPAU);
        systemMapping.setBottom(NABOO);

        return systemMapping;
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

        return system;
    }

    private static SystemMapping getRylothSystemMapping() {
        SystemMapping systemMapping = new SystemMapping();

        systemMapping.setLeft(TATOOINE);
        systemMapping.setBottom(GEONOSIS);

        return systemMapping;
    }
}
