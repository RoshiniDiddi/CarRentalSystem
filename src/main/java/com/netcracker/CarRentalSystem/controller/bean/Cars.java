package com.netcracker.CarRentalSystem.controller.bean;

import java.sql.Time;
import java.time.LocalTime;

public class Cars {
    private int car_id;

    private String model;

    public int getSeater() {
        return seater;
    }

    public void setSeater(int seater) {
        this.seater = seater;
    }

    private int seater;
    private LocalTime start_time;
    private LocalTime end_time;
    private int price;


    private String booked;

    public String getBooked() {
        return booked;
    }

    public void setBooked(String booked) {
        this.booked = booked;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "car_id=" + car_id +
                ", model='" + model +
                ", seater=" + seater +
                ", price=" + price +
                ", booked=" + booked +
                '}';
    }

    public String getModel() {
        return model;
    }
    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalTime getStart_time() {
        return start_time;
    }

    public void setStart_time(LocalTime start_time) {
        this.start_time = start_time;
    }

    public LocalTime getEnd_time() {
        return end_time;
    }

    public void setEnd_time(LocalTime end_time) {
        this.end_time = end_time;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
