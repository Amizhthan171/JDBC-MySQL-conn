package jdbcdemo;

import java.sql.*;

public class create {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		
		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "rootroot");
			
			// 2. Create a statement
			myStmt = myConn.createStatement();
			
			String sql = "CREATE TABLE REGISTRATION1 " +
	                   "(id INTEGER not NULL, " +
	                   " first VARCHAR(255), " + 
	                   " last VARCHAR(255), " + 
	                   " age INTEGER, " + 
	                   " PRIMARY KEY ( id ))"; 
			myStmt.executeUpdate(sql);
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
						
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();
			}
		}
	}

}


