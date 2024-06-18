package com.liambaron.blogclient;

import com.liambaron.blog.Account;
import com.liambaron.blog.DatabaseWebService;
import com.liambaron.blog.DatabaseWebService_Service;
import java.io.IOException;
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
@WebServlet(name = "checkCredentialsServlet", urlPatterns = {"/checkcredentials"})
public class checkCredentialsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve the username and password inputted by the user
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Calls a function to check whether the password was incorrect or not
        DatabaseWebService_Service sv = new DatabaseWebService_Service();
        DatabaseWebService database = sv.getDatabaseWebServicePort();

        String result = database.checkPass(username, password);

        // Now that we have the result we need to check if the user is authorised
        if (result.equals("Successful")) {

            HttpSession sessions = request.getSession();
            Account x = database.detailsAcc(username);
            sessions.setAttribute("username", username);
            sessions.setAttribute("about", x.getAbout());
            sessions.setAttribute("role", x.getRole());

            response.sendRedirect("chatroom");
            return;
        }
        // If not we return with an error message
        HttpSession session = request.getSession();
        System.out.println("It was unsuccessful");
        session.setAttribute("error", "Invalid credentials");
        response.sendRedirect("login");
    }
}