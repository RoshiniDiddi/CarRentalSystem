package com.netcracker.CarRentalSystem.service.impl;

import com.netcracker.CarRentalSystem.controller.bean.Cars;
import com.netcracker.CarRentalSystem.dao.CarsDao;
import com.netcracker.CarRentalSystem.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarsDao carsDao;
    @Override
    public List<Cars> getCarsByStartTimeEndTimeAndModel(LocalTime start, LocalTime end, String model) {
        List<Cars> cars= carsDao.getCarsByStartTimeEndTimeAndModel(start,end,model);
        return cars;
    }

    @Override
    public Cars getCarDetails(int id) {
        Cars cars=carsDao.getCarDetails(id);
        return cars;
    }

    @Override
    public List<Cars> getCarsSortedByPriceAscending() {
        List<Cars> cars= carsDao.getCarsSortedByPriceAscending();
        return cars;
    }

    @Override
    public List<Cars> getCarsSortedByPriceDescending() {
        List<Cars> cars= carsDao.getCarsSortedByPriceDescending();
        return cars;
    }

    @Override
    public List<Cars> getAllCars() {
        List<Cars> cars=carsDao.getAllCars();
        return cars;
    }

    @Override
    public List<Cars> getCarsSortedByModel() {
        List<Cars> cars=carsDao.getCarsSortedByModel();
        return cars;
    }

}
