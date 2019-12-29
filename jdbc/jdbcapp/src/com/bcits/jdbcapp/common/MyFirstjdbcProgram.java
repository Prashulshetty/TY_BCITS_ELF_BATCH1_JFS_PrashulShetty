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
		Connection con =null;
		ResultSet rs=null;
		Statement stmt = null;
		try {

			// 1. load the Driver

			Driver driverRef = new Driver();
			DriverManager.registerDriver(driverRef);

			// 2.Establish the DB connectivity via driver
			String dburl = "jdbc:mysql://localhost:3306/employee_management_info?user=root&password=root";
			con = DriverManager.getConnection(dburl);
			 
			//
			String query = "select * from employee_primary_info";
			 stmt = con.createStatement();
			 rs = stmt.executeQuery(query);

			while (rs.next()) {
				int employeeid = rs.getInt("empid");
				String employeename = rs.getString("name");
				long employeesmobile = rs.getLong("mobileno");
				String employeemailid = rs.getString("officialmailid");
				Date employeedob = rs.getDate("dateofbirth");
				Date employeedoj = rs.getDate("dateofjoining");
				String empdesignation = rs.getString("designation");
				String empBloodgroup = rs.getString("bloodgroup");
				double empsalary = rs.getDouble("salary");
				int deptid = rs.getInt("deptid");
				int managerid = rs.getInt("managerid");

				System.out.println("employee id ==" + employeeid);
				System.out.println("employeename== " + employeename);
				System.out.println("employee mobile ==" + employeesmobile);
				System.out.println("employee mail id ==" + employeemailid);
				System.out.println("employee dob ==" + employeedob);
				System.out.println("employee doj ==" + employeedoj);
				System.out.println("employeedesignation ==" + empdesignation);
				System.out.println("employeeblood ==" + empBloodgroup);
				System.out.println("empsalary ==" + empsalary);
				System.out.println("deptid ==" + deptid);
				System.out.println("managerid==" + managerid);

			}

		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			// 5.close all jdbc objects
			try {
				if(con!=null) {
				con.close();
				}
				if(rs!=null) {
				rs.close();
				}
				if(stmt!=null) {
				stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}// End of main
}// End of Class
