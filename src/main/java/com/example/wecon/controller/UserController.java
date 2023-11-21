package com.example.wecon.controller;

import com.example.wecon.dto.UserDTO;
import com.example.wecon.entity.User;
import com.example.wecon.entity.UserStatistics;
import com.example.wecon.service.UserService;
import com.example.wecon.service.UserStatisticsService;
import com.example.wecon.util.CreateUserWithOkHttp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;
    private final UserStatisticsService userStatisticsService;

    @Autowired
    public UserController(UserService userService, UserStatisticsService userStatisticsService) {
        this.userService = userService;
        this.userStatisticsService = userStatisticsService;
    }

    @PostMapping
    public ResponseEntity<String> addUser(@RequestBody UserDTO userDTO) {


        User newUser = new User();
        newUser.setUsername(userDTO.getUsername());
        newUser.setEmail(userDTO.getEmail());
        newUser.setPhoneNumber(userDTO.getPhoneNumber());
        newUser.setDateOfBirth(userDTO.getDateOfBirth());
        newUser.setRegistrationDate(userDTO.getRegistrationDate());
        newUser.setLastLogin(userDTO.getLastLogin());
        newUser.setName(userDTO.getName());
        newUser.setSurname(userDTO.getSurname());
        newUser.setAge(userDTO.getAge());

        User savedUser = userService.saveUser(newUser);

        UserStatistics userStatistics = new UserStatistics();
        userStatistics.setUser(savedUser);
        userStatistics.setStepCount(0);
        userStatistics.setPromotionsCount(0);
        userStatistics.setCompletedPromCount(0);
        userStatistics.setTotalLogins(0);
        userStatistics.setLastLogin(null);
        userStatisticsService.saveUserStatistics(userStatistics);

        CreateUserWithOkHttp.sendPostRequest();


        return new ResponseEntity<>("User added successfully", HttpStatus.CREATED);
    }


}