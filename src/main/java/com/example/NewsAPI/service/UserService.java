package com.example.NewsAPI.service;

import com.example.NewsAPI.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    String saveUser(User user);

    Iterable<User> getAllUser();

}
