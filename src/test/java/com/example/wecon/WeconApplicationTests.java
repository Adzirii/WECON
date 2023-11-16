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
        User user = new User();
        user.setAge(1);
        user.setEmail("nikita");
        user.setDateOfBirth(new Date(30, 06, 2002));
        user.setLastName("Liubov");
        user.setFirstName("Nikita");
        user.setPhoneNumber("+79120115640");
        userRepository.save(user);

    }

    @Test
    void addUserStatsTest() {
        UserStatistics userStatistics = new UserStatistics();
        userStatistics.setUser(userRepository.findByEmail("nikita"));
        userStatistics.setPromotionsCount(0);
        userStatistics.setCompletedPromCount(4);
        userStatistics.setStepCount(11111);
        userStatisticsRepository.save(userStatistics);

    }
}

