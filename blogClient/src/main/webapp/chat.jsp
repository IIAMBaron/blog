<%-- 
    Document   : chat
    Created on : 03 Jun 2024, 2:27:42 PM
    Author     : Liam Baron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chat Room</title>
        <%-- Create a NAV Bar with logout on the left and profile on the right
             We are going to be using Boostrap CSS again 
        --%>
        <link rel="stylesheet" href="resources/positions.css"/>
        <link rel="stylesheet" href="resources/bootstrap/bootstrap.min.css">
        <link rel="stylesheet" href="static/bootstrap/bootstrap.min.js">
    <nav class="navbar navbar-dark bg-dark">
        <a class="navbar-brand mx-auto text-center" href="#" style="display: flex; justify-content: space-around;" >BLOG</a>
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="#">Logout</a>
            </li>
        </ul>
    </nav>
    </head>
    <body onload="connect()">
        <div class="msg" id="messages">
        </div>
        <div class="center" >
            <textarea class="changeSize" rows="4" cols="50" id="messenger"></textarea><br>
            <button type="button" class="btn btn-primary " onclick="message()" type='button'>Click Me!</button><br>
        </div>
        
    </body>
    
    <script src="static/websocket.js"></script>
</html>
