import java.sql.*;

public class Assignment08 {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/dbNameHere";
	
	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "sloan1212";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection conn = null;
		Statement stmt = null;
		//try{
		//STEP 2: Register JDBC driver
		Class.forName("com.mysql.jdbc.Driver");

		//STEP 3: Open a connection
		System.out.println("Connecting to a selected database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		System.out.println("Connected database successfully...");
		//}catch(Exception e) {
			
		//}

	}
}
