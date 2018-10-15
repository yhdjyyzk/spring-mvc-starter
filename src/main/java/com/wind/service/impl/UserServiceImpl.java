package com.wind.service.impl;

import com.wind.dao.UserDao;
import com.wind.entity.User;
import com.wind.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Resource(name = "UserDao")
    public UserDao userDao;

    @Override
    public User findByUsernameAndPwd(String username, String password) {
        return userDao.findByUsernameAndPwd(username, password);
    }

    @Override
    public List<User> find(User user) {
        return userDao.find(user);
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void delete(String id) {
        userDao.delete(id);
    }

    @Override
    public List<User> getAll() {
       return userDao.getAll();
    }
}
