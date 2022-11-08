<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <head>
        <title>LoginPage</title>
        <link href="webjars/bootstrap/4.5.3/css/bootstrap.min.css" rel="stylesheet">
        <style>
            .login-form{
                width:400px;
                height:300px;
                position:absolute;
                background-color: #FFB6C1;
                border-radius:5px;
                top:50%;
                left:50%;
                margin-right:-50%;
                transform:translate(-50%,-50%);
            }

        </style>
    </head>
    <body>
        <div class="login-form">
            <c:if test="${not empty errorMessage}">
                <div class="alert alert-warning" role="alert">${errorMessage}</div>
            </c:if>
            <c:if test="${not empty successMessage}">
                <div class="alert alert-success" role="alert">${successMessage}</div>
            </c:if>
            <div class="container-fluid">
                <h2 style="font-family:sans-seriff;text-align:center">Sign In</h2>
                <form method="post" action="login">
                    <input type="text" class="form-control mt-3" name="username" placeholder="Username"/>

                    <input type="password" class="form-control mt-3" name="password" placeholder="Password"/>
                    <button class="btn btn-dark btn-block mt-3" >Submit</button>
                    New User?
                    <a href="/register" class="btn-btn-block mt-3"style="text-align:center">Register</a>
                </form>
            </div>
        </div>
    </body>
</html>