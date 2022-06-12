package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.SystemRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.SystemRepository;
import com.starwars.rebellion.ComponentInfoAPI.specification.SystemSpecification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;

@Controller
@RequestMapping(value=BASE_CONTROLLER_PATH)
@Slf4j
public class SystemController {
    @Autowired
    private SystemRepository systemRepository;

    @Autowired
    private SystemSpecification systemSpecification;

    @PostMapping(path= SYSTEM_ENDPOINT)
    @ResponseBody
    public List<System> getSystem(@RequestBody SystemRequest systemRequest) {
        log.info("Request Object: {}", systemRequest.toString());
        return systemRepository.findAll(systemSpecification.getSystem(systemRequest));
    }

    @GetMapping(path = GET_ALL_SYSTEM_ENDPOINT)
    @ResponseBody
    public List<System> getAllSystems() {
        return systemRepository.findAll();
    }
}