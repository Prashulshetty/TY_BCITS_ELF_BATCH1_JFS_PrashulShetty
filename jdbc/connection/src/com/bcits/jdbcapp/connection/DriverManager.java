package com.bcits.jdbcapp.connection;

public class DriverManager {
	
	private  DriverManager() {}
	
	public static Connection getConnection(String str) {
		//Some Business Logic
		Connection con = null;
		if (str.equals("one")) {
			con = new ClassA();
		} else {
			con = new ClassB();
		}
		return con;

	}// End of myMethod( )

}// End of Class
