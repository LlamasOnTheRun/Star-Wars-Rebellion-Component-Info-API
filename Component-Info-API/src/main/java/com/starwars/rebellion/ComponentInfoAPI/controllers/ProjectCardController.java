package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ProjectCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.ProjectCardRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.ProjectCardRepository;
import com.starwars.rebellion.ComponentInfoAPI.specification.ProjectCardSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;

@Controller
@RequestMapping(value=BASE_CONTROLLER_PATH)
public class ProjectCardController {
    @Autowired
    private ProjectCardSpecification projectCardSpecification;

    @Autowired
    private ProjectCardRepository projectCardRepository;

    @GetMapping(path = GET_ALL_PROJECT_CARD_ENDPOINT)
    @ResponseBody
    public List<ProjectCard> getAllProjectCards() {
        return projectCardRepository.findAll();
    }

    @PostMapping(path = PROJECT_CARD_ENDPOINT)
    @ResponseBody
    public List<ProjectCard> getProjectCards(@RequestBody ProjectCardRequest projectCardRequest) {
        return projectCardRepository.findAll(projectCardSpecification.getProjectCards(projectCardRequest));
    }
}
