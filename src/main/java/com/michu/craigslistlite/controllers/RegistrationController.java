package com.michu.craigslistlite.controllers;

import com.michu.craigslistlite.model.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @GetMapping
    public String prepareRegistrationController(){

      
        return "";
    }

    @PostMapping
    public String processRegistrationMapping(){
        return "";
    }
}
