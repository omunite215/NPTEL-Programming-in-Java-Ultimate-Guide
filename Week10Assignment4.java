/* Complete the code segment to create a new table named �PLAYERS� in SQL database using the following information.

Column

UID

First_Name

Last_Name

Age

Type

Integer

Varchar (45)

Varchar (45)

Integer*/

import java.sql.*;

public class Week10Assignment4 {
    public static void main(String args[]) {
        try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            // Open a connection
            conn = DriverManager.getConnection(DB_URL);
            stmt = conn.createStatement();
            // The statement containing SQL command to create table "players"
            String CREATE_TABLE_SQL = "CREATE TABLE players (UID INT, First_Name VARCHAR(45), Last_Name VARCHAR(45), Age INT);";

            // Execute the statement containing SQL command below this comment
            stmt.executeUpdate(CREATE_TABLE_SQL);
            ResultSet rs = stmt.executeQuery("SELECT * FROM players;");
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("No. of columns : " + rsmd.getColumnCount());
            System.out.println("Column 1 Name: " + rsmd.getColumnName(1));
            System.out.println("Column 1 Type : " + rsmd.getColumnTypeName(1));
            System.out.println("Column 2 Name: " + rsmd.getColumnName(2));
            System.out.println("Column 2 Type : " + rsmd.getColumnTypeName(2));
            System.out.println("Column 3 Name: " + rsmd.getColumnName(3));
            System.out.println("Column 3 Type : " + rsmd.getColumnTypeName(3));
            System.out.println("Column 4 Name: " + rsmd.getColumnName(4));
            System.out.println("Column 5 Type : " + rsmd.getColumnTypeName(4));
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        } // Exception Message
    }
}