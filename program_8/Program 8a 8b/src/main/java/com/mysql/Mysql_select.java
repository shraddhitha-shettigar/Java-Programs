//Read all the existing records from the table coffee which is from the database test and insert a new coffee product into it [Create a table coffee with fields ( id,coffee_name,price)] using HTML and JSP to get the fields and display the results respectively

package com.mysql;
import java.sql.*;
import java.util.Properties;
public class Mysql_select {
    public static void main(String[] args) {
        Connection dbConnection = null;
        try {
            // JDBC URL points to your local test database
            String url = "jdbc:mysql://localhost:3306/test";
            Properties info = new Properties();
            info.put("user", "root"); // Default XAMPP username
            info.put("password", ""); // Leave empty if no password set

            dbConnection = DriverManager.getConnection(url, info);
            if (dbConnection != null) {
                System.out.println("Successfully connected to MySQL database test");
            }

            // Displaying all coffee records
            String query = "SELECT * FROM coffee";
            Statement st = dbConnection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String coffee_name = rs.getString("coffee_name");
                int price = rs.getInt("price");
                System.out.format("\n%d, %s, %d", id, coffee_name, price);
            }

            // Insert a new coffee
            String insertQuery = "INSERT INTO coffee(coffee_name, price) VALUES(?, ?)";
            PreparedStatement stmt = dbConnection.prepareStatement(insertQuery);
            stmt.setString(1, "Tajmahal");
            stmt.setInt(2, 950);
            stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {
            System.out.println("SQL Error");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Other Error");
            e.printStackTrace();
        }
    }
}
