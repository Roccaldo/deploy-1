package com.example.depoly1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${devName}")
    private String devName;

    @GetMapping("dev")
    public String sayHello() {
        return "Hi " + devName + "!";
    }
}
