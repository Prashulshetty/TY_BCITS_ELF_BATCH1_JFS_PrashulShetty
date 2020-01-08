package com.bcits.jdbc.abstrction;

public class MianMethod {

	public static void main(String[] args) {
		String dburl = "one";
		Connection con =DriverManager.getConnection(dburl);
		Statement stmt =con.createStatement();
		stmt.methods1();

	}//end of main

}//end of class
