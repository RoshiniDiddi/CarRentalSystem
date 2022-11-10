package com.netcracker.CarRentalSystem.controller.bean;

import java.sql.Time;
import java.time.LocalTime;

public class Cars {
    private String model;
    private LocalTime start_time;
    private LocalTime end_time;
    private int price;

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    private boolean booked;

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", price=" + price +
                ", booked=" + booked +
                '}';
    }

    public String getModel() {
        return model;
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
