package com.tomasz.springsecuritypodstawa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/hello")
    public String sayWelcome(){
        return "Welcome in Spring Security course";
    }
}
