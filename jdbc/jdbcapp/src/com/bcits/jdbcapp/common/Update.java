package com.bcits.jdbcapp.common;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Update {

	public static void main(String[] args) {
		Connection con = null;
		int rs = 0;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String dburl = "jdbc:mysql://localhost:3306/employee_management_info";
			FileInputStream instream = new FileInputStream("db.properties");
			Properties prop = new Properties();
			prop.load(instream);
			con = DriverManager.getConnection(dburl, prop);

			String query = " update employee_primary_info " + " set emp_name ='dhoni' where emp_id=10";
			stmt = con.createStatement();
			rs = stmt.executeUpdate(query);
			System.out.println("number of rows affected " + rs);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5.close all jdbc objects
			try {
				if (con != null) {
					con.close();
				}

				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
