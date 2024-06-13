package com.liambaron.blogclient;

import com.liambaron.blog.Account;
import com.liambaron.blog.DatabaseWebService;
import com.liambaron.blog.DatabaseWebService_Service;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Liam Baron
 */
@WebServlet(name = "ProfileServlet", urlPatterns = {"/chatroom/profile/*"})
public class ProfileServlet extends HttpServlet {
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("this is in the doGet method");
        String pathInfo = request.getPathInfo();
        System.out.println(request.getPathInfo());


        if (pathInfo != null && pathInfo.length() > 1) {
            String username = pathInfo.substring(1);
            DatabaseWebService_Service port = new DatabaseWebService_Service();
            DatabaseWebService database = port.getDatabaseWebServicePort();

            Account details = database.detailsAcc(username);
            System.out.println(details == null);
            if (details != null) {
                System.out.println("It is not null");
                request.setAttribute("username", username);
                System.out.println(details.getUsername());
                request.setAttribute("about", details.getAbout());
                RequestDispatcher fw = request.getRequestDispatcher("/profile.jsp");
                fw.forward(request, response);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
