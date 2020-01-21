package com.bcits.usecase.login.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bcits.usecase.beans.ConsumerMaster;
import com.bcits.usecase.beans.EmployeeMaster;

@WebServlet("/adminLogin")
public class adminLogin  extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//validation of form data
		int adminId = Integer.parseInt(req.getParameter("adminId"));
		String adminpassword = req.getParameter("adminPassword");
		boolean login ;
		if(( adminpassword.equals("discom")) & (adminId==100)){	
			login =true;
		} else {
			login =false;
		}
		
		/*
		 * EntityManagerFactory factory =
		 * Persistence.createEntityManagerFactory("bcitsPeristenceUnit"); EntityManager
		 * manager = factory.createEntityManager(); String jpql =
		 * "from ConsumerMaster  where empId =:emp and password=:pwd"; Query query =
		 * manager.createQuery(jpql); query.setParameter("emp", userId);
		 * query.setParameter("pwd", userpassword);
		 * 
		 * ConsumerMaster employeeMaster = null; try { employeeMaster = (ConsumerMaster)
		 * query.getSingleResult(); } catch (Exception e) { e.printStackTrace(); }
		 * manager.close(); factory.close();
		 */
		 
	/*	resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if (employeeMaster != null) {
			//validation successful
			//creating the session
*/			
		HttpSession session = req.getSession(true);
			session.setAttribute("msg",login );
			
		/*
		 * //setting maxInactiveInterval session.setMaxInactiveInterval(60);
		 * out.print("<h1> Welcome " + employeeMaster.getName() + "</h1>");
		 * RequestDispatcher dispatcher = req.getRequestDispatcher("./homePage.html");
		 * dispatcher.include(req, resp);
		 * 
		 * } else { out.print("<h1 style='color=red'>Wrong Credentials</h1>");
		 * RequestDispatcher dispatcher = req.getRequestDispatcher("./loginForm.html");
		 * dispatcher.include(req, resp); } out.println("</body>");
		 * out.println("</html>");
		 */
	}// end of post
}// end of class