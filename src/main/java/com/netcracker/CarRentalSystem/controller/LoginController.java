package com.netcracker.CarRentalSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
    @RequestMapping(value="/register",method=RequestMethod.GET)
    public String RegisterPage(){
        return "register";
    }
    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String loginPage(){
        return "login";
    }

    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String carsPage(ModelMap model, @RequestParam String userId, @RequestParam String password){
        if(userId.equals("admin") && password.equals("root")){
            return "cars";
        }
        model.put("errorMessage","Please enter correct credentials");
        return "login";
    }

}
