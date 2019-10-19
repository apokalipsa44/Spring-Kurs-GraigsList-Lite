package com.michu.craigslistlite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginControler {

    @GetMapping
    public String processLoginPage(){
        return "WEB-INF/views/login-page.jsp";
    }

    
}
