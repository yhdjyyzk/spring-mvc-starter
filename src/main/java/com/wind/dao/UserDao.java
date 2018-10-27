package com.wind.dao;

import com.wind.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("UserDao")
public interface UserDao {
    User findByUsernameAndPwd(@Param("username") String username, @Param("password") String password);

    User findByUsername(String username);

    List<User> find(User user);

    void add(User user);

    void update(User user);

    void delete(String id);

    List<User> getAll();
}
