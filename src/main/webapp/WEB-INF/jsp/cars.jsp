<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <head>
        <title>Cars</title>
        <link href="webjars/bootstrap/4.5.3/css/bootstrap.min.css" rel="stylesheet">
        <style>
        body {
            background-image: url(https://www.bing.com/th/id/OGC.ba04c9a46bb01bdb93a5f12546d55260?pid=1.7&rurl=https%3a%2f%2fcdn.statically.io%2fimg%2fblazepress.com%2f.image%2fc_fit%2ch_600%2cw_600%2fMTI4OTkzNTczMjUyMjIwOTM4%2ftumblr_mz7q83fzgs1tpu5feo1_500.gif%3fquality%3d100%26f%3dauto&ehk=9rl9MUXLUXSaIbdREVVsqqUnPNC3Og3m6tNxxD%2fWloE%3d);
            background-size:cover;
        }
            .car-form{
             width:400px;
             height:300px;
             position:absolute;
             background-color: #fffff;
             border-radius:5px;
             top:60%;
             left:30%;
             margin-right:-50%;
             transform:translate(-50%,-50%);
             color:#332e42;
             }

        </style>
    </head>
    <body>
    <div class="car-form">
        <h2 style="text-align:center;font-family:Times;font-size:40px;">Welcome to cars page</h2>
        <div class="container-fluid">
                <form method="post">
                    <input type="text" class="form-control mt-3" name="start" placeholder="Start Time"/>
                    <input type="text" class="form-control mt-3" name="end" placeholder="End Time"/>
                    <input type="text" class="form-control mt-3" name="model" placeholder="Model"/>
                    <button class="btn-btn-block mt-3" type="Submit">Search</button>
                </form>
        </div>
    </div>
    </body>
</html>