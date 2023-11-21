package com.example.wecon.controller;

import com.example.wecon.entity.User;
import com.example.wecon.entity.UserStatistics;
import com.example.wecon.service.UserService;
import com.example.wecon.service.UserStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/user-statistics")
public class UserStatisticsController {

    private final UserStatisticsService userStatisticsService;
    private final UserService userService;

    @Autowired
    public UserStatisticsController(UserStatisticsService userStatisticsService, UserService userService) {
        this.userStatisticsService = userStatisticsService;
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Optional<UserStatistics>> getUserStatistics(@PathVariable Long userId) {
        Optional<User> user = userService.getUserById(userId);
        Optional<UserStatistics> userStatistics = userStatisticsService.getUserStatistics(user);

        if (userStatistics.isPresent()) {
            return ResponseEntity.ok(userStatistics);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

