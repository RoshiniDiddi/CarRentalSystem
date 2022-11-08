package com.netcracker.CarRentalSystem.dao;

import com.netcracker.CarRentalSystem.controller.bean.User;

public interface UserDao {
    User getUserByUsername(String username);
    int createNewUser(User u);
}
