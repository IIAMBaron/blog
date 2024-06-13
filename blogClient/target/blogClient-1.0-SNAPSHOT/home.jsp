<%-- 
    Document   : home
    Created on : 12 Jun 2024, 10:32:49 AM
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
        <title>Home</title>
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
            <h1>BLOG - WEB APPLICATION</h1><br>
            <a href="login">Login</a><br>
            <a href="register">Register</a>
        </div>
    </body>
    <script src="static/homePage.js"></script>
</html>
