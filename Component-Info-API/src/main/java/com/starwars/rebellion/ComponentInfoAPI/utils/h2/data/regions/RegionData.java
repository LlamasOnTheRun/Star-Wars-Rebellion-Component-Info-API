package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.regions;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Region;

import java.util.ArrayList;
import java.util.List;


public class RegionData {
    public static final Region REGION_ONE = getRegion();
    public static final Region REGION_TWO = getRegion();
    public static final Region REGION_THREE = getRegion();
    public static final Region REGION_FOUR = getRegion();
    public static final Region REGION_FIVE = getRegion();
    public static final Region REGION_SIX = getRegion();
    public static final Region REGION_SEVEN = getRegion();
    public static final Region REGION_EIGHT = getRegion();

    public static List<Region> fetch() {
        List<Region> regions = new ArrayList<>();
        regions.add(REGION_ONE);
        regions.add(REGION_TWO);
        regions.add(REGION_THREE);
        regions.add(REGION_FOUR);
        regions.add(REGION_FIVE);
        regions.add(REGION_SIX);
        regions.add(REGION_SEVEN);
        regions.add(REGION_EIGHT);
        return regions;
    }

    private static Region getRegion() {
        return new Region();
    }
}
