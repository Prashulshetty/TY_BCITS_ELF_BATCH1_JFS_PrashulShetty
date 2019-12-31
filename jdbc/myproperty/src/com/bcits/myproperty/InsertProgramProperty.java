package com.bcits.myproperty;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class InsertProgramProperty {
	public static void main(String[] args) {

		Connection con = null;
		ResultSet rs = null;
		Statement stmt = null;

		try {

			FileInputStream inputStream = new FileInputStream("dbinfo.properties");
			Properties properties = new Properties();
			properties.load(inputStream);
			Class.forName(properties.getProperty("drivername")).newInstance();
			// String dburl = properties.getProperty("dbURl");
			// con = DriverManager.getConnection(dburl);
			con = DriverManager.getConnection(properties.getProperty("dbURL"), properties.getProperty("user"),
					properties.getProperty("password"));

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
