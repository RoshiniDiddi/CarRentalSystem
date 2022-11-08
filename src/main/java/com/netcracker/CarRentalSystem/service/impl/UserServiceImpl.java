package com.netcracker.CarRentalSystem.service.impl;

import com.netcracker.CarRentalSystem.controller.bean.user;
import com.netcracker.CarRentalSystem.dao.UserDao;
import com.netcracker.CarRentalSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public user getUserByUsername(String username) {
        user u=userDao.getUserByUsername(username);
        return u;
    }
}
