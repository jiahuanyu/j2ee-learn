package me.jiahuan.java.spring.service;

import me.jiahuan.java.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void get() {
        userRepository.get();
    }
}
