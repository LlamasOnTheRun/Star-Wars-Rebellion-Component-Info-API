package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Region;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.RegionRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.RegionRepository;
import com.starwars.rebellion.ComponentInfoAPI.specification.RegionSpecification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;

@Controller
@RequestMapping(value=BASE_CONTROLLER_PATH)
@Slf4j
public class RegionController {
    @Autowired
    private RegionRepository regionRepository;

    @Autowired
    private RegionSpecification regionSpecification;

    @PostMapping(path= REGION_ENDPOINT)
    @ResponseBody
    public List<Region> getRegion(@RequestBody RegionRequest regionRequest) {
        log.info("Request Object: {}", regionRequest.toString());
        return regionRepository.findAll(regionSpecification.getRegion(regionRequest));
    }

    @GetMapping(path = GET_ALL_REGION_ENDPOINT)
    @ResponseBody
    public List<Region> getAllRegions() {
        return regionRepository.findAll();
    }
}