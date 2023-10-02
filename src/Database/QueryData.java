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

public class QueryData {
    public static void main(String[] args) {
        String userName = "myUsername";
        String password = "myPassword";
        String url = "jdbc:mysql://localhost:3306/myDatabaseName";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection(url, userName, password);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM products";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                System.out.println(id + "\t" + name + "\t" + price);
            }
        } catch (Exception e) {
            System.err.println("Cannot connect to database server");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
