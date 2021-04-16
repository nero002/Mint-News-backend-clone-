package com.example.NewsAPI.service;

import com.example.NewsAPI.entity.User;
import com.example.NewsAPI.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public String saveUser(User user) {
        userDAO.save(user);
        return "Signup successfully";
    }

    @Override
    public Iterable<User> getAllUser() {
        return userDAO.findAll();
    }


}
