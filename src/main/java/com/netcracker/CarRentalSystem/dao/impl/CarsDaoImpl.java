package com.netcracker.CarRentalSystem.dao.impl;

import com.netcracker.CarRentalSystem.controller.bean.Cars;
import com.netcracker.CarRentalSystem.dao.CarsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
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
    public List<Cars> getCarsByStartTimeEndTimeAndModel(LocalTime start, LocalTime end, String model) {

        String sql="select * from cars where start_time<=? and end_time>=?";
        List<Cars> result=new ArrayList<>();
        List<Map<String,Object>> query =getJdbcTemplate().queryForList(sql,start,end);
        for(Map<String,Object> map : query){
            Cars cars=new Cars();
            cars.setPrice((Integer) map.get("price"));
            cars.setModel((String) map.get("model"));

            result.add(cars);
        }
    return result;
    }

}
