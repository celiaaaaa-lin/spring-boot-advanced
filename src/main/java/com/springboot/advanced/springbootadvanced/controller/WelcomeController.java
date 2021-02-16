package com.springboot.advanced.springbootadvanced.controller;

import com.springboot.advanced.springbootadvanced.configuration.BasicConfiguration;
import com.springboot.advanced.springbootadvanced.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WelcomeController {

    // Dependency Injection
    @Autowired
    private WelcomeService service;

    @Autowired
    BasicConfiguration configuration;

    // localhost:8080/welcome=> welcome message
    @RequestMapping("/welcome")
    public String welcome(){
        return service.receiveWelcomeMessage();
    }

    @RequestMapping("/dynamic-configuration")
    public Map dynamicConfig(){
        Map map = new HashMap();
        map.put("message", configuration.getMessage());
        map.put("number", configuration.getNumber());
        map.put("value", configuration.isValue());
        return map;
    }
}