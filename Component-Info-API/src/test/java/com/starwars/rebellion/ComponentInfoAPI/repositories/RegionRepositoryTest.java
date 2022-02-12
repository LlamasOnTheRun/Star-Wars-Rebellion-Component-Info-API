package com.starwars.rebellion.ComponentInfoAPI.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.TOTAL_REGIONS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class RegionRepositoryTest {

    @Autowired
    RegionRepository regionRepository;

    @Test
    void givenAllRegionDataIsAdded_thenEightRegionsAreReturned() {
        assertEquals(TOTAL_REGIONS, regionRepository.findAll().size());
    }
}
