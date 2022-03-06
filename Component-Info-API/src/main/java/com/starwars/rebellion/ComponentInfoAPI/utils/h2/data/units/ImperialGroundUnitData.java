package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.units;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Unit;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.ProductionType;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.UnitType;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.BLACK_HEALTH_COLOR;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.RED_HEALTH_COLOR;

public class ImperialGroundUnitData {
    public static final Unit STORMTROOPER = getStormTrooper();
    public static final Unit ATST = getATST();
    public static final Unit ATAT = getATAT();

    public static List<Unit> fetch() {
        List<Unit> systems = new ArrayList<>();
        systems.add(STORMTROOPER);
        systems.add(ATST);
        systems.add(ATAT);
        return systems;
    }

    private static Unit getStormTrooper() {
        Unit unit = new Unit();
        unit.setTitle("StormTrooper");
        unit.setFaction(Faction.IMPERIAL);
        unit.setUnitType(UnitType.GROUND);
        unit.setProductionType(ProductionType.LIGHT);
        unit.setBlackDie(1);
        unit.setHealth(1);
        unit.setHealthColor(BLACK_HEALTH_COLOR);
        unit.setNeedsTransport(true);
        unit.setTotalInGame(18);
        return unit;
    }

    private static Unit getATST() {
        Unit unit = new Unit();
        unit.setTitle("AT-ST");
        unit.setFaction(Faction.IMPERIAL);
        unit.setUnitType(UnitType.GROUND);
        unit.setProductionType(ProductionType.MEDIUM);
        unit.setBlackDie(1);
        unit.setRedDie(1);
        unit.setHealth(2);
        unit.setHealthColor(RED_HEALTH_COLOR);
        unit.setNeedsTransport(true);
        unit.setTotalInGame(5);
        return unit;
    }

    private static Unit getATAT() {
        Unit unit = new Unit();
        unit.setTitle("AT-AT");
        unit.setFaction(Faction.IMPERIAL);
        unit.setUnitType(UnitType.GROUND);
        unit.setProductionType(ProductionType.HEAVY);
        unit.setBlackDie(1);
        unit.setRedDie(2);
        unit.setHealth(3);
        unit.setHealthColor(RED_HEALTH_COLOR);
        unit.setNeedsTransport(true);
        unit.setTotalInGame(3);
        return unit;
    }
}
