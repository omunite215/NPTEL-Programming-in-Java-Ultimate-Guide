/* Write the required code in order to update the following data in the table �PLAYERS�.


Column

UID

First_Name

Last_Name

Age

From

1

Ram

Gopal

26

To

1

Rama

Gopala

24

*/

import java.sql.*;

public class Week11Assignment2 {
    public static void main(String args[]) {
        try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
            String query = "";

            // Open a connection
            conn = DriverManager.getConnection(DB_URL);
            stmt = conn.createStatement();
            // The statement containing SQL command to create table "players"
            String CREATE_TABLE_SQL = "CREATE TABLE players (UID INT, First_Name VARCHAR(45), Last_Name VARCHAR(45), Age INT);";
            // Execute the statement containing SQL command
            stmt.executeUpdate(CREATE_TABLE_SQL);

            query = " insert into PLAYERS (UID, first_name, last_name, age)" + " values (?, ?, ?, ?)";

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, 1);
            preparedStmt.setString(2, "Ram");
            preparedStmt.setString(3, "Gopal");
            preparedStmt.setInt(4, 26);

            preparedStmt.execute();

            preparedStmt.setInt(1, 2);
            preparedStmt.setString(2, "John");
            preparedStmt.setString(3, "Mayer");
            preparedStmt.setInt(4, 22);

            preparedStmt.execute();
            String a = "update players " + "set AGE =24 WHERE UID==1";
            stmt.execute(a);

            String b = "update players " + "set LAST_NAME ='Gopala' WHERE UID==1";
            stmt.execute(b);

            String c = "update players " + "set FIRST_NAME='Rama' WHERE UID==1";
            stmt.execute(c);

            ResultSet rs = stmt.executeQuery("SELECT * FROM players;");
            while (rs.next())
                System.out.println(
                        rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4));
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}