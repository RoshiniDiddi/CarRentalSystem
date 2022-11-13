package com.netcracker.CarRentalSystem.dao.impl;

import com.netcracker.CarRentalSystem.controller.bean.Cars;
import com.netcracker.CarRentalSystem.dao.CarsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class CarsDaoImpl extends JdbcDaoSupport implements CarsDao {
    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialise(){
        setDataSource(dataSource);
    }
    @Override
    public List<Cars> getAllCars() {
        List<Cars> result=new ArrayList<>();
        String sql="select * from cars";
        List<Map<String,Object>> query =getJdbcTemplate().queryForList(sql);
        for(Map<String,Object> map : query){
            Cars cars=new Cars();
            cars.setPrice((Integer) map.get("price"));
            cars.setModel((String) map.get("model"));
            cars.setCar_id((Integer) map.get("car_id"));
            cars.setSeater((Integer) map.get("seater"));
            cars.setBooked((String) map.get("booked"));
            result.add(cars);
        }
        return result;
    }

    @Override
    public List<Cars> getCarsSortedByModel() {
        List<Cars> result=new ArrayList<>();
        String sql="select * from cars order by model";
        List<Map<String,Object>> query =getJdbcTemplate().queryForList(sql);
        for(Map<String,Object> map : query){
            Cars cars=new Cars();
            cars.setPrice((Integer) map.get("price"));
            cars.setSeater((Integer) map.get("seater"));
            cars.setModel((String) map.get("model"));
            cars.setBooked((String) map.get("booked"));
            cars.setCar_id((Integer) map.get("car_id"));
            result.add(cars);
        }
        return result;
    }

    @Override
    public Cars getCarDetailsByRegNumber(int reg_no) {
        String sql= "select * from cars where reg_no=?";
        return getJdbcTemplate().queryForObject(sql,new Object[]{reg_no},new RowMapper<Cars>(){
            @Override
            public Cars mapRow(ResultSet rs, int rowNum) throws SQLException {
                Cars car=new Cars();
                car.setCar_id(rs.getInt("car_id"));
                car.setSeater(rs.getInt("seater"));
                car.setPrice(rs.getInt("price"));
                car.setModel(rs.getString("model"));
                car.setBooked(rs.getString("booked"));
                car.setReg_no(rs.getInt("reg_no"));
                return car;
            }
        });
    }

    @Override
    public Cars getCarDetails(int id) {
        String sql="update cars set booked='Not Available' where car_id=?";
        getJdbcTemplate().update(sql,id);

        String sql1="select * from cars where car_id=?";

        String sql2="update cars set reg_no=? where car_id=?";
        int reg_no= (int) (Math.random()*1000);
        getJdbcTemplate().update(sql2,reg_no,id);
        return getJdbcTemplate().queryForObject(sql1,new Object[]{id},new RowMapper<Cars>(){
            @Override
            public Cars mapRow(ResultSet rs, int rowNum) throws SQLException {
                Cars car=new Cars();
                car.setCar_id(id);
                car.setSeater(rs.getInt("seater"));
                car.setPrice(rs.getInt("price"));
                car.setModel(rs.getString("model"));
                car.setBooked(rs.getString("booked"));
                car.setReg_no(rs.getInt("reg_no"));
                return car;
            }
        });
    }

    @Override
    public List<Cars> getCarsByStartTimeEndTimeAndModel(LocalTime start, LocalTime end, String model) {

        String sql="select * from cars where start_time<=? and end_time>=? and booked!='Not Available'";
        List<Cars> result=new ArrayList<>();
        List<Map<String,Object>> query =getJdbcTemplate().queryForList(sql,start,end);
        for(Map<String,Object> map : query){
            Cars cars=new Cars();
            cars.setPrice((Integer) map.get("price"));
            cars.setSeater((Integer) map.get("seater"));
            cars.setModel((String) map.get("model"));
            cars.setBooked((String) map.get("booked"));
            cars.setCar_id((Integer) map.get("car_id"));
            //cars.setReg_no((Integer) map.get("reg_no"));
            result.add(cars);
        }
    return result;
    }

    @Override
    public List<Cars> getCarsSortedByPriceAscending() {
        List<Cars> result=new ArrayList<>();
        String sql="select * from cars order by price";
        List<Map<String,Object>> query =getJdbcTemplate().queryForList(sql);
        for(Map<String,Object> map : query){
            Cars cars=new Cars();
            cars.setPrice((Integer) map.get("price"));
            cars.setSeater((Integer) map.get("seater"));
            cars.setModel((String) map.get("model"));
            cars.setBooked((String) map.get("booked"));
            cars.setCar_id((Integer) map.get("car_id"));
            result.add(cars);
        }
        return result;
    }

    @Override
    public List<Cars> getCarsSortedByPriceDescending() {
        List<Cars> result=new ArrayList<>();
        String sql="select * from cars order by price desc";
        List<Map<String,Object>> query =getJdbcTemplate().queryForList(sql);
        for(Map<String,Object> map : query){
            Cars cars=new Cars();
            cars.setPrice((Integer) map.get("price"));
            cars.setModel((String) map.get("model"));
            cars.setBooked((String) map.get("booked"));
            cars.setSeater((Integer) map.get("seater"));
            cars.setCar_id((Integer) map.get("car_id"));
            result.add(cars);
        }
        return result;
    }
}
