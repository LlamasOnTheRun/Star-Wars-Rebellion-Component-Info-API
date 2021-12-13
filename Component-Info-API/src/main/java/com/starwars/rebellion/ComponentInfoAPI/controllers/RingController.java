package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.repositorys.RingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;

@Controller
@RequestMapping(value = BASE_CONTROLLER_PATH)
public class RingController {
    @Autowired
    private RingRepository ringRepository;

    @GetMapping(path=GET_RING_ENDPOINT)
    @ResponseBody
    public String getRing(){
        return ringRepository.findByTitle("C3PO").getTitle();
    }

}