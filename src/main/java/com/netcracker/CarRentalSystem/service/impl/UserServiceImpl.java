package com.netcracker.CarRentalSystem.service.impl;

import com.netcracker.CarRentalSystem.controller.bean.User;
import com.netcracker.CarRentalSystem.dao.UserDao;
import com.netcracker.CarRentalSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public User getUserByUsername(String username) {
        User u=userDao.getUserByUsername(username);
        return u;
    }

    @Override
    public int createNewUser(User u) {
        return userDao.createNewUser(u);
    }
}
