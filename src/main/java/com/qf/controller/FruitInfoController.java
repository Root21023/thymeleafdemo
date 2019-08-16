package com.qf.controller;

import com.qf.service.FruitInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitInfoController {
    @Autowired
    FruitInfoService fruitInfoService;

    @RequestMapping("listAllFruit")
    public Object listAllFruit(){
        return fruitInfoService.listAllFruit();
    }

}
