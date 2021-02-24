package jdbcdemo;

import java.sql.*;
 
public class insert {
 
    public static void main(String[] args) throws SQLException {
 
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String password = "rootroot";
 
        Connection myConn = null;
        Statement myStmt = null;
 
        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection(url, user, password);
 
            // 2. Create a statement
            myStmt = myConn.createStatement();
 
            // 3. Execute SQL query
            String sql = "insert into REGISTRATION " + " (id, first, last,age)"
                    + " values (2, 'Madan', 'M',10)";
 
            myStmt.executeUpdate(sql);
 
            System.out.println("Insert complete.");
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (myStmt != null) {
                myStmt.close();
            }
 
            if (myConn != null) {
                myConn.close();
            }
        }
    }
}