<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Booking</title>
        <link href="webjars/bootstrap/4.5.3/css/bootstrap.min.css" rel="stylesheet">
        <style>
        body{
            background-image:url(https://th.bing.com/th/id/R.de0f4bf6e8075312a6eb20ad7044571a?rik=lfNj3XxNGm8pNw&riu=http%3a%2f%2fwww.hdwallpaperspulse.com%2fwp-content%2fuploads%2f2016%2f03%2f06%2fgrey-car-background.jpeg&ehk=Uj4%2fbbaFxFblSiF%2fcim9Q3DX8UR%2fQxr043KTMovOTXU%3d&risl=&pid=ImgRaw&r=0);
            background-size:cover;
        }
        h3{
            text-align:center;
             font-family:sans-seriff;
        }
        td,th{
                        width:100px;
                        height:50px;
                        text-align:center;
                        padding:2px;
                    }
        </style>
    </head>
    <body>
        <table align="center">
        <h3>Car Details with Registration Number: ${cars.reg_no}</h3>
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
