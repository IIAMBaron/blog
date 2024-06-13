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
        <link rel="stylesheet" href="resources/global.css">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <a class="navbar-brand" href="/blogClient">Blog</a>

  <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
    <ul class="navbar-nav mt-2 mt-lg-0">
      <li class="nav-item">
        <a class="nav-link" href="/blogClient/chatroom">Chatroom <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link mx-auto" style="display: inline-block" href="#">About</a>
      </li>
    </ul>
  </div>
        </nav>
        <div class="global">
            <h1>Login</h1>
            <form action="checkcredentials" method="POST" >
                <label>Username</label><br>
                <input type="text" id="username" name="username" required="true"><br>
                <label>Password</label><br>
                <input type="password" id="password" name="password" required="true"><br>
                <button type="submit" >Login</button><br>
                <p class="text-danger">${error}</p><br>
            </form>
            <a href="register">Don't have an account?</a>
        </div>
    </body>
</html>
