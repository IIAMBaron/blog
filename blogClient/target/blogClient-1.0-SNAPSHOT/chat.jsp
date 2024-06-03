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
        <title>JSP Page</title>
        <%-- Create a NAV Bar with logout on the left and profile on the right
             We are going to be using Boostrap CSS again 
        --%>
    </head>
    <body>
        <textarea rows="4" cols="50" id="messages"></textarea><br>
        <button onclick="test()" type='button'>Click Me!</button><br>
        <p id='test1'></p>
    </body>
    
    
    <script src="websock.js"></script>
</html>
