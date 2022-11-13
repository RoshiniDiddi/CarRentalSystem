package com.netcracker.CarRentalSystem.controller;

import com.netcracker.CarRentalSystem.controller.bean.Cars;
import com.netcracker.CarRentalSystem.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
    @RequestMapping(value="/bookByTime",method=RequestMethod.GET)
    public String bookCarTime(){
        return "bookByTime";
    }
    @RequestMapping(value="/bookByTime/{id}",method=RequestMethod.GET)
    public ModelAndView bookByTimePage(@PathVariable int id){
        ModelAndView modview = new ModelAndView("/booking");
        Cars car=carService.getCarDetails(id);
        modview.addObject("cars",car);
        return modview;
    }

    @RequestMapping(value="/carDetails",method = RequestMethod.GET)
    public ModelAndView carDetailsPage(){
        ModelAndView modview =new ModelAndView();
        List<Cars> cars=carService.getAllCars();
        modview.addObject("carList",cars);
        modview.setViewName("/carDetails");
        return modview;
    }

    @RequestMapping(value="/cars",method=RequestMethod.POST)
    public ModelAndView carsDPage(@RequestParam String start, @RequestParam String end, @RequestParam String model){
        ModelAndView modview=new ModelAndView();
        LocalTime st_time=LocalTime.parse(start);
        LocalTime ed_time=LocalTime.parse(end);
        List<Cars> cars=carService.getCarsByStartTimeEndTimeAndModel(st_time,ed_time,model);
        System.out.println(cars);
        if(!cars.isEmpty()){
            modview.addObject("carList",cars);
            modview.setViewName("/bookByTime");
            return modview;
        }
        modview.addObject("errorMsg","No Cars Available");
        return modview;
    }
    @RequestMapping(value="/carDetails/{id}",method=RequestMethod.GET)
    public ModelAndView bookingPage(@PathVariable int id){
        ModelAndView modview = new ModelAndView("/booking");
        Cars car=carService.getCarDetails(id);
        modview.addObject("cars",car);
        return modview;
    }
    @RequestMapping(value="/carDetails",method=RequestMethod.POST)
    public ModelAndView RegisteredCar(@RequestParam int reg_no){
        ModelAndView modview = new ModelAndView("/registeredCar");
        Cars car = carService.getCarDetailsByRegNumber(reg_no);
        modview.addObject("cars",car);
        return modview;
    }
    @RequestMapping(value="/priceSortingAscending",method=RequestMethod.GET)
    public ModelAndView SortedPricePage(){
        ModelAndView modview=new ModelAndView("/priceSortingAscending");
        List<Cars> cars=carService.getCarsSortedByPriceAscending();
        modview.addObject("carList",cars);
        return modview;
    }
    @RequestMapping(value="/priceSortingDescending",method=RequestMethod.GET)
    public ModelAndView DSortedPricePage(){
        ModelAndView modview=new ModelAndView("/priceSortingDescending");
        List<Cars> cars=carService.getCarsSortedByPriceDescending();
        modview.addObject("carList",cars);
        return modview;
    }
    @RequestMapping(value="/sortByModel",method=RequestMethod.GET)
    public ModelAndView ModelSortPage(){
        ModelAndView modview=new ModelAndView("/sortByModel");
        List<Cars> cars=carService.getCarsSortedByModel();
        modview.addObject("carList",cars);
        return modview;
    }
}
