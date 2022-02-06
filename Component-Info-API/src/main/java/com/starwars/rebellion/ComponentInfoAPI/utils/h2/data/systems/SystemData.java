package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.systems;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ActualSystem;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.LandProduction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.ShipProduction;
import com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.regions.RegionData;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.NEUTRAL_LOYALTY;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.SHIP_PRODUCTION_SYMBOL_FIRST;

public class SystemData {

    private static final ActualSystem MON_CALAMARI = getMonCalamari();

    public static List<ActualSystem> fetch(){
        List<ActualSystem> actualSystems = new ArrayList<>();
        actualSystems.add(MON_CALAMARI);
        return actualSystems;
    }

    private static ActualSystem getMonCalamari() {
        ActualSystem system = new ActualSystem();

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
}
