<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <head>
        <title>Cars</title>
        <link href="webjars/bootstrap/4.5.3/css/bootstrap.min.css" rel="stylesheet">
        <style>
            .car-form{
             width:400px;
             height:300px;
             position:absolute;
             background-color: #58D68D;
             border-radius:5px;
             top:50%;
             left:50%;
             margin-right:-50%;
             transform:translate(-50%,-50%);
             }

        </style>
    </head>
    <body>
    <div class="car-form">
        <h2 style="text-align:center;font-family:sans-seriff">Welcome to cars page</h2>
        <div class="container-fluid">
                <form method="post">
                    <input type="text" class="form-control mt-3" name="start" placeholder="Start Time"/>
                    <input type="text" class="form-control mt-3" name="end" placeholder="End Time"/>
                    <input type="text" class="form-control mt-3" name="model" placeholder="Model"/>
                    <button type="Submit" class="btn-btn-primary btn-block">Search</button>
                </form>
        </div>
    </div>
    </body>
</html>