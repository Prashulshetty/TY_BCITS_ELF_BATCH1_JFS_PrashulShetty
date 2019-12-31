package com.bcits.jdbc.connection;



public class Driver {
	
	public static void main(String[] args) {
	String dburl ="aaa";
	Connection ref =DriverManager.getConnection(dburl);
	System.out.println(ref.toString());
	ref.print();

	}

}
