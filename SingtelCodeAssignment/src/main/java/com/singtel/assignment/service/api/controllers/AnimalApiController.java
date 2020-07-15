package com.singtel.assignment.service.api.controllers;


import com.singtel.assignment.service.api.models.AnimalModel;
import com.singtel.assignment.service.api.support.AnimalUtil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AnimalApiController {
	
    @RequestMapping(method = RequestMethod.GET, value = "api/animal/flyCount")
    @ResponseBody
    public int getFlyingAnimalCount(@RequestBody AnimalModel[] animals) {
        AnimalUtil animUtil = new AnimalUtil(animals);
        int flyingAnimal = animUtil.getFlyingAnimal();
        return flyingAnimal;
    }
    
}
