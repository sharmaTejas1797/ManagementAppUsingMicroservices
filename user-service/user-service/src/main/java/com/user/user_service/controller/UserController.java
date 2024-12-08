package com.user.user_service.controller;

import com.user.user_service.model.User;
import com.user.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/munshiji")
public class UserController {
@Autowired
private UserService userService;

@GetMapping("/test")
public String test(){
    return "Hello world!";
}

@GetMapping("/users/{id}")
public ResponseEntity<Optional<User>> getUserById(@PathVariable int id){
    Optional<User> user = userService.getUserById(id);
    return  ResponseEntity.status(HttpStatus.OK).body(user);

}
}
