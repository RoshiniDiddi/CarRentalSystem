package com.netcracker.CarRentalSystem.controller;

import com.netcracker.CarRentalSystem.controller.bean.User;
import com.netcracker.CarRentalSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
    @Autowired

    UserService userService;

    @RequestMapping(value="/register",method=RequestMethod.GET)
    public String RegisterPage(Model model){
        User user=new User();
        model.addAttribute("user",user);
        return "register";
    }

    @RequestMapping(value="/register",method=RequestMethod.POST)
    public String registerUser(@ModelAttribute("user") User user,ModelMap model){
        int count=userService.createNewUser(user);
        if(count!=1){
            model.put("errorMessage","Error occurred during registration");
            return "register";
        }
        model.put("successMessage","User Registered successfully");
        return"login";
    }


    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String loginPage(){
        return "login";
    }

    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String loginUser(ModelMap model, @RequestParam String username, @RequestParam String password){
        /*if(userId.equals("admin") && password.equals("root")){
            return "cars";
        }
        model.put("errorMessage","Please enter correct credentials");*/
        User u=userService.getUserByUsername(username);
        if(u.getPassword().equals(password)){
            model.put("Username:",username);
            return "redirect:cars";
        }
        model.put("errorMessage","Please enter correct credentials");
        return "login";
    }




}
