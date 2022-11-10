package com.netcracker.CarRentalSystem.controller.bean;

public class User {
    private String username;
    private String password;
    //private String gender;
    /*private String email_id;
    private String phone_no;*/

    /*public String getGender() {
        return gender;
    }*/

    /*public void setGender(String gender) {
        this.gender = gender;
    }*/

    /*public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }*/

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                //", gender='" + gender + '\'' +
                //", email='" + email_id + '\'' +
                //", phone_no=" + phone_no +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
