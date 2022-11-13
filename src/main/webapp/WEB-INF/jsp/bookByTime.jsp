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
        <script type="text/javascript">
            function EnableDisable(booked) {
                //Reference the Button.
                var btnSubmit = document.getElementById("btnSubmit");

                //Verify the TextBox value.
                if (txtPassportNumber.value.trim() != "") {
                    //Enable the TextBox when TextBox has value.
                    btnSubmit.disabled = false;
                } else {
                    //Disable the TextBox when TextBox is empty.
                    btnSubmit.disabled = true;
                }
            };
        </script>
    </head>
    <body>
        <c:if test="${not empty errorMsg}">
             <c:out value="${errorMsg}"></c:out>
        </c:if>
        <table align="center">
            <h2>The Car Details are:</h2>
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
                    <td><a href="/bookByTime/${car.car_id} " onkeyup="EnableDisable(${car.booked})" disabled="disabled">Book Now</td>
                </tr>
            </c:forEach>
        </table>
        <a href="/carDetails">return to main page</a>
    </body>
</html>