package com.sudhar.demo.springsecurityoauth.service;

import com.sudhar.demo.springsecurityoauth.model.User;

import java.util.List;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
