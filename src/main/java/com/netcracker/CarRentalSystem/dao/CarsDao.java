package com.netcracker.CarRentalSystem.dao;

import com.netcracker.CarRentalSystem.controller.bean.Cars;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.time.LocalTime;
import java.util.List;
@Repository
public interface CarsDao {


    List<Cars> getCarsByStartTimeEndTimeAndModel(LocalTime start, LocalTime end, String model);
}
