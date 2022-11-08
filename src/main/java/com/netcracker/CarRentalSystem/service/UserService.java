package com.netcracker.CarRentalSystem.service;


import com.netcracker.CarRentalSystem.controller.bean.User;

public interface UserService {
    User getUserByUsername(String username);

    int createNewUser(User u);
}
