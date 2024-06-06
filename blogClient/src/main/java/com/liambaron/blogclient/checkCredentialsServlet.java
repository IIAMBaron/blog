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

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("It is in the doPost method");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);

        DatabaseWebService_Service sv = new DatabaseWebService_Service();
        DatabaseWebService database = sv.getDatabaseWebServicePort();

        String result = database.checkPass(username, password);
        System.out.println(result);
        if (result.equals("Successful")) {

            HttpSession sessions = request.getSession();
            Account x = database.detailsAcc(username);
            sessions.setAttribute("username", username);
            sessions.setAttribute("about", x.getAbout());
            sessions.setAttribute("role", x.getRole());

            response.sendRedirect("chatroom");
            return;
        }
        request.setAttribute("valid", "invalid");
        response.sendRedirect("login");

    }
}