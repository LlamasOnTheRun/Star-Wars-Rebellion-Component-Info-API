package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.units;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Unit;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.ProductionType;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.UnitType;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.BLACK_HEALTH_COLOR;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.RED_HEALTH_COLOR;

public class RebelShipUnitData {
    public static final Unit X_WING = getXWing();
    public static final Unit Y_WING = getYWing();
    public static final Unit REBEL_TRANSPORT = getRebelTransport();
    public static final Unit CORELLIAN_CORVETTE = getCorellianCorvette();
    public static final Unit MON_CALAMARI_CRUISER = getMonCalamariCruiser();

    public static List<Unit> fetch() {
        List<Unit> systems = new ArrayList<>();
        systems.add(X_WING);
        systems.add(Y_WING);
        systems.add(REBEL_TRANSPORT);
        systems.add(CORELLIAN_CORVETTE);
        systems.add(MON_CALAMARI_CRUISER);
        return systems;
    }

    private static Unit getXWing() {
        Unit unit = new Unit();
        unit.setTitle("X-Wing");
        unit.setFaction(Faction.REBEL);
        unit.setUnitType(UnitType.SHIP);
        unit.setProductionType(ProductionType.LIGHT);
        unit.setBlackDie(1);
        unit.setHealth(1);
        unit.setHealthColor(BLACK_HEALTH_COLOR);
        unit.setTotalInGame(6);
        return unit;
    }

    private static Unit getYWing() {
        Unit unit = new Unit();
        unit.setTitle("Y-Wing");
        unit.setFaction(Faction.REBEL);
        unit.setUnitType(UnitType.SHIP);
        unit.setProductionType(ProductionType.LIGHT);
        unit.setRedDie(1);
        unit.setHealth(1);
        unit.setHealthColor(BLACK_HEALTH_COLOR);
        unit.setTotalInGame(10);
        return unit;
    }
    private static Unit getRebelTransport() {
        Unit unit = new Unit();
        unit.setTitle("Rebel Transport");
        unit.setFaction(Faction.REBEL);
        unit.setUnitType(UnitType.SHIP);
        unit.setProductionType(ProductionType.LIGHT);
        unit.setHealth(2);
        unit.setHealthColor(RED_HEALTH_COLOR);
        unit.setShipCarryingCapacity(4);
        unit.setTotalInGame(3);
        return unit;
    }

    private static Unit getCorellianCorvette() {
        Unit unit = new Unit();
        unit.setTitle("Corellian Corvette");
        unit.setFaction(Faction.REBEL);
        unit.setUnitType(UnitType.SHIP);
        unit.setProductionType(ProductionType.MEDIUM);
        unit.setBlackDie(1);
        unit.setRedDie(1);
        unit.setHealth(2);
        unit.setHealthColor(RED_HEALTH_COLOR);
        unit.setShipCarryingCapacity(2);
        unit.setTotalInGame(3);
        return unit;
    }

    private static Unit getMonCalamariCruiser() {
        Unit unit = new Unit();
        unit.setTitle("Mon Calamari Cruiser");
        unit.setFaction(Faction.REBEL);
        unit.setUnitType(UnitType.SHIP);
        unit.setProductionType(ProductionType.HEAVY);
        unit.setBlackDie(1);
        unit.setRedDie(2);
        unit.setHealth(4);
        unit.setHealthColor(RED_HEALTH_COLOR);
        unit.setShipCarryingCapacity(4);
        unit.setTotalInGame(3);
        return unit;
    }
}