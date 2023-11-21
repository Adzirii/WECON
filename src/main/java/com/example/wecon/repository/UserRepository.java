package com.example.wecon.repository;

import com.example.wecon.entity.User;
import com.example.wecon.entity.UserStatistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByUserId(Long userId);
    User findByEmail(String email);
    User findByPhoneNumber(String phoneNumber);

   // UserStatistics findUserStatisticsByUserId(Long userId);

}
