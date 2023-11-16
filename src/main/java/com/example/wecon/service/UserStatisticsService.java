package com.example.wecon.service;

import com.example.wecon.entity.User;
import com.example.wecon.entity.UserStatistics;
import com.example.wecon.repository.UserStatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserStatisticsService {
    @Autowired
    private UserStatisticsRepository userStatisticsRepository;

    public UserStatistics getStat(User user){
        return userStatisticsRepository.findUserStatisticsByUser(user);
    }
}
