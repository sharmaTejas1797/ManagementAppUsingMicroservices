package com.user.user_service.service;

import com.user.user_service.exception.NoSuchUserFoundException;
import com.user.user_service.model.User;
import com.user.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService  {
    @Autowired
    private UserRepository userRepository;


    public Optional<User> getUserById(int id){

        if(userRepository.findById(id).isEmpty())
            throw new NoSuchUserFoundException("User not found with id: " + id);
        Optional<User> user = userRepository.findById(id);
        return user;
    }
}
