package com.springboot.advanced.springbootadvanced.service;

import org.springframework.stereotype.Component;

// Spring to manage this bean and create an instance of it
// @Component or @Service
@Component
public class WelcomeService{
    public String receiveWelcomeMessage() {
        return "Welcome";
    }
}