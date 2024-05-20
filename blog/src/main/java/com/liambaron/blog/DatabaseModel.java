package com.liambaron.blog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Liam Baron
 */
public class DatabaseModel {
    private String connection = "jdbc:sqlserver://localhost:1433;databaseName=Blog;user=Liam;password=1;encrypt=false";
    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private Connection con = null;

    public void connect() {
        try {
            con = DriverManager.getConnection(connection);
            System.out.println("The Connection was successful");
        }catch(SQLException e) {
            System.out.println("Connection was unsuccessful");        
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
