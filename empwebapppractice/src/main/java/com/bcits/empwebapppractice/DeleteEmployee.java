package com.bcits.empwebapppractice;

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
import javax.xml.ws.WebServiceClient;

import com.bcits.empwebapppractice.bean.EmployeePrimaryInfo;

@WebServlet("/deleteEmp")
public class DeleteEmployee extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
	String empIdVal = req.getParameter("empId");
	int empId = Integer.parseInt(empIdVal);
	
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("searchDetails");
	EntityManager manager = entityManagerFactory.createEntityManager();
	EmployeePrimaryInfo employeePrimaryInfo =  manager.find(EmployeePrimaryInfo.class,empId);
    EntityTransaction transaction = manager.getTransaction();
    transaction.begin();
    resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
    manager.remove(employeePrimaryInfo);
    out.println("<h1 style='color:red'> record deleted  </h1><br>");
    transaction.commit();

	
	entityManagerFactory.close();
	manager.close();

}
}