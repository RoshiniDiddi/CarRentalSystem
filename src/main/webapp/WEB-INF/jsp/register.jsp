<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
            <form:form method="post" modelAttribute="user" >
                <h2 >Register</h2>
                <table align="center">
                    <tr>
                        <td>Username:</td>
                        <td>
                            <form:input type="text" path="username"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Email Id:</td>
                        <td>
                            <form:input type="email" path="email_id"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Mobile number:</td>
                            <td>
                            <form:input type="text" path="phone_no"/>
                        </td>
                    </tr>

                    <tr>
                        <td>Password:</td>
                        <td>
                            <form:input type="password" path="password"/>
                        </td>
                    </tr>
                </table>
                <form:button class="btn btn-dark btn-block mt-3" >Submit</form:button>
            </form:form>
        </div>
    </div>
    </body>
</html>