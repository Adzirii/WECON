package com.example.wecon;

import com.example.wecon.entity.User;
import com.example.wecon.entity.UserStatistics;
import com.example.wecon.repository.UserRepository;
import com.example.wecon.repository.UserStatisticsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class WeconApplicationTests {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserStatisticsRepository userStatisticsRepository;
    @Test
    void addUserTest() {
    }

    @Test
    void addUserStatsTest() {
    }
}

