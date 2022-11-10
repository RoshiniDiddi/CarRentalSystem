package com.netcracker.CarRentalSystem.dao;

import com.netcracker.CarRentalSystem.controller.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User getUserByUsername(String username);
    int createNewUser(User u);
}
