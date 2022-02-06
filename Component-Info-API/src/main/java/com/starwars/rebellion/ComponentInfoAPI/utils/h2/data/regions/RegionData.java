package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.regions;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Region;

import java.util.ArrayList;
import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_REGIONS;

public class RegionData {
    public static List<Region> fetch() {
        List<Region> regions = new ArrayList<>();
        for(int i = 0; i < TOTAL_REGIONS; i++) {
            regions.add(new Region());
        }
        return regions;
    }
}
