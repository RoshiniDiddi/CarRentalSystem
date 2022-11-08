package com.netcracker.CarRentalSystem.dao;

import com.netcracker.CarRentalSystem.controller.bean.user;

public interface UserDao {
    user getUserByUsername(String username);
}
