package com.bcits.usecase.login.servlet;



import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bcits.usecase.beans.ConsumerMasterBean;



@WebServlet("/consumerSignupServlet")
public class ConsumerSignupServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		if (session != null) {
		// Get the data form
		String empIdVal = req.getParameter("fName");
		String nameVal = req.getParameter("lName");
		Long mobileVal = Long.parseLong(req.getParameter("Mobile"));
		String mailVal = req.getParameter("email");
		String passwordVal=req.getParameter("password");
		String mNumberVal = req.getParameter("mNumber")   ;
		String consumertypeVal=req.getParameter("consumertype");
		String regionVal=req.getParameter("region");
	    int houseNoVal=Integer.parseInt(req.getParameter("houseNo"));
	    String areaVal=req.getParameter("area");
	    int pinVal=Integer.parseInt(req.getParameter("pin"));

	

		ConsumerMasterBean info = new ConsumerMasterBean();
		
		info.setArea(areaVal);
		info.setEmailId(mailVal);
		info.setFirstName(empIdVal);
		info.setLastName(nameVal);
		info.setArea(areaVal);
		info.setTypeOfConsumer(consumertypeVal);
		info.setPassword(passwordVal);
		info.setPincode(pinVal);
		info.setRrNumber(mNumberVal);
		info.setHouseNumber(houseNoVal);
		info.setRegion(regionVal);
		
		
		
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("bcitsPeristenceUnit");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isAdded = false;
		try {
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		factory.close();
		
		
		
		
		out.println("<html>");
		out.println("<body>");
		if(isAdded) {
			out.println("<h1> Employee "+empIdVal+" Added Succesfully</h1>");
		}else {
			out.println("<h1 style='color:red'> Employee "+empIdVal+" Already Exist</h1>");
		}
		out.println("</body>");
		out.println("</html>");
		}else {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:red'> Please Login First</h1>");
			out.println("</body>");
			out.println("</html>");

			req.getRequestDispatcher("./loginForm.jsp").include(req, resp);
		}
	}
}
