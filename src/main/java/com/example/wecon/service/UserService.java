package com.example.wecon.service;

import com.example.wecon.entity.User;
import com.example.wecon.entity.UserStatistics;
import com.example.wecon.repository.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{
    @Autowired
    private UserRepository userRepository;


    private List<User> findByLastName(String lastName){
        return userRepository.findByLastName(lastName);
    }

    private User findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    private User findByPhoneNumber(String phoneNumber){
        return userRepository.findByPhoneNumber(phoneNumber);
    }
    private void addUser(User user){
        userRepository.save(user);
    }

//    private UserStatistics findUserStatisticsByUserId(Long userId)
//    {
//        return userRepository.findUserStatisticsByUserId(userId);
//    }
}
