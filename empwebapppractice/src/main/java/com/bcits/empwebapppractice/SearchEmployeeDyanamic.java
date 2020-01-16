package com.bcits.empwebapppractice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceClient;

import com.bcits.empwebapppractice.bean.EmployeePrimaryInfo;

@WebServlet("/findEmp")
public class SearchEmployeeDyanamic extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
	String empIdVal = req.getParameter("empId");
	int empId = Integer.parseInt(empIdVal);
	
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("searchDetails");
	EntityManager manager = entityManagerFactory.createEntityManager();
	EmployeePrimaryInfo employeePrimaryInfo =  manager.find(EmployeePrimaryInfo.class,empId);
	
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	
	if(employeePrimaryInfo != null) {
		out.println("<html");
		out.println("<body>");
	    out.println("<h1 style='color:green'> Details for EmpId "+ empIdVal + "  is Found </h1><br>");
	    out.print("Name = "+ employeePrimaryInfo.getEmp_name() +"<br>");
	    out.print("Designation = "+ employeePrimaryInfo.getDesignation() +"<br>");
	    out.print("Salary = "+ employeePrimaryInfo.getSalary() +"<br>");
		out.println("</body>");
		out.println("</html");
      
	} else {
		 out.println("<h1 style='color:red'> Details for EmpId "+ empIdVal + "  is not Found </h1><br>");
		
	}
	
	entityManagerFactory.close();
	manager.close();

}
}