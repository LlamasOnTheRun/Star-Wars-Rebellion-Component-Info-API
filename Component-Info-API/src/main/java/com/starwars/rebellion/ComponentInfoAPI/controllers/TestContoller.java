package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/test")
public class TestContoller {
    @Autowired
    BookRepository bookRepository;

    @GetMapping
    @ResponseBody
    public String getTestData(){
        return bookRepository.findByName("caprisun").getName();
    }
}
