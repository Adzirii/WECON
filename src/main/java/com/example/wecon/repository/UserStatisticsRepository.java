package com.example.wecon.repository;

import com.example.wecon.entity.User;
import com.example.wecon.entity.UserStatistics;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserStatisticsRepository extends JpaRepository<UserStatistics, User> {
    UserStatistics findUserStatisticsByUser(User user);
}
