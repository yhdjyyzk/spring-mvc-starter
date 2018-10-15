package com.wind.service;

import com.wind.entity.User;
import java.util.List;

public interface UserService {
    public User findByUsernameAndPwd(String username, String password);
    public List<User> find(User User);
    public void add(User User);
    public void update(User User);
    public void delete(String id);
    public List<User> getAll();
}
