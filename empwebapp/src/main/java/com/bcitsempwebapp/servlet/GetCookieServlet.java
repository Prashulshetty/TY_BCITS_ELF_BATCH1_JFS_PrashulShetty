package com.bcitsempwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/getCookie")
public class GetCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie Cookies[] =req.getCookies();
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if(Cookies != null) {
		for (Cookie cookie : Cookies) {
			out.println("<h2>Cookie name = "+cookie.getName());
			out.println("<br>Cookie value = "+cookie.getValue()+"</h2>");
		}
		} else {
			out.println("<h2>Cookie is not present</h2>");
		}
		
		
		out.println("</body>");
		out.println("</html>");
	}

}
