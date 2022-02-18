package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.units;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Unit;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.ProductionType;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.UnitType;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.BLACK_HEALTH_COLOR;

public class RebelGroundUnitData {
    public static final Unit REBEL_TROOPER = getRebelTrooper();

    public static List<Unit> fetch() {
        List<Unit> systems = new ArrayList<>();
        systems.add(REBEL_TROOPER);
        return systems;
    }

    private static Unit getRebelTrooper() {
        Unit unit = new Unit();
        unit.setTitle("Rebel Trooper");
        unit.setFaction(Faction.REBEL);
        unit.setUnitType(UnitType.GROUND);
        unit.setProductionType(ProductionType.LIGHT);
        unit.setBlackDie(1);
        unit.setHealth(1);
        unit.setHealthColor(BLACK_HEALTH_COLOR);
        unit.setNeedsTransport(true);
        unit.setTotalInGame(15);
        return unit;
    }
}
