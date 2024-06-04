package com.liambaron.blogclient;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Liam Baron
 */
@WebServlet(name = "broadcast", urlPatterns = {"/broadcast"})
public class broadcast extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message = request.getHeader("message");
        MyWebSocketEndpoint webSocketEndpoint = new MyWebSocketEndpoint();
        webSocketEndpoint.broadcastMessage(message);
        response.getWriter().write("Message broadcasted");
    }

}
