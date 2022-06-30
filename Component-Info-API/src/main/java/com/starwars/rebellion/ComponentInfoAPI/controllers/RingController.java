package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Ring;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.RingRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.RingRepository;
import com.starwars.rebellion.ComponentInfoAPI.specification.RingSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;

@Controller
@RequestMapping(value = BASE_CONTROLLER_PATH)
public class RingController {
    @Autowired
    private RingRepository ringRepository;

    @Autowired
    private RingSpecification ringSpecification;


    @PostMapping(path=GET_RING_ENDPOINT)
    @ResponseBody
    public List<Ring> getRings(@RequestBody RingRequest ringRequest){
        return ringRepository.findAll(ringSpecification.getRings(ringRequest));
    }

    @GetMapping(path=ALL_RINGS_ENDPOINT)
    @ResponseBody
    public List<Ring> getAllRings(){
        return ringRepository.findAll();
    }

}
