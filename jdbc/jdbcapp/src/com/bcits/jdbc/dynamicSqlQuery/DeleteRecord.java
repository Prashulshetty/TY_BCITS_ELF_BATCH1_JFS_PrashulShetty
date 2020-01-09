package com.bcits.jdbc.dynamicSqlQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteRecord {

	public static void main(String[] args) {
		Connection con = null;
		int rs = 0;
		PreparedStatement pstmt = null;
		try {

			// load driver
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// get DB connection
			String dburl = "jdbc:mysql://localhost:3306/employee_management_info";
			con = DriverManager.getConnection(dburl, "root", "root");

			// Issue sql query
			String query = " delete from employee_primary_info " + " where emp_id =? ";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			rs = pstmt.executeUpdate();

			// Process the result returned by sql query
			if (rs != 0) {
				System.out.println("Profile Updated");
			} else {
				System.err.println("Employee data is not found in DB");
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			// 5.close all jdbc objects
			try {
				if (con != null) {
					con.close();
				}
				
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}// end of main

}// end of class
