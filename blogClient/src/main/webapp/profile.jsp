<%-- 
    Document   : profile
    Created on : 13 Jun 2024, 8:54:02 AM
    Author     : Liam Baron
--%>

<%@page import="com.liambaron.blog.Account"%>
<%@page import="com.liambaron.blog.DatabaseWebService"%>
<%@page import="com.liambaron.blog.DatabaseWebService_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootstrap/bootstrap.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/bootstrap.min.js">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/global.css">
        <link rel="stylesheet" href="resources/positions.css"/>
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
                    <li class="nav-item active">
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
        <div style="text-align: center; margin: auto">
            <span class="border border-secondary">
                <a style="padding-right: 100px; padding-left: 100px"><%= request.getAttribute("username")%></a>
            </span>
        </div>

    </body>
</html>
