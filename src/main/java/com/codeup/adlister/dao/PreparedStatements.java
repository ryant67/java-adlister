package com.codeup.adlister.dao;
import com.mysql.cj.jdbc.Driver;
//import com.mysql.cj.jdbc.PreparedStatement;

import java.sql.*;

public class PreparedStatements {
    public static void main(String[] args) {
        Config config = new Config();
//        try{
//            //Make DataBase Connection.
//            DriverManager.registerDriver(new Driver());
//            Connection connection = DriverManager.getConnection(
//               config.getUrl(), config.getUser(), config.getPassword()
//            );
//            //Create SQL Sting to make query.
//            String sql = "SELECT * FROM albums WHERE id = ?";
//            //Instantiate PreparedStatement and pass the SQL string to be used.
//            PreparedStatement stmt = connection.prepareStatement(sql);
//            //Set the value of the first question mark to be 6.
//            stmt.setLong(1, 6);
//            //Execute the prepared statement.
//            ResultSet rs = stmt.executeQuery();
//            //Move to the first result.
//            rs.next();
//            //Print out the name and artist of the album.
//            System.out.println("Album name: " + rs.getString("name"));
//            System.out.println("Album artist: " + rs.getString("artist"));
//
//        } catch (SQLException e) {
//            throw new RuntimeException("Sorry, something went wrong...");
//        }

        try {
            //Make DB Connection
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());

            String insertSQL = "INSERT INTO albums (artist_name, record_name, release_year, record_sales, record_genre) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(insertSQL, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, "Lil' Wayne");
            statement.setString(2, "The Carter III");
            statement.setInt(3, 2008);
            statement.setDouble(4, 3.97);
            statement.setString(5, "Rap");

            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            rs.next();

            System.out.println(rs.getLong(1));

        } catch (SQLException e) {
            throw new RuntimeException("Sorry, something went wrong...");
        }
    }
}
