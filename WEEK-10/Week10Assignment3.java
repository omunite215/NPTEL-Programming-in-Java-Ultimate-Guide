/* Due to some mistakes in the below code, the code is not compiled/executable. Modify and debug the JDBC code to make it execute successfully.*/

import java.sql.*;  // All sql classes are imported
import java.lang.*; // Semicolon is added
import java.util.Scanner;
public class Week10Assignment3 {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
          
              // Connection object is created
              conn = DriverManager.getConnection(DB_URL);
              conn.close();
              System.out.print(conn.isClosed());
       }
       catch(Exception e){ System.out.println(e);}  
    }
}