package com.starwars.rebellion.ComponentInfoAPI.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/test")
public class TestContoller {
    @GetMapping
    @ResponseBody                           //does not make json but prints to screen
    public String getTestData(){
        return "word";
    }
}
