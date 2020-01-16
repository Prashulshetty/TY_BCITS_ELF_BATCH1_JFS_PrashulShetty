package com.bcitsempwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcits.empwebapp.beans.EmployeePrimaryInfo;

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empIdVal = req.getParameter("emp_id");
		String empNameVal = req.getParameter("emp_name");
		String DesignationVal = req.getParameter("designation");
		String salaryVal = req.getParameter("salary");
		String emp_mobile_noVal = req.getParameter("emp_mobile_no");
		String passwordVal = req.getParameter("password");
		String dateofbirthVal = req.getParameter("date_of_birth");

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateofbirth1 = null;
		try {
			dateofbirth1 = dateFormat.parse(dateofbirthVal);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		EmployeePrimaryInfo emp = new EmployeePrimaryInfo();
		emp.setEmp_id(Integer.parseInt(empIdVal));
		emp.setEmp_name(empNameVal);
		emp.setDesignation(DesignationVal);
		emp.setSalary(Double.parseDouble(salaryVal));
		emp.setEmp_mobileno(Long.parseLong(emp_mobile_noVal));
		emp.setPassword(passwordVal);
		emp.setDate_of_birth(dateofbirth1);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emsPersistenceUnit");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		boolean isAdded = false;

		try {
			tx.begin();
			manager.persist(emp);
			tx.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		entityManagerFactory.close();
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<body>");

		if (isAdded) {

			out.println("<h1 style='color:green'>Employee Record Inserted-<h1>");

		} else {

			out.println("<h1 style='color:red'>Employee Record is already exist  -<h1>");

		}
		out.println("</body>");
		out.println("</html>");

	}

}
