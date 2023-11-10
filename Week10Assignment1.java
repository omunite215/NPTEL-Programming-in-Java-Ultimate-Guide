
/* The following code needs some package to work properly. Write appropriate code to import the required package(s) in order to make the program compile and execute successfully.*/
// Import required packages
import java.sql.*;

public class Week10Assignment1 {
    public static void main(String args[]) {
        try {
            Connection conn = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            // JDBC Codes in the hidden section

            // Open a connection
            conn = DriverManager.getConnection(DB_URL);
            System.out.print(conn.isValid(1));
            conn.close();

            // JDBC Codes in the visible section

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}