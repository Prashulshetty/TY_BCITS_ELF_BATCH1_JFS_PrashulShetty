package com.bcits.trywithresource;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class TryWithResource implements AutoCloseable{

	public static void main(String[] args) {
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {

			// load driver
			Class.forName("com.mysql.jdbc.Driver");

			// get DB connection
			String dburl = "jdbc:mysql://localhost:3306/employee_management_info";
			con = DriverManager.getConnection(dburl, "root", "root");

			// Issue sql query
			String query = " select * from employee_primary_info " + " where emp_id=? ";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			rs = pstmt.executeQuery();

			// Process the result returned by sql query

			if (rs.next()) {
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
			} else {
				System.err.println("Employee data is not found in DB");
			}

		} catch (Exception e) {

			e.printStackTrace();

		} 

	}// end of main

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}// end of class
