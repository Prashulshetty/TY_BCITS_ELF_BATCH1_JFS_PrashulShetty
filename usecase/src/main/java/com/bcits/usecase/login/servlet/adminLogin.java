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

import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.EmployeeMasterBean;

@WebServlet("/adminLogin")
public class AdminLogin  extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//validation of form data
		
		int adminId = Integer.parseInt(req.getParameter("adminId"));
		String adminpassword = req.getParameter("adminPassword");
		if(( adminpassword.equals("discom")) & (adminId == 100)) {	
			 
			//creating the session
			//HttpSession session = req.getSession(true);
			req.getRequestDispatcher("./addEmployees").include(req, resp);
		} else {
			req.setAttribute("msg", "Invalid EmpID or passward");
			 req.getRequestDispatcher("./addEmployees").forward(req, resp);
	
		}

	}// end of post
}// end of class