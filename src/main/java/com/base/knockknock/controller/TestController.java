package com.base.knockknock.controller;

import com.base.knockknock.model.User;
import com.base.knockknock.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/")
    public Object getUserDummy() {
        User user = new User("Luong");
        userRepository.save(user);
        user = userRepository.findByName("Luong");
        return ResponseEntity.ok(user);
    }
}
