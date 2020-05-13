package me.jiahuan.springboot.controller;

import me.jiahuan.springboot.pojo.User;
import me.jiahuan.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user")
    public List<User> findAll() {
        List<User> users = userRepository.findAll();
        return users;
    }
}
