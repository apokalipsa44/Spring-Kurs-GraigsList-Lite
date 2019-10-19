package com.michu.craigslistlite.controllers;

import com.michu.craigslistlite.model.domain.User;
import com.michu.craigslistlite.repositories.UserRepository;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Slf4j
@Controller
@RequestMapping("/register")
public class RegistrationController {



    UserRepository userRepository;

    public RegistrationController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public String prepareRegistrationPage(){


        return "/WEB-INF/views/registration-form.jsp";
    }

    @PostMapping
    public String processRegistrationPage(String username,
                                             String password,
                                             String firstName,
                                             String lastName){
        User user= new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);

        userRepository.save(user);
        log.info("User saved");


        return "redirect:/index.html";
    }
}
//    Database name: GqYLZAMOxZ
//    Password: aaYI6203tt
