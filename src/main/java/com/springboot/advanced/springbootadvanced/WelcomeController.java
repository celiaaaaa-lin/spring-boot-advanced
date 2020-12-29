package com.springboot.advanced.springbootadvanced;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    // localhost:8080/welcome=> welcome message
    @RequestMapping("/welcome")
    public String welcome(){
        return "Welcome!";
    }

}
