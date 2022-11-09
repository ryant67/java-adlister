package com.codeup.adlister.dao;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;


public class MySQLUsersDao implements Users {
    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    config.getUrl(), config.getUser(), config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Sorry, error connecting to database...", e);
        }
    }

    @Override
    public User findByUsername(String username) {
        User user = new User();
        if(username.equals(user.getUsername())) {

        }
        return user;
    }

    @Override
    public Long insert(User user) {
        try {

            String insertSQL = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";

            PreparedStatement stmt = connection.prepareStatement(insertSQL, Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();

            rs.next();

            return rs.getLong(1);

        } catch (SQLException e) {
            throw new RuntimeException("Sorry, something went wrong...");
        }
    }
}








