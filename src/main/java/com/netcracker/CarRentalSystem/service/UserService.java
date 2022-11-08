package com.netcracker.CarRentalSystem.service;


import com.netcracker.CarRentalSystem.controller.bean.user;

public interface UserService {
    user getUserByUsername(String username);
}
