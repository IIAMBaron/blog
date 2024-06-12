<%-- 
    Document   : register
    Created on : 04 Jun 2024, 2:01:43 PM
    Author     : Liam Baron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/bootstrap/bootstrap.min.css">
        <link rel="stylesheet" href="static/bootstrap/bootstrap.min.js">
        <link rel="stylesheet" href="resources/global.css">
        <title>Register</title>
    </head>
    <body>
        <div class="global">
            <h1>Sign Up</h1>
            <form action="registeraccount" method="POST">
                <label>Username</label><br>
                <input type="text" name="newUsername" required="true"><br>
                <label>Password</label><br>
                <input type="password" name="newPassword" required="true"><br>
                <button type="submit">Register</button>
                <p class="text-danger" >${failed}</p>
            </form>
        </div>
        
    </body>
</html>
