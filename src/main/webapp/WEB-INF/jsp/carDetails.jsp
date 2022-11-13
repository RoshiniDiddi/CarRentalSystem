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
                font-family:sans-seriff;
                text-align:center;
            }
        </style>
    </head>
    <body>
    <img src="https://media.istockphoto.com/vectors/cars-icon-set-vector-id165072817?k=6&m=165072817&s=612x612&w=0&h=bLsx3TWHcLVHO_WYuipdYVC5juUxuV2lTUviAlBWj40="
    style="float:right;width:200px;height:180px;">
        <c:if test="${not empty errorMsg}">
             <c:out value="${errorMsg}"></c:out>
        </c:if>
        <select placeholder="Sort" onchange="location=this.value">
            <option>Select sort By</option>
            <option value="/sortByModel">Sort by model</option>
            <option value="/priceSortingAscending">Sort price low to high</option>
            <option value="/priceSortingDescending">Sort price high to low</option>
        </select>
        <br></br>
        <button><a href="/cars">Select Date and Book Car</a></button>
        <br></br>
        <form method="post">
        <input type="number" name="reg_no" placeholder="Enter Registration number"/>
        <button type="submit">Get Car Details by Registration number</button>
        </form>
        <table align="center">
            <h2>All Existing Car Details </h2>
            <tr>
                <th>Car Id</th>
                <th>Car Model</th>
                <th>Rent Price</th>
                <th>Seaters</th>
                <th>Booking Status</th>
                <th>Book</th>
            </tr>
            <c:forEach items="${carList}" var ="car">
                    <tr>
                    <td>${car.car_id}</td>
                    <td>${car.model}</td>
                    <td>${car.price}</td>
                    <td>${car.seater}</td>
                    <td>${car.booked}</td>
                    <td><a href="/carDetails/${car.car_id}">Book Now</td>
                </tr>
            </c:forEach>
        </table>
        <button><a href="/returnCar">Return Car</a></button>
    </body>
</html>