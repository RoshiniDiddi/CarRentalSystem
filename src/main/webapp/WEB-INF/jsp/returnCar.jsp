<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Booking</title>
        <link href="webjars/bootstrap/4.5.3/css/bootstrap.min.css" rel="stylesheet">
        <style>
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
        input{
        width:300px;
        }
        img{
            width:50%;
            height:auto;
            margin-left:250px;
            margin-top:200px;
        }
        </style>
    </head>
    <body>
    <img src="https://th.bing.com/th/id/OIP.UsbhIe-n6APw97TFqmWuegHaA4?w=372&h=51&c=7&r=0&o=5&dpr=1.5&pid=1.7">
    <form method="post" style="margin-left:400px;margin-top:50px;">
        <input type="number" name="reg_no" placeholder="Enter Registration Number"/>
        <button type="submit"> Return</button>
        </form>
    </body>
</html>
