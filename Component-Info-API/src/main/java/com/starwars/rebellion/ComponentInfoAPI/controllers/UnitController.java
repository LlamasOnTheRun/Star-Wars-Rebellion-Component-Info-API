package com.starwars.rebellion.ComponentInfoAPI.controllers;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Unit;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.UnitRequest;
import com.starwars.rebellion.ComponentInfoAPI.repositories.UnitRepository;
import com.starwars.rebellion.ComponentInfoAPI.specification.UnitSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.starwars.rebellion.ComponentInfoAPI.utils.APIConstants.*;

@Controller
@RequestMapping(value=BASE_CONTROLLER_PATH)
public class UnitController {
    @Autowired
    private UnitRepository unitRepository;
    @Autowired
    private UnitSpecification unitSpecification;

    @GetMapping(path=GET_ALL_UNIT_ENDPOINT)
    @ResponseBody
    public List<Unit> getAllUnits(){
        return unitRepository.findAll();
    }

    @PostMapping(path=GET_UNIT_ENDPOINT)
    @ResponseBody
    public List<Unit> getUnits(@RequestBody UnitRequest unitRequest){
        return unitRepository.findAll(unitSpecification.getUnits(unitRequest));
    }

}
