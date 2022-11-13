<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html >
    <head>
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
            h2{
                text-align:center;
                font-family:sans-seriff;
            }
        </style>
    </head>
    <body>
        <select placeholder="Sort" onchange="location=this.value">
                <option>Select sort By</option>
                <option value="/sortByModel">Sort by model</option>
                <option value="/priceSortingAscending">Sort price low to high</option>
                <option value="/priceSortingDescending">Sort price high to low</option>
            </select>
            <button><a href="/cars">Select Date and Book Car</a></button>
        <table align="center">
            <h2>Sorted Car Details By Model</h2>
            <tr>
                <th>Car Id</th>
                <th>Car Model</th>
                <th>Rent Price</th>
                <th>Booking Status</th>
                <th>Book</th>
            </tr>
            <c:forEach items="${carList}" var ="car">
                    <tr>
                    <td>${car.car_id}</td>
                    <td>${car.model}</td>
                    <td>${car.price}</td>
                    <td>${car.booked}</td>
                    <td><a href="/carDetails/${car.car_id}">Book Now</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>