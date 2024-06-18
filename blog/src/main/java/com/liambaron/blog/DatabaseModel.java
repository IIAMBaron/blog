package com.liambaron.blog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Liam Baron
 */
public class DatabaseModel {
    // This is what happens under the hood I made it so the user does not interact with the database at all by using these
    // type of commands server-side
    private final String connection = "jdbc:sqlserver://localhost:1433;databaseName=Blog;user=Liam;password=1;encrypt=false";
    private final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private Connection con = null;

    public DatabaseModel() {
    }
     
    public void connect() {
        if (con != null) {
            return;
        }
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(connection);
            System.out.println("The Connection was successful");
        }catch(SQLException e) {
            System.out.println("Connection was unsuccessful");
            System.out.println(e.getMessage());        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void close() {
        try {
            con.close();
            System.out.println("The connection has been successfully closed");
        }catch(SQLException e) {
            System.out.println("The connection could not be closed");
        }         
    }

    public ResultSet statement(String query) {
        try {
            Statement sttmt = con.createStatement();
            ResultSet test = sttmt.executeQuery(query);
            return test;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseModel.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int updateDel(String query) {
        try {
            PreparedStatement sttmt = con.prepareStatement(query);
            int result = sttmt.executeUpdate();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseModel.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
}
