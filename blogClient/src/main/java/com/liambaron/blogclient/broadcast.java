package com.liambaron.blogclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URLDecoder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Liam Baron
 */
@WebServlet(name = "broadcast", urlPatterns = {"/broadcast"})
public class broadcast extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Read the raw data from the request body
        BufferedReader reader = request.getReader();
        StringBuilder data = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            data.append(line);
        }
        reader.close();

        HttpSession session = request.getSession();
        String username = session.getAttribute("username").toString();

        String decodedData = username + " " +URLDecoder.decode(data.toString(), "UTF-8") ;

        System.out.println("Encoded Value: " + decodedData);

        MyWebSocketEndpoint webSocketEndpoint = new MyWebSocketEndpoint();
        webSocketEndpoint.broadcastMessage(decodedData);

        response.getWriter().write("Message broadcasted");
        }

}
