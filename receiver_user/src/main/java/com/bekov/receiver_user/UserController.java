package com.bekov.receiver_user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") int id){
        return userRepository.findById(id).get();
    }
}
