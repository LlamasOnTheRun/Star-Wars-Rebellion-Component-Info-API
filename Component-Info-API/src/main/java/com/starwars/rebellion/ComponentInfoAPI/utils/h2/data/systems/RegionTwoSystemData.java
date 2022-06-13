package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.SystemMapping;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.regions.RegionData;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionOneSystemData.SALEUCAMI;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionSevenSystemData.KASHYYYK;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionSevenSystemData.MALASTARE;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionThreeSystemData.RODIA;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionThreeSystemData.TATOOINE;

public class RegionTwoSystemData {
    public static final System KESSEL = getKessel();
    public static final System TOYDARIA = getToydaria();
    public static final System NAL_HUTTA = getNalHutta();
    public static final System BOTHAWUI = getBothawui();

    public static List<System> fetch() {
        List<System> systems = new ArrayList<>();

        System targetedSystem;

        targetedSystem = KESSEL;
        targetedSystem.setSystemMapping(getKesselSystemMapping());
        systems.add(targetedSystem);

        targetedSystem = TOYDARIA;
        targetedSystem.setSystemMapping(getToydariaSystemMapping());
        systems.add(targetedSystem);

        targetedSystem = NAL_HUTTA;
        targetedSystem.setSystemMapping(getNalHuttaSystemMapping());
        systems.add(targetedSystem);

        targetedSystem = BOTHAWUI;
        targetedSystem.setSystemMapping(getBothawuiSystemMapping());
        systems.add(targetedSystem);

        return systems;
    }

    private static System getKessel() {
        System system = new System();

        system.setRegion(RegionData.REGION_TWO);
        system.setName("Kessel");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getLandProduction().setLandLight(1);
        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(1);

        return system;
    }

    private static SystemMapping getKesselSystemMapping() {
        SystemMapping systemMapping = new SystemMapping();

        systemMapping.setRight(NAL_HUTTA);
        systemMapping.setBottomRight(TOYDARIA);
        systemMapping.setBottomLeft(SALEUCAMI);

        return systemMapping;
    }

    private static System getToydaria() {
        System system = new System();

        system.setRegion(RegionData.REGION_TWO);
        system.setName("Toydaria");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getShipProduction().setShipMedium(1);
        system.setFirstProductionSymbol(SHIP_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(2);

        return system;
    }

    private static SystemMapping getToydariaSystemMapping() {
        SystemMapping systemMapping = new SystemMapping();

        systemMapping.setLeft(SALEUCAMI);
        systemMapping.setTopLeft(KESSEL);
        systemMapping.setTop(NAL_HUTTA);
        systemMapping.setRight(BOTHAWUI);
        systemMapping.setBottomRight(MALASTARE);
        systemMapping.setBottom(KASHYYYK);

        return systemMapping;
    }

    private static System getNalHutta() {
        System system = new System();

        system.setRegion(RegionData.REGION_TWO);
        system.setName("Nal Hutta");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getShipProduction().setShipLight(1);
        system.getLandProduction().setLandLight(1);
        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(2);

        return system;
    }

    private static SystemMapping getNalHuttaSystemMapping() {
        SystemMapping systemMapping = new SystemMapping();

        systemMapping.setLeft(KESSEL);
        systemMapping.setBottomRight(BOTHAWUI);
        systemMapping.setBottom(TOYDARIA);

        return systemMapping;
    }

    private static System getBothawui() {
        System system = new System();

        system.setRegion(RegionData.REGION_TWO);
        system.setName("Bothawui");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getShipProduction().setShipMedium(1);
        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(1);

        return system;
    }

    private static SystemMapping getBothawuiSystemMapping() {
        SystemMapping systemMapping = new SystemMapping();

        systemMapping.setLeft(TOYDARIA);
        systemMapping.setTopLeft(NAL_HUTTA);
        systemMapping.setTopRight(TATOOINE);
        systemMapping.setRight(RODIA);
        systemMapping.setBottom(MALASTARE);

        return systemMapping;
    }
}
