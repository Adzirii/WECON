package com.example.wecon.controller;

import com.example.wecon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(name = "/a")
    public String getPage(){
        return "Ok";
    }


}
