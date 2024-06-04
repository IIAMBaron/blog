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
    </head>
    <body onload="connect()">
        <div class="center">
            <textarea rows="4" cols="50" id="messenger"></textarea><br>
            <button onclick="message()" type='button'>Click Me!</button><br>
            <p id='text'></p>
        </div>
        
    </body>
    
    <script src="static/websocket.js"></script>
</html>
