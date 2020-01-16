package com.bcitsempwebapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//String url="./currentDate";
		//String url ="https://www.youtube.com"; //  can't external resource
		
		String url ="./date.html";  // to internal resource(dynamic)
		
		//String url ="http://localhost:8080/empwebapp/addEmployee.html";  // to internal resource(static)
		RequestDispatcher requestDispatcher =req.getRequestDispatcher(url);
		 requestDispatcher.forward(req, resp);
	}

}
