<%-- 
    Document   : login
    Created on : 04 Jun 2024, 10:23:07 AM
    Author     : Liam Baron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="resources/bootstrap/bootstrap.min.css">
        <link rel="stylesheet" href="static/bootstrap/bootstrap.min.js">
    </head>
    <body>
        <h1>Login</h1>
        <form action="checkcredentials" method="POST">
            <label>Username</label><br>
            <input type="text" id="username" name="username" required="true"><br>
            <label>Password</label><br>
            <input type="password" id="password" name="password" required="true"><br>
            <button type="submit" >Login</button><br>
            <p class="text-danger">${error}</p><br>
        </form>
        
        
        
        <a href="register">Don't have an account?</a>
    </body>
</html>
