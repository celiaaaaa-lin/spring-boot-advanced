package com.springboot.advanced.springbootadvanced;

import com.springboot.advanced.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    // Dependency Injection
    @Autowired
    private WelcomeService service;

    // localhost:8080/welcome=> welcome message
    @RequestMapping("/welcome")
    public String welcome(){
        return service.receiveWelcomeMessage();
    }
}