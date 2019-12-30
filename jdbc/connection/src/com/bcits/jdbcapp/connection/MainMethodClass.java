package com.bcits.jdbcapp.connection;

public class MainMethodClass {

	public static void main(String[] args) {
		
		//MyInterface con = new ClassB();
		
		String dbUrl = "one";
		
		Connection con = DriverManager.getConnection(dbUrl); // good example for run time example
		con.toString();// example of Inheritance
		con.print();

	}// end of Main

}//End of Class
