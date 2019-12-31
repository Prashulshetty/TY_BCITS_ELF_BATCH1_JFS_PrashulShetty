package com.bcits.jdbcapp.common;

import java.io.FileInputStream;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MySecondjdbcProgram {

	public static void main(String[] args) {
		Connection con = null;
		int rs = 0;
		Statement stmt = null;

		// load the driver
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dburl = "jdbc:mysql://localhost:3306/employee_management_info";
			FileInputStream file = new FileInputStream("db.properties");
			Properties prop = new Properties();
			prop.load(file);
			con = DriverManager.getConnection(dburl, prop);

			String query = "insert into employee_primary_info " + " values(500,'dhoni',8881704387,'dhoni@gmail.com',"
					+ "'1980-01-24','2019-02-11','Developer','O+',25000,10,40)";
			stmt = con.createStatement();
			rs = stmt.executeUpdate(query);
			System.out.println("number of rows affected " + rs);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
