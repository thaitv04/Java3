/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author thaitv
 */
public class ConnectionProvider {
    
    private static final String DB_SERVER = "localhost";
    private static final String DB_NAME = "DEMO1";
    private static final String DB_USERNAME = "sa";
    private static final String DB_PASSWORD = "12345678";
    
    private static Connection conn;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String strConn = String.format("jdbc:sqlserver://%s;DatabaseName=%s;trustServerCertificate=true;", DB_SERVER, DB_NAME);
            conn = DriverManager.getConnection(strConn, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
               e.printStackTrace();
        }
        return conn;
    }
        public static void main(String[] args) {
            System.out.println(getConnection());
    }
}
