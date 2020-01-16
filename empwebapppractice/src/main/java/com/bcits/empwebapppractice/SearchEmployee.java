package com.bcits.empwebapppractice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchEmployee extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String EmpIdVal = req.getParameter("EmpId");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html");
		out.println("<body>");
	    out.println("<h1> EmpName = "+ EmpIdVal + " </h1><br>");
	    out.print("Name = dev <br>");
		out.print("age is = 60 <br>");
		out.print("salary = 20000");
		out.println("</body>");
		out.println("</html");
      
		
	}
}
