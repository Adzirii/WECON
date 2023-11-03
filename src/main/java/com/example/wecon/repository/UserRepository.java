package com.example.wecon.repository;

import com.example.wecon.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByLastName(String lastName);
    User findByEmail(String email);
    User findByPhoneNumber(String phoneNumber);

}
