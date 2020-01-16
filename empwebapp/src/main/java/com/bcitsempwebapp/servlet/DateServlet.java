package com.bcitsempwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//java code for system current date and time (dynamic)
		Date date =new Date();
		
		ServletConfig config = getServletConfig();
		String myConfigParamVal = config.getInitParameter("servletName");
		
		ServletContext context = getServletContext();
		String myContextParamVal = context.getInitParameter("appName");
		
		
		resp.setContentType("text/html");
		resp.setHeader("refresh", "1");
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Current system date and time is :- "+ date + "</h1>");
		out.println("<h2> servletName =" + myConfigParamVal +"</h2>");
		out.println("<h2> AppName =" +myContextParamVal +"</h2>");
		out.println("</body>");
		out.println("</html>");
		
	}// end of main

}//end of class
