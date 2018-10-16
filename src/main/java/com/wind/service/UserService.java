package com.wind.service;

import com.wind.entity.User;

import java.util.List;

public interface UserService {
    User findByUsernameAndPwd(String username, String password);

    List<User> find(User User);

    void add(User User);

    void update(User User);

    void delete(String id);

    List<User> getAll();
}
