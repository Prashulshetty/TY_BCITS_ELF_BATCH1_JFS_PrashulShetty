package com.bcits.jdbcapp.common;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class MyFirstjdbcProgram {

	public static void main(String[] args) {
		Connection con = null;
		ResultSet rs = null;
		Statement stmt = null;

		// java.beans.Statement stmt =null;

		try {

			// 1. load the Driver

			/*
			 * Driver driverRef = new Driver(); DriverManager.registerDriver(driverRef);
			 */

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			// 2.Establish the DB connectivity via driver
			// String dburl =
			// "jdbc:mysql://localhost:3306/employee_management_info?user=root&password=root";
			String dburl = "jdbc:mysql://localhost:3306/employee_management_info";
			// con = DriverManager.getConnection(dburl);
			con = DriverManager.getConnection("dburl", "root", "root");
			// DriverManager dref = new DriverManager();

			String query = "select * from employee_primary_info";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				int emp_id = rs.getInt("emp_id");
				String emp_name = rs.getString("emp_name");
				long emp_mobileno = rs.getLong("emp_mobileno");
				String official_mailid = rs.getString("official_mailid");
				Date date_of_birth = rs.getDate("date_of_birth");
				Date date_of_joining = rs.getDate("date_of_join");
				String designation = rs.getString("designation");
				String blood_group = rs.getString("blood_group");
				double salary = rs.getDouble("salary");
				int dept_id = rs.getInt("dept_id");

				int manager_id = rs.getInt("manager_id");
				System.out.println("emp_id ==" + emp_id);
				System.out.println("emp_name == " + emp_name);
				System.out.println("emp_mobile ==" + emp_mobileno);
				System.out.println("official_mailid ==" + official_mailid);
				System.out.println("date of birth ==" + date_of_birth);
				System.out.println("date of joing ==" + date_of_joining);
				System.out.println("designation ==" + designation);
				System.out.println("blood_group==" + blood_group);
				System.out.println("salary==" + salary);
				System.out.println("dept_id==" + dept_id);
				System.out.println("manger_id==" + manager_id);
				System.out.println("===============================================");
			}

		} catch (Exception e) {
			System.out.println("3333333333333333333333333");
			e.printStackTrace();

		} finally {
			// 5.close all jdbc objects
			try {
				if (con != null) {
					con.close();
				}
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}// End of main

}