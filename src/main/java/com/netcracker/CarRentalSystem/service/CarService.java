package com.netcracker.CarRentalSystem.service;

import com.netcracker.CarRentalSystem.controller.bean.Cars;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;
@Component
public interface CarService {
    List<Cars> getCarsByStartTimeEndTimeAndModel(LocalTime start, LocalTime end, String model);
}
