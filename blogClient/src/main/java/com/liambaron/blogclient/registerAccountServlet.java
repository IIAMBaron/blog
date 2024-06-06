package com.liambaron.blogclient;

import com.liambaron.blog.Account;
import com.liambaron.blog.DatabaseWebService;
import com.liambaron.blog.DatabaseWebService_Service;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "registerAccountServlet", urlPatterns = {"/registeraccount"})
public class registerAccountServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        DatabaseWebService_Service service = new DatabaseWebService_Service();
        DatabaseWebService database = service.getDatabaseWebServicePort();

        String result = database.createAcc(username, password);

        if (result.equals("Account created succefully")) {
            HttpSession sessions = request.getSession();
            Account x = database.detailsAcc(username);
            sessions.setAttribute("username", username);
            sessions.setAttribute("about", x.getAbout());
            sessions.setAttribute("role", x.getRole());

            response.sendRedirect("chatroom");
            return;
        }

        response.sendRedirect("register");
    }

}
