package com.netcracker.CarRentalSystem.controller;

import com.netcracker.CarRentalSystem.controller.bean.user;
import com.netcracker.CarRentalSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
    @Autowired
    UserService userService;
    @RequestMapping(value="/register",method=RequestMethod.GET)
    public String RegisterPage(){
        return "register";
    }
    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String loginPage(){
        return "login";
    }

    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String carsPage(ModelMap model, @RequestParam String username, @RequestParam String password){
        /*if(userId.equals("admin") && password.equals("root")){
            return "cars";
        }
        model.put("errorMessage","Please enter correct credentials");*/
        user u=userService.getUserByUsername(username);
        if(u.getPassword().equals(password)){
            model.put("Username:",username);
            return "cars";
        }
        model.put("errorMessage","Please enter correct credentials");
        return "login";
    }

}
