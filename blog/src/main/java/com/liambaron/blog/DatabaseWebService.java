package com.liambaron.blog;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Liam Baron
 */
@WebService(serviceName = "DatabaseWebService")
public class DatabaseWebService {
    DatabaseModel x = new DatabaseModel();
    Account y = new Account();

    // This inserts the information the user puts in into the database
    @WebMethod(operationName = "createAcc")
    public String createAcc(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        x.connect();
        int check = x.updateDel("INSERT INTO account VALUES ('"+username + "', '" + password + "' , ' ', 1)");
        System.out.println(check);
        // if the username is not available
        if (check == -1) {
            return "That username is unavailable";
        }
        return "Account created succefully";
    }

    // This will delete the account. I wanted to keep this incase I expand on this project.
    @WebMethod(operationName = "delAcc")
    public String delAcc(@WebParam(name = "username") String username) {
        x.connect();
        int check = x.updateDel("DELETE FROM account WHERE username = '" + username + "'");
        
        if (check == 0) {
            return "Invalid username";
        }
        return "Account successfully deleted";
    }

    // I have this method to update users about informatin not used as of now.
    @WebMethod(operationName = "updateAcc")
    public String updateAcc(@WebParam(name = "username") String username, @WebParam(name = "about") String about) {
        x.connect();
        int check = x.updateDel("UPDATE Account SET about = '" + about + "' WHERE username = '" + username + "'");
        if (check == 0) {
            return "Not Updated";
        }
        return "Updated";
    }

    // This method helps with getting all the information about the user that is in the database.
    @WebMethod(operationName = "detailsAcc")
    public Account detailsAcc(@WebParam(name = "username") String username) {
        x.connect();
        
        try {
            ResultSet result = x.statement("SELECT * FROM account WHERE username = '"+ username +"'");
            while (result.next()) {
                y.setUsername(result.getString("username"));
                y.setPassword(result.getString("password"));
                y.setAbout(result.getString("about"));
                y.setRole(result.getInt("roleID"));
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return y;
    }

    // This will check the credentials of the user entered and see if it matches in the database.
    @WebMethod(operationName = "checkPass")
    public String checkPass(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        String sqlPass = "";
        String sqlUsername = "";
        x.connect();
        ResultSet rs = x.statement("SELECT * FROM account WHERE username = '" + username + "' AND password = '" + password + "'");
        
        try {
            while (rs.next()) {
                sqlUsername = rs.getString("username");
                sqlPass = rs.getString("password");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        if (username.equals(sqlUsername) && password.equals(sqlPass)) {
            return "Successful";
        }
        return "Unsuccessful";
    }

    // Tests the connection
    @WebMethod(operationName = "testConnection")
    public String testConnection() {
        x.connect();
        return "It has successfully connected on the webservice";
    }
}
