package com.example.wecon.repository;

import com.example.wecon.entity.User;
import com.example.wecon.entity.UserStatistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserStatisticsRepository extends JpaRepository<UserStatistics, User> {
    Optional<UserStatistics> findUserStatisticsByUser(Optional<User> user);
}
