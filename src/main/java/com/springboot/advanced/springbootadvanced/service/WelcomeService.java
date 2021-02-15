package com.springboot.advanced.springbootadvanced.service;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

// Spring to manage this bean and create an instance of it
// @Component or @Service
@Component
public class WelcomeService{

    @Value("${welcome.message}")
    private String welcomeMessage;

    public String receiveWelcomeMessage() {
        return welcomeMessage;
    }
}