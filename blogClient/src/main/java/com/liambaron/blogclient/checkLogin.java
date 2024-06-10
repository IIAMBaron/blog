package com.liambaron.blogclient;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "checkLogin", urlPatterns = {"/chatroom"})
public class checkLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
            
        Object username = session.getAttribute("username");

        if (username == null) {
           response.sendRedirect("login");
        }
        else {
            RequestDispatcher fw = request.getRequestDispatcher("chat.jsp");
            fw.forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
    }
}
