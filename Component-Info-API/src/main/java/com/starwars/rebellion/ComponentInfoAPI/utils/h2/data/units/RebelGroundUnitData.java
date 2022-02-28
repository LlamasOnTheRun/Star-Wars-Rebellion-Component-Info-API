package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.units;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Unit;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.Faction;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.ProductionType;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.UnitType;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.BLACK_HEALTH_COLOR;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.RED_HEALTH_COLOR;

public class RebelGroundUnitData {
    public static final Unit REBEL_TROOPER = getRebelTrooper();
    public static final Unit AIR_SPEEDER = getAirSpeeder();
    public static final Unit SHIELD_GENERATOR = getShieldGenerator();
    public static final Unit ION_CANNON = getIonCannon();

    public static List<Unit> fetch() {
        List<Unit> systems = new ArrayList<>();
        systems.add(REBEL_TROOPER);
        systems.add(AIR_SPEEDER);
        systems.add(SHIELD_GENERATOR);
        systems.add(ION_CANNON);
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

    private static Unit getAirSpeeder() {
        Unit unit = new Unit();
        unit.setTitle("Airspeeder");
        unit.setFaction(Faction.REBEL);
        unit.setUnitType(UnitType.GROUND);
        unit.setProductionType(ProductionType.MEDIUM);
        unit.setBlackDie(1);
        unit.setRedDie(1);
        unit.setHealth(2);
        unit.setHealthColor(RED_HEALTH_COLOR);
        unit.setNeedsTransport(true);
        unit.setTotalInGame(4);
        return unit;
    }

    private static Unit getShieldGenerator() {
        Unit unit = new Unit();
        unit.setTitle("Shield Generator");
        unit.setFaction(Faction.REBEL);
        unit.setUnitType(UnitType.GROUND);
        unit.setProductionType(ProductionType.HEAVY);
        unit.setHealth(3);
        unit.setHealthColor(RED_HEALTH_COLOR);
        unit.setStructure(true);
        unit.setSpecialText("""
                At the start of
                each ground
                battle step,
                draw 1 ground
                tactic card.
                """);
        unit.setTotalInGame(3);
        return unit;
    }

    private static Unit getIonCannon() {
        Unit unit = new Unit();
        unit.setTitle("Ion Cannon");
        unit.setFaction(Faction.REBEL);
        unit.setUnitType(UnitType.GROUND);
        unit.setProductionType(ProductionType.HEAVY);
        unit.setHealth(3);
        unit.setHealthColor(RED_HEALTH_COLOR);
        unit.setStructure(true);
        unit.setSpecialText("""
                During each
                space battle
                step, your
                opponent rolls
                2 fewer red dice.
                """);
        unit.setTotalInGame(3);
        return unit;
    }
}
