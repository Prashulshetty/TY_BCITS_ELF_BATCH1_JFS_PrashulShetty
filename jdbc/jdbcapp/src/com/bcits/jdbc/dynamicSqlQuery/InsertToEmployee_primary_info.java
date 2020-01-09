
package com.bcits.jdbc.dynamicSqlQuery;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class InsertToEmployee_primary_info {

	public static void main(String[] args) {
		Connection con = null;
		int rs = 0;
		PreparedStatement pstmt = null;
		try {

			// load driver
			Class.forName("com.mysql.jdbc.Driver");

			// get DB connection
			String dburl = "jdbc:mysql://localhost:3306/employee_management_info";
			con = DriverManager.getConnection(dburl, "root", "root");

			// Issue sql query
			String query = " insert into employee_primary_info values(?,?,?,?,?,?,?,?,?,?,?) ";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, (args[1]));
			pstmt.setLong(3, Long.parseLong(args[2]));
			pstmt.setString(4, (args[3]));
			pstmt.setDate(5,java.sql.Date.valueOf(args[4]));
			pstmt.setDate(6,java.sql.Date.valueOf(args[5]));
			pstmt.setString(7, (args[6]));
			pstmt.setString(8, (args[7]));
			pstmt.setDouble(9,Double.parseDouble(args[8]));
			pstmt.setInt(10,Integer.parseInt(args[9]) );
			pstmt.setInt(11,Integer.parseInt(args[10]) );
			
			rs = pstmt.executeUpdate();

			// Process the result returned by sql query
			if (rs !=0) {
				System.out.println("record inserted");
			} else {
				System.err.println("Employee data already exist");
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
