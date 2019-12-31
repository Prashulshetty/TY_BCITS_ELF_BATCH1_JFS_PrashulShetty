package com.bcits.jdbc.connection;

public class DriverManager {
	int num;
	private DriverManager() {}
	
	public DriverManager(int num) {
		this.num=num;
	}
	
	public static Connection getConnection(String str) {
		// some business logic
		Connection con = null;
		if (str.equals("one")) {
			con = new ClassA();
		} else {
			con = new ClassB();
		}
		return con;
	}// end of myMethod

}
