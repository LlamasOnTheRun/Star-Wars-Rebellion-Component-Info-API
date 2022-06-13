package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.SystemMapping;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.regions.RegionData;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.LAND_PRODUCTION_SYMBOL_FIRST;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.NEUTRAL_LOYALTY;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionEightSystemData.*;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionFourSystemData.NABOO;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionFourSystemData.SULLUST;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionOneSystemData.*;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionSixSystemData.ALDERAAN;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionSixSystemData.CATO_NEIMOIDIA;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionThreeSystemData.RODIA;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionTwoSystemData.BOTHAWUI;
import static com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems.RegionTwoSystemData.TOYDARIA;

public class RegionSevenSystemData {
    public static final System MALASTARE = getMalastare();
    public static final System KASHYYYK = getKashyyyk();
    public static final System MANDALORE = getMandalore();
    public static final System DATHOMIR = getDathomir();

    public static List<System> fetch() {
        List<System> systems = new ArrayList<>();
        systems.add(MALASTARE);
        systems.add(KASHYYYK);
        systems.add(MANDALORE);
        systems.add(DATHOMIR);
        return systems;
    }

    private static System getMalastare() {
        System system = new System();

        system.setRegion(RegionData.REGION_SEVEN);
        system.setName("Malastare");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getLandProduction().setLandLight(1);
        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(1);

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setLeft(KASHYYYK);
        systemMapping.setTopLeft(TOYDARIA);
        systemMapping.setTop(BOTHAWUI);
        systemMapping.setTopRight(RODIA);
        systemMapping.setRight(NABOO);
        systemMapping.setBottomRight(SULLUST);
        systemMapping.setBottom(CATO_NEIMOIDIA);
        system.setSystemMapping(systemMapping);

        return system;
    }

    private static System getKashyyyk() {
        System system = new System();

        system.setRegion(RegionData.REGION_SEVEN);
        system.setName("Kashyyyk");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getLandProduction().setLandLight(2);
        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(1);

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setLeft(MANDALORE);
        systemMapping.setTopLeft(SALEUCAMI);
        systemMapping.setTop(TOYDARIA);
        systemMapping.setRight(MALASTARE);
        systemMapping.setBottomRight(CATO_NEIMOIDIA);
        systemMapping.setBottom(ALDERAAN);
        system.setSystemMapping(systemMapping);

        return system;
    }

    private static System getMandalore() {
        System system = new System();

        system.setRegion(RegionData.REGION_SEVEN);
        system.setName("Mandalore");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);
        system.getLandProduction().setLandLight(1);
        system.getShipProduction().setShipLight(1);
        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(1);

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setLeft(DATHOMIR);
        systemMapping.setTopLeft(YAVIN);
        systemMapping.setTop(FELUCIA);
        systemMapping.setTopRight(SALEUCAMI);
        systemMapping.setRight(KASHYYYK);
        systemMapping.setBottomRight(ALDERAAN);
        systemMapping.setBottom(ORD_MANTELL);
        systemMapping.setBottomLeft(MYGEETO);
        system.setSystemMapping(systemMapping);

        return system;
    }

    private static System getDathomir() {
        System system = new System();

        system.setRegion(RegionData.REGION_SEVEN);
        system.setName("Dathomir");
        system.setRemote(true);

        SystemMapping systemMapping = new SystemMapping();
        systemMapping.setTop(YAVIN);
        systemMapping.setRight(MANDALORE);
        systemMapping.setBottom(MYGEETO);
        systemMapping.setBottomLeft(DANTOOINE);
        system.setSystemMapping(systemMapping);

        return system;
    }
}
