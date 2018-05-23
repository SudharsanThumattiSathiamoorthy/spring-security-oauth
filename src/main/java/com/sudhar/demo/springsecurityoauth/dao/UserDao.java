package com.sudhar.demo.springsecurityoauth.dao;

import com.sudhar.demo.springsecurityoauth.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
