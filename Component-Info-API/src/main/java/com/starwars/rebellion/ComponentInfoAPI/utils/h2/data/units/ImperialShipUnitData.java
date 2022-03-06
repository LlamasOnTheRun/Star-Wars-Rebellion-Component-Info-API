package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.units;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Unit;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.ProductionType;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.UnitType;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.BLACK_HEALTH_COLOR;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.RED_HEALTH_COLOR;

public class ImperialShipUnitData {
    public static final Unit TIE_FIGHTER = getTieFighter();
    public static final Unit ASSAULT_CARRIER = getAssaultCarrier();
    public static final Unit STAR_DESTROYER = getStarDestroyer();
    public static final Unit SUPER_STAR_DESTROYER = getSuperStarDestroyer();
    public static final Unit DEATH_STAR = getDeathStar();
    public static final Unit DEATH_STAR_UNDER_CONSTRUCTION = getDeathStarUnderConstruction();

    public static List<Unit> fetch() {
        List<Unit> systems = new ArrayList<>();
        systems.add(TIE_FIGHTER);
        systems.add(ASSAULT_CARRIER);
        systems.add(STAR_DESTROYER);
        systems.add(SUPER_STAR_DESTROYER);
        systems.add(DEATH_STAR);
        systems.add(DEATH_STAR_UNDER_CONSTRUCTION);
        return systems;
    }

    private static Unit getTieFighter() {
        Unit unit = new Unit();
        unit.setTitle("Tie Fighter");
        unit.setFaction(Faction.IMPERIAL);
        unit.setUnitType(UnitType.SHIP);
        unit.setProductionType(ProductionType.LIGHT);
        unit.setBlackDie(1);
        unit.setHealth(1);
        unit.setHealthColor(BLACK_HEALTH_COLOR);
        unit.setNeedsTransport(true);
        unit.setTotalInGame(12);
        return unit;
    }

    private static Unit getAssaultCarrier() {
        Unit unit = new Unit();
        unit.setTitle("Assault Carrier");
        unit.setFaction(Faction.IMPERIAL);
        unit.setUnitType(UnitType.SHIP);
        unit.setProductionType(ProductionType.MEDIUM);
        unit.setBlackDie(1);
        unit.setRedDie(1);
        unit.setHealth(2);
        unit.setHealthColor(RED_HEALTH_COLOR);
        unit.setShipCarryingCapacity(4);
        unit.setTotalInGame(5);
        return unit;
    }

    private static Unit getStarDestroyer() {
        Unit unit = new Unit();
        unit.setTitle("Star Destroyer");
        unit.setFaction(Faction.IMPERIAL);
        unit.setUnitType(UnitType.SHIP);
        unit.setProductionType(ProductionType.HEAVY);
        unit.setBlackDie(1);
        unit.setRedDie(2);
        unit.setHealth(4);
        unit.setHealthColor(RED_HEALTH_COLOR);
        unit.setShipCarryingCapacity(6);
        unit.setTotalInGame(5);
        return unit;
    }

    private static Unit getSuperStarDestroyer() {
        Unit unit = new Unit();
        unit.setTitle("Super Star Destroyer");
        unit.setFaction(Faction.IMPERIAL);
        unit.setUnitType(UnitType.SHIP);
        unit.setProductionType(ProductionType.PROJECT);
        unit.setBlackDie(2);
        unit.setRedDie(3);
        unit.setHealth(6);
        unit.setHealthColor(RED_HEALTH_COLOR);
        unit.setShipCarryingCapacity(8);
        unit.setTotalInGame(2);
        return unit;
    }

    private static Unit getDeathStar() {
        Unit unit = new Unit();
        unit.setTitle("Death Star");
        unit.setFaction(Faction.IMPERIAL);
        unit.setUnitType(UnitType.SHIP);
        unit.setProductionType(ProductionType.PROJECT);
        unit.setRedDie(4);
        unit.setInvincible(true);
        unit.setShipCarryingCapacity(8);
        unit.setTotalInGame(2);
        return unit;
    }

    private static Unit getDeathStarUnderConstruction() {
        Unit unit = new Unit();
        unit.setTitle("""
                        Death Star
                        Under Construction
                        """);
        unit.setFaction(Faction.IMPERIAL);
        unit.setUnitType(UnitType.SHIP);
        unit.setProductionType(ProductionType.PROJECT);
        unit.setHealth(4);
        unit.setHealthColor(BLACK_HEALTH_COLOR);
        unit.setTotalInGame(1);
        unit.setStructure(true);
        return unit;
    }
}