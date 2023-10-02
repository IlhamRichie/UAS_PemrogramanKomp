/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author LENOVO
 */
import java.sql.*;

public class InsertData {
    public static void main(String[] args) {
        String userName = "myUsername";
        String password = "myPassword";
        String url = "jdbc:mysql://localhost:3306/myDatabaseName";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection(url, userName, password);
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO products (name, price) VALUES ('Apple', 1.0)";
            int rows = stmt.executeUpdate(sql);
            System.out.println(rows + " row(s) affected");
        } catch (Exception e) {
            System.err.println("Cannot connect to database server");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}