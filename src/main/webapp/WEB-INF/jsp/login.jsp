<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <head>
        <title>LoginPage</title>
        <link href="webjars/bootstrap/4.5.3/css/bootstrap.min.css" rel="stylesheet">
        <style>
            .login-form{
                width:400px;
                height:250px;
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
    <h2>${errorMessage}</h2>
        <div class="login-form">
            <div class="container-fluid">
            <h2>Sign In</h2>
                <form method="post">
                    <input type="text" class="form-control mt-3" name="userId" placeholder="User ID"/>
                    <input type="password" class="form-control mt-3" name="password" placeholder="password"/>
                    <button class="btn btn-dark btn-block mt-3" >Submit</button>
                </form>
            </div>
        </div>
    </body>
</html>