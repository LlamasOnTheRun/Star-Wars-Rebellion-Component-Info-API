package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Region;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.RegionRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.RegionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.REGION_ID_EXAMPLE;
import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_REGIONS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class RegionSpecificationTest {

    @Autowired
    private RegionRepository regionRepository;

    @Autowired
    private RegionSpecification regionSpecification;

    @Test
    void givenIDIsNull_thenPredicateIsNotAdded() {
        RegionRequest regionRequest = new RegionRequest();
        regionRequest.setId(null);

        List<Region> regionList = regionRepository
                .findAll(regionSpecification.getRegion(regionRequest));

        assertEquals(TOTAL_REGIONS, regionList.size());
    }

    @Test
    void givenIDIsProvided_thenPredicateIsAdded() {
        RegionRequest regionRequest = new RegionRequest();
        regionRequest.setId(REGION_ID_EXAMPLE);

        List<Region> regionList = regionRepository
                .findAll(regionSpecification.getRegion(regionRequest));

        assertEquals(1, regionList.size());
    }

    @Test
    void givenSystemIsProvided_thenPredicateIsAdded() {
        RegionRequest regionRequest = new RegionRequest();
        regionRequest.setContainsSystem("Felucia");

        List<Region> regionList = regionRepository
                .findAll(regionSpecification.getRegion(regionRequest));

        assertEquals(1, regionList.size());
    }

    @Test
    void givenSystemIsProvidedWithSimilarNaming_thenPredicateIsAdded() {
        RegionRequest regionRequest = new RegionRequest();
        regionRequest.setContainsSystem("fElUcIa");

        List<Region> regionList = regionRepository
                .findAll(regionSpecification.getRegion(regionRequest));

        assertEquals(1, regionList.size());
    }

    @Test
    void givenSystemIsNull_thenPredicateIsNotAdded() {
        RegionRequest regionRequest = new RegionRequest();
        regionRequest.setContainsSystem(null);

        List<Region> regionList = regionRepository
                .findAll(regionSpecification.getRegion(regionRequest));

        assertEquals(TOTAL_REGIONS, regionList.size());
    }

    @Test
    void givenSystemIsBlank_thenPredicateIsNotAdded() {
        RegionRequest regionRequest = new RegionRequest();
        regionRequest.setContainsSystem("");

        List<Region> regionList = regionRepository
                .findAll(regionSpecification.getRegion(regionRequest));

        assertEquals(TOTAL_REGIONS, regionList.size());
    }
}
