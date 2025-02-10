package com.yujin.resumeai.resumeai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yujin.resumeai.resumeai.model.User;
import com.yujin.resumeai.resumeai.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

}
