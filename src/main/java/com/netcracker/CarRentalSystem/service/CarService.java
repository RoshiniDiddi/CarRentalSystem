package com.netcracker.CarRentalSystem.service;

import com.netcracker.CarRentalSystem.controller.bean.Cars;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;
@Component
public interface CarService {
    List<Cars> getCarsByStartTimeEndTimeAndModel(LocalTime start, LocalTime end, String model);
    Cars getCarDetails(int id);

    List<Cars> getCarsSortedByPriceAscending();
    List<Cars> getCarsSortedByPriceDescending();

    List<Cars> getAllCars();

    List<Cars> getCarsSortedByModel();

    Cars getCarDetailsByRegNumber(int reg_no);

    void returnCarDetails(int reg_no);
}
