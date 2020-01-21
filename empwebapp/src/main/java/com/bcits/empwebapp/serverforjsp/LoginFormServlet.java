package com.bcits.empwebapp.serverforjsp;

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

import com.bcits.empwebapp.bean.PrimaryInfo;

@WebServlet("/login2")
public class LoginFormServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//validation of form data
		int empId = Integer.parseInt(req.getParameter("empId"));
		String password = req.getParameter("password");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emsPeristenceUnit");
		EntityManager manager = factory.createEntityManager();
		String jpql = "from PrimaryInfo where empId =:emp and password=:pwd";
		Query query = manager.createQuery(jpql);
		query.setParameter("emp", empId);
		query.setParameter("pwd", password);

		PrimaryInfo primaryInfo = null;
		try {
			primaryInfo = (PrimaryInfo) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		factory.close();
	
		if (primaryInfo != null) {
			//validation successful
			//creating the session
			HttpSession session = req.getSession(true);
			session.setAttribute("loggedInEmpInfo", primaryInfo);
			
			
			
 req.getRequestDispatcher("./homePage.jsp").forward(req, resp);
		

		} else {
			//invalid credentials
			req.setAttribute("msg", "Invalid EmpID or passward");
			 req.getRequestDispatcher("./loginForm.jsp").forward(req, resp);
			
		}
		
	}// end of post
}// end of class