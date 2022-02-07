package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.LandProduction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.ShipProduction;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.regions.RegionData;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;

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

        ShipProduction shipProduction = new ShipProduction();
        system.setShipProduction(shipProduction);
        LandProduction landProduction = new LandProduction();
        landProduction.setLandLight(1);
        system.setLandProduction(landProduction);

        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(1);

        return system;
    }

    private static System getTatooine() {
        System system = new System();

        system.setRegion(RegionData.REGION_THREE);
        system.setName("Tatooine");
        system.setRemote(true);

        ShipProduction shipProduction = new ShipProduction();
        system.setShipProduction(shipProduction);
        LandProduction landProduction = new LandProduction();
        system.setLandProduction(landProduction);

        return system;
    }

    private static System getGeonosis() {
        System system = new System();

        system.setRegion(RegionData.REGION_THREE);
        system.setName("Geonosis");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);

        ShipProduction shipProduction = new ShipProduction();
        shipProduction.setShipLight(1);
        system.setShipProduction(shipProduction);
        LandProduction landProduction = new LandProduction();
        landProduction.setLandHeavy(1);
        system.setLandProduction(landProduction);

        system.setFirstProductionSymbol(SHIP_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(2);

        return system;
    }

    private static System getRyloth() {
        System system = new System();

        system.setRegion(RegionData.REGION_THREE);
        system.setName("Ryloth");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);

        ShipProduction shipProduction = new ShipProduction();
        system.setShipProduction(shipProduction);
        LandProduction landProduction = new LandProduction();
        landProduction.setLandLight(1);
        system.setLandProduction(landProduction);

        system.setFirstProductionSymbol(LAND_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(1);

        return system;
    }
}
