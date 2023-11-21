package com.example.wecon.service;

import com.example.wecon.entity.User;
import com.example.wecon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService{
    @Autowired
    private UserRepository userRepository;


    public Optional<User> getUserById(Long userId) {
        return userRepository.findUserByUserId(userId);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
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

}
