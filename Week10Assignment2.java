/* Write the JDBC codes needed to create a Connection interface using the DriverManager class and the variable DB_URL.  Check whether the connection is successful using 'isAlive(timeout)' method to generate the output, which is either 'true' or 'false'.

Note the following points carefully:
1. Name the connection object as 'conn' only.
2. Use timeout value as 1.*/

import java.sql.*;
import java.util.Scanner;

public class Week10Assignment2 {
    public static void main(String args[]) {
        try {
            Connection conn = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
            // Open a connection and check connection status
            conn = DriverManager.getConnection(DB_URL);

            if (conn.isClosed())// checking connection is closed or not
                System.out.print("false");
            else
                System.out.print("true");
            // Private test case
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            if (s == 7) {
                conn.close(); // CONNECTION CLOSED
                System.out.print(conn.isValid(1));
            }
        } catch (Exception e) {
            System.out.println(e);
        } // Tracing Exception
    }
}