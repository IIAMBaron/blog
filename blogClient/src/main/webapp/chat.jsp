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
        <link rel="stylesheet" href="resources/positions.css"/>
        <link rel="stylesheet" href="resources/bootstrap/bootstrap.min.css">
        <link rel="stylesheet" href="static/bootstrap/bootstrap.min.js">
        <link rel="stylesheet" href="resources/global.css">
    
    </head>
    <body onload="connect(); sessionMessages();">
        
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <a class="navbar-brand" href="/blogClient">Blog</a>

            <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
                <ul class="navbar-nav mt-2 mt-lg-0">
                    <li class="nav-item active">
                        <a class="nav-link" href="/blogClient/chatroom">Chatroom <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/blogClient/chatroom/profile/<%= session.getAttribute("username")%>">Profile</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/blogClient/logout">Logout</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link mx-auto" style="display: inline-block" href="/blogClient/about">About</a>
                    </li>
                </ul>
            </div>
        </nav>
        
        <div class="msg" id="messages">
        </div>
        <div class="center" >
            <textarea class="changeSize" rows="4" cols="52" id="messenger"></textarea><br>
            <button type="button" class="btn btn-primary " onclick="message()" type='button'>Click Me!</button><br>
        </div>
    </body>
    <script src="static/websocket.js"></script>
</html>