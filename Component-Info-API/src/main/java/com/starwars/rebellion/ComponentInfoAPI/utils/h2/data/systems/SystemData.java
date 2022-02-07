package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.LandProduction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.ShipProduction;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.regions.RegionData;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.NEUTRAL_LOYALTY;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.SHIP_PRODUCTION_SYMBOL_FIRST;

public class SystemData {

    private static final System MON_CALAMARI = getMonCalamari();
    private static final System FELUCIA = getFelucia();
    private static final System YAVIN = getYavin();

    public static List<System> fetch() {
        List<System> systems = new ArrayList<>();
        systems.add(MON_CALAMARI);
        systems.add(FELUCIA);
        systems.add(YAVIN);
        return systems;
    }

    private static System getMonCalamari() {
        System system = new System();

        system.setRegion(RegionData.REGION_ONE);
        system.setName("Mon Calamari");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);

        ShipProduction shipProduction = new ShipProduction();
        shipProduction.setShipLight(1);
        shipProduction.setShipHeavy(1);
        system.setShipProduction(shipProduction);
        LandProduction landProduction = new LandProduction();
        system.setLandProduction(landProduction);

        system.setFirstProductionSymbol(SHIP_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(3);

        return system;
    }

    private static System getFelucia() {
        System system = new System();

        system.setRegion(RegionData.REGION_ONE);
        system.setName("Felucia");
        system.setRemote(false);
        system.setLoyalty(NEUTRAL_LOYALTY);

        ShipProduction shipProduction = new ShipProduction();
        system.setShipProduction(shipProduction);
        LandProduction landProduction = new LandProduction();
        landProduction.setLandLight(1);
        system.setLandProduction(landProduction);

        system.setFirstProductionSymbol(SHIP_PRODUCTION_SYMBOL_FIRST);
        system.setQueueTime(3);

        return system;
    }

    private static System getYavin() {
        System system = new System();

        system.setRegion(RegionData.REGION_ONE);
        system.setName("Yavin");
        system.setRemote(true);

        ShipProduction shipProduction = new ShipProduction();
        system.setShipProduction(shipProduction);
        LandProduction landProduction = new LandProduction();
        system.setLandProduction(landProduction);

        return system;
    }

    private static System getSaleucami() {
        System system = new System();

        system.setRegion(RegionData.REGION_ONE);
        system.setName("Yavin");
        system.setRemote(true);

        ShipProduction shipProduction = new ShipProduction();
        system.setShipProduction(shipProduction);
        LandProduction landProduction = new LandProduction();
        system.setLandProduction(landProduction);

        return system;
    }
}
