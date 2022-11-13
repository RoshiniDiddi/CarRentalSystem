package com.netcracker.CarRentalSystem.dao;

import com.netcracker.CarRentalSystem.controller.bean.Cars;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.time.LocalTime;
import java.util.List;
@Repository
public interface CarsDao {

    Cars getCarDetails(int id);
    List<Cars> getCarsByStartTimeEndTimeAndModel(LocalTime start, LocalTime end, String model);

    List<Cars> getCarsSortedByPriceAscending();

    List<Cars> getCarsSortedByPriceDescending();

    List<Cars> getAllCars();

    List<Cars> getCarsSortedByModel();
    Cars getCarDetailsByRegNumber(int reg_no);

    void returnCarDetails(int reg_no);
}
