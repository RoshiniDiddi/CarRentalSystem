<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Booking</title>
        <link href="webjars/bootstrap/4.5.3/css/bootstrap.min.css" rel="stylesheet">
            <style>
            table ,td,th{
            border: 1px solid;
            }
            td,th{
            width:200px;
            height:50px;
            text-align:center;
            padding:5px;
            }
            h2,h4{
            text-align:center;
            font-family:sans-seriff;
            }
            </style>
    </head>
    <body>
        <h2>Car Booked Successfully</h2>
        <h4> Your Registration number is : ${cars.reg_no}</h4>
        <table align="center">
            <tr>
            <th>Car Model</th>
            <th>Rent Price</th>
            <th>Car Id</th>
            </tr>
            <tr>
            <td>${cars.model}</td>
            <td>${cars.price}</td>
            <td>${cars.car_id}</td>
            </tr>
        </table>
    </body>
</html>