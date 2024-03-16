/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;
import java.sql.*;
/**
 *
 * @author ThaiDepZai
 */
public class ConnectionProvider {
    
    private static final String DATABASE_SERVER = "localhost";
    private static final String DATABASE_NAME = "DEMO1";
    private static final String DATABASE_USERNAME = "sa";
    private static final String DATABASE_PASSWORD = "12345678";

    public static Connection conn;

    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String strConn = String.format("jdbc:sqlserver://%s;DatabaseName=%s;TrustServerCertificate=true;", DATABASE_SERVER, DATABASE_NAME);
            conn = DriverManager.getConnection(strConn, DATABASE_USERNAME, DATABASE_PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
