<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Booking</title>
        <link href="webjars/bootstrap/4.5.3/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <table align="center">
            <tr>
                <td>Car Id:</td>
                <td>${cars.car_id}</td>
            </tr>
            <tr>
                <td>CarModel:</td>
                <td>${cars.model}</td>
            </tr>

            <tr>
                <td>Rent Price</td>
                <td>${cars.price}</td>
            </tr>

        </table>
    </body>
</html>
