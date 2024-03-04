package org.example.spring2.service.impl;

import org.example.spring2.UserDao;
import org.example.spring2.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean login(String name, String password) {
        return userDao.login(name, password);
    }
}