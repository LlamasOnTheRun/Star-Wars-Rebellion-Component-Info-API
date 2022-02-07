package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.LandProduction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.ShipProduction;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.regions.RegionData;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;

public class RegionFourSystemData {
    public static final System NABOO = getNaboo();
    public static final System SULLUST = getSullust();
    public static final System DAGOBAH = getDagobah();
    public static final System UTAPAU = getUtapau();

    public static List<System> fetch() {
        List<System> systems = new ArrayList<>();
        systems.add(NABOO);
        systems.add(SULLUST);
        systems.add(DAGOBAH);
        systems.add(UTAPAU);
        return systems;
    }

    private static System getNaboo() {
        System system = new System();

        system.setRegion(RegionData.REGION_FOUR);
        system.setName("Naboo");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);

        ShipProduction shipProduction = new ShipProduction();
        shipProduction.setShipLight(1);
        system.setShipProduction(shipProduction);
        LandProduction landProduction = new LandProduction();
        landProduction.setLandLight(1);
        system.setLandProduction(landProduction);

        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(1);

        return system;
    }

    private static System getSullust() {
        System system = new System();

        system.setRegion(RegionData.REGION_FOUR);
        system.setName("Sullust");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);

        ShipProduction shipProduction = new ShipProduction();
        system.setShipProduction(shipProduction);
        LandProduction landProduction = new LandProduction();
        landProduction.setLandLight(1);
        landProduction.setLandHeavy(1);
        system.setLandProduction(landProduction);

        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(2);

        return system;
    }

    private static System getDagobah() {
        System system = new System();

        system.setRegion(RegionData.REGION_FOUR);
        system.setName("Dagobah");
        system.setRemote(true);

        ShipProduction shipProduction = new ShipProduction();
        system.setShipProduction(shipProduction);
        LandProduction landProduction = new LandProduction();
        system.setLandProduction(landProduction);

        return system;
    }

    private static System getUtapau() {
        System system = new System();

        system.setRegion(RegionData.REGION_FOUR);
        system.setName("Utapau");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);

        ShipProduction shipProduction = new ShipProduction();
        shipProduction.setShipMedium(1);
        shipProduction.setShipHeavy(1);
        system.setShipProduction(shipProduction);
        LandProduction landProduction = new LandProduction();
        system.setLandProduction(landProduction);

        system.setFirstProductionSymbol(SHIP_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(3);

        return system;
    }
}
