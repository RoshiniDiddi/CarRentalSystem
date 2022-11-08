package com.netcracker.CarRentalSystem.dao.impl;

import com.netcracker.CarRentalSystem.controller.bean.user;
import com.netcracker.CarRentalSystem.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {
    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialise(){
        setDataSource(dataSource);
    }
    @Override
    public user getUserByUsername(String username) {
        String sql="select password from user where username=?";
        return getJdbcTemplate().queryForObject(sql,new Object[]{username},new RowMapper<user>(){
            public user mapRow(ResultSet rs, int rowNum)throws SQLException{
                user u=new user();
                u.setUsername(username);
                u.setPassword(rs.getString(1));
                return u;
            }
        });
    }
}
