package com.netcracker.CarRentalSystem.service;

import com.netcracker.CarRentalSystem.controller.bean.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {
    User getUserByUsername(String username);

    int createNewUser(User u);
}
