package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.SystemMapping;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.regions.RegionData;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionFiveSystemData.BESPIN;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionFiveSystemData.MUSTAFAR;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionSevenSystemData.MALASTARE;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionSixSystemData.CATO_NEIMOIDIA;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionSixSystemData.CORELLIA;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionThreeSystemData.GEONOSIS;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionThreeSystemData.RODIA;

public class RegionFourSystemData {
    public static final System NABOO = getNaboo();
    public static final System SULLUST = getSullust();
    public static final System DAGOBAH = getDagobah();
    public static final System UTAPAU = getUtapau();

    public static List<System> fetch() {
        List<System> systems = new ArrayList<>();

        System targetedSystem;

        targetedSystem = NABOO;
        targetedSystem.setSystemMapping(getNabooSystemMapping());
        systems.add(targetedSystem);

        targetedSystem = SULLUST;
        targetedSystem.setSystemMapping(getSullustSystemMapping());
        systems.add(targetedSystem);

        targetedSystem = DAGOBAH;
        targetedSystem.setSystemMapping(getDagobahSystemMapping());
        systems.add(targetedSystem);

        targetedSystem = UTAPAU;
        targetedSystem.setSystemMapping(getUtapauSystemMapping());
        systems.add(targetedSystem);

        return systems;
    }

    private static System getNaboo() {
        System system = new System();

        system.setRegion(RegionData.REGION_FOUR);
        system.setName("Naboo");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getShipProduction().setShipLight(1);
        system.getLandProduction().setLandLight(1);
        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(1);

        return system;
    }

    private static SystemMapping getNabooSystemMapping() {
        SystemMapping systemMapping = new SystemMapping();

        systemMapping.setLeft(MALASTARE);
        systemMapping.setTopLeft(RODIA);
        systemMapping.setTop(GEONOSIS);
        systemMapping.setTopRight(UTAPAU);
        systemMapping.setBottomRight(DAGOBAH);
        systemMapping.setBottom(SULLUST);

        return systemMapping;
    }

    private static System getSullust() {
        System system = new System();

        system.setRegion(RegionData.REGION_FOUR);
        system.setName("Sullust");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getLandProduction().setLandLight(1);
        system.getLandProduction().setLandHeavy(1);
        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(2);

        return system;
    }

    private static SystemMapping getSullustSystemMapping() {
        SystemMapping systemMapping = new SystemMapping();

        systemMapping.setLeft(CATO_NEIMOIDIA);
        systemMapping.setTopLeft(MALASTARE);
        systemMapping.setTop(NABOO);
        systemMapping.setTopRight(DAGOBAH);
        systemMapping.setRight(MUSTAFAR);
        systemMapping.setBottomRight(BESPIN);
        systemMapping.setBottomLeft(CORELLIA);

        return systemMapping;
    }

    private static System getDagobah() {
        System system = new System();

        system.setRegion(RegionData.REGION_FOUR);
        system.setName("Dagobah");
        system.setRemote(true);

        return system;
    }

    private static SystemMapping getDagobahSystemMapping() {
        SystemMapping systemMapping = new SystemMapping();

        systemMapping.setTopLeft(NABOO);
        systemMapping.setTop(UTAPAU);
        systemMapping.setBottomRight(MUSTAFAR);
        systemMapping.setBottomLeft(SULLUST);

        return systemMapping;
    }

    private static System getUtapau() {
        System system = new System();

        system.setRegion(RegionData.REGION_FOUR);
        system.setName("Utapau");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getShipProduction().setShipMedium(1);
        system.getShipProduction().setShipHeavy(1);
        system.setFirstProductionSymbol(SHIP_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(3);

        return system;
    }

    private static SystemMapping getUtapauSystemMapping() {
        SystemMapping systemMapping = new SystemMapping();

        systemMapping.setBottomLeft(NABOO);
        systemMapping.setTopLeft(GEONOSIS);
        systemMapping.setBottom(DAGOBAH);

        return systemMapping;
    }
}
