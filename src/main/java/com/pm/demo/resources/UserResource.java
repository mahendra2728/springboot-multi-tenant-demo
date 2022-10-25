package com.pm.demo.resources;

import com.pm.demo.model.User;
import com.pm.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("users")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("users")
    public List<User> users(){
        return userRepository.findAll();
    }
}
