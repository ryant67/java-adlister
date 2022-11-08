import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JDBCLec {
    public static void main(String[] args) {
//        List<Album> allAlbums = new ArrayList<>();
//
//        try {
//            //1. Establish Driver and connection objects
//            DriverManager.registerDriver(new Driver());
//            Connection connection = DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
//                "root",
//                "codeup");
//            //2. Create Statement instance
//            Statement stmt = connection.createStatement();
//
//            //.execute(): returns boolean (used for delete)
//            //.executeUpdate(): returns the number of rows affected (used for insert or update)
//            //.executeQuery(): returns a ResultSet object (used for select queries)
//
//            //3. Write query to execute, and set equal to a ResultSet.
//            ResultSet rs = stmt.executeQuery("SELECT * FROM albums");
//
//            //While there are still records found on the next row, continue to move to the next row.
//            while (rs.next()) {
//                //Create an instance of the album object based on the data coming from our DB.
//                Album albumToAdd = new Album(rs.getLong("id"), rs.getString("artist_name"), rs.getString("record_name"));
//                //add the new instance to the list of Album objects
//                allAlbums.add(albumToAdd);
//            }
//
//            for(Album album : allAlbums) {
//                System.out.println(album.getRecord_name());
//            }
//
//            connection.close();
//
//        } catch (SQLException e) {
//            throw new RuntimeException("Sorry, could not connect to database...");
//        }

        try {
            Config config = new Config();

            DriverManager.registerDriver(new Driver());

            Connection connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());

            Statement stmt = connection.createStatement();

            String insertQuery = "INSERT INTO albums(artist_name, record_name, release_year, record_genre, record_sales) VALUES ('Lil Wayne', 'Carter III', 2008, 'Rap', 3.97)";

            //Execute the update.
            stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            //Set ResultSet to the newly Generated Keys(ids)
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()) {
                System.out.println("Inserted a new record! New id: " + rs.getLong(1));
            }
        } catch(SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Sorry, could not connect to database...");
        }

    }
}
