package com.example.dao;

import com.example.models.User;

import java.util.List;

public interface UserDao {
    List<User> getList();
    User getById(long id);
    void store(User user);
    void update(User user);
    void delete(long id);
}
