package com.liambaron.blog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Liam Baron
 */
public class DatabaseModel {
    private String connection = "jdbc:sqlserver://localhost:1433;databaseName=Blog;user=Liam;password=1;encrypt=false";
    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private Connection con = null;

    public DatabaseModel() {
    }
     
    public void connect() {
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

    public void statement() {
    }

    public void updateDel() {
    }
}
