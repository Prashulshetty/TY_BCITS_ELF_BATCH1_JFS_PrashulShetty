package com.bcitsempwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcits.empwebapp.beans.EmployeePrimary;

@WebServlet("/deleteEmployee")
public class deleteEmployee extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emsPersistenceUnit");
		EntityManager manager = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeePrimary employeePrimaryInfo = manager.find(EmployeePrimary.class, empId);

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		if (employeePrimaryInfo == null) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:red'>Employee details for empId " + empId + " not found -<h1>");
			out.println("</body>");
			out.println("</html>");
		} else {
			manager.remove(employeePrimaryInfo);
			transaction.commit();

			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:red'>Employee record for " + empId + " is deleted -<h1>");
			out.println("</body>");
			out.println("</html>");
		}
		manager.close();
		entityManagerFactory.close();

	}

}
