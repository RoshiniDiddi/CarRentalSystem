package com.netcracker.CarRentalSystem.dao.impl;

import com.netcracker.CarRentalSystem.controller.bean.User;
import com.netcracker.CarRentalSystem.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    public User getUserByUsername(String username) {
        String sql="select password from user where username=?";
        return getJdbcTemplate().queryForObject(sql,new Object[]{username},new RowMapper<User>(){
            public User mapRow(ResultSet rs, int rowNum)throws SQLException{
                User u=new User();
                u.setUsername(username);
                u.setPassword(rs.getString(1));

                return u;
            }
        });
    }

    @Override
    public int createNewUser(User u) {
        String sql="INSERT INTO User(username,email_id,phone_no,password) VALUES (?, ?, ?, ?)";
        return getJdbcTemplate().update(con -> {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,u.getUsername());
            ps.setString(2,u.getEmail_id());
            ps.setString(3,u.getPhone_no());
            ps.setString(4,u.getPassword());
            return ps;
        });
    }
}
