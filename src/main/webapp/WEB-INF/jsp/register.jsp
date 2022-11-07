<html>
    <head>
        <title>RegisterPage</title>
        <link href="webjars/bootstrap/4.5.3/css/bootstrap.min.css" rel="stylesheet">
        <style>
            .register-form{
                width:400px;
                height:300px;
                top:50%;
                left:50%;
                position:absolute;
                background-color:#CCCCFF;
                font-family:sans-seriff;
                transform:translate(-50%,-50%);
                margin:20px auto;
                border-radius:5px;
            }
            input{
                top-padding:5px;
                font-size:inherit;
            }
            h2{
                text-align:center;
                padding:10px;
            }
            button{

            }
        </style>
    </head>
    <body>
    <div class="register-form">
        <div class="container-fluid">
            <form>
                <h2 >Register</h2>
                <table align="center">
                    <tr>
                        <td>Username:</td>
                        <td>
                            <input type="text" name="user" placeholder="Username">
                        </td>
                    </tr>
                    <tr>
                        <td>Email Id:</td>
                        <td>
                            <input type="email" name="email" placeholder="Email">
                        </td>
                    </tr>
                    <tr>
                        <td>Mobile number:</td>
                            <td>
                            <input type="number" name="phone_no" placeholder="Mobile Number">
                        </td>
                    </tr>
                    <tr>
                        <td>Gender:</td>
                        <td>
                            <input type="radio" name="gender" value="Male" >Male
                            <input type="radio" name="gender" value="Female" >Female
                            <input type="radio" name="gender" value="Others">Others
                        </td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td>
                            <input type="password" name="password" placeholder="Password">
                        </td>
                    </tr>
                    <tr>
                        <td> Confirm Password:</td>
                        <td>
                            <input type="password" name="confirm_password" placeholder="Confirm Password">
                        </td>
                    </tr>

                </table>
                <button class="btn btn-dark btn-block mt-3" >Submit</button>
            </form>
        </div>
    </div>
    </body>
</html>