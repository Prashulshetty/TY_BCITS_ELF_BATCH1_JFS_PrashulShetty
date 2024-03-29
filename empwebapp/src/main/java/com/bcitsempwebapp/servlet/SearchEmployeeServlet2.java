package com.bcitsempwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax


.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcits.empwebapp.beans.EmployeePrimaryInfo;

@WebServlet("/findEmployee")
public class SearchEmployeeServlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emsPersistenceUnit");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EmployeePrimaryInfo employeePrimaryInfo = manager.find(EmployeePrimaryInfo.class, empId);

		
		
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		if (employeePrimaryInfo != null) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:green'>Employee ID" + empId + "found -<h1>");
			out.println("name =" + employeePrimaryInfo.getEmp_name());
			out.println("<br> Designation = " + employeePrimaryInfo.getDesignation());
			out.println("<br> salary = " + employeePrimaryInfo.getSalary());
			out.println("</body>");
			out.println("</html>");

		} else {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:red'>Employee ID" + empId + " not found -<h1>");

			
			out.println("</body>");
			out.println("</html>");
		}
		manager.close();
		entityManagerFactory.close();

	}

}
