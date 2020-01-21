package com.bcits.empwebapp.serverforjsp;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcits.empwebapp.bean.PrimaryInfo;

@WebServlet("/getEmp")
public class GetEmployeeServlet extends HttpServlet  {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get the form data
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);

		//serach record in db
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emsPeristenceUnit");
		EntityManager manager = factory.createEntityManager();

		PrimaryInfo info = manager.find(PrimaryInfo.class, empId);
		req.setAttribute("empInfo",info);
		
		//send data to jsp
		req.getRequestDispatcher("./searchEmployee.jsp").forward(req, resp);
		
		
        manager.close();
        factory.close();
	}//end of doget

}//end class
