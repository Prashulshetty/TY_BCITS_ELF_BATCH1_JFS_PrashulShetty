package com.bcitsempwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchEmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empIdval = req.getParameter("empId");
		resp.setContentType("html/test");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Empp ID:- "+ empIdval + "</h1>");
		out.print("Name = dev");
		out.print("age is = 60");
		out.print("salary = 20000");
		out.println("</body>");
		out.println("</html>");
	}

}//end of class
