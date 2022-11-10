package com.netcracker.CarRentalSystem.controller;

import com.netcracker.CarRentalSystem.controller.bean.Cars;
import com.netcracker.CarRentalSystem.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalTime;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    CarService carService;

    @RequestMapping(value="/cars",method= RequestMethod.GET)
    public String carsPage(){
        return "cars";
    }

    @RequestMapping(value="/cars",method=RequestMethod.POST)
    public ModelAndView carsAvailable(ModelAndView modview, @RequestParam String start, @RequestParam String end, @RequestParam String model){
        LocalTime st_time=LocalTime.parse(start);
        LocalTime ed_time=LocalTime.parse(end);
        List<Cars> cars=carService.getCarsByStartTimeEndTimeAndModel(st_time,ed_time,model);
        modview.addObject("carList",cars);
        modview.setViewName("carDetails");
        return modview;
    }

    @GetMapping(value="/booking")
    public String bookingPage(){
        return "booking";
    }


}
