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

        </style>
    </head>
    <body>

        <table align="center">
            <tr colspan="3">The Car Details are:</tr>
            <tr>
                <th>Car Model</th>
                <th>Rent Price</th>
                <th>Book</th>
            </tr>
            <c:forEach items="${carList}" var ="car">
                <tr>
                    <td>${car.model}</td>
                    <td>${car.price}</td>
                    <td><a href="/booking" class="btn-btn-block mt-3"style="text-align:center">Book Now</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>