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

import com.bcits.usecase.beans.ConsumerMaster;



@WebServlet("/consumerLogin")
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
		String mobileVal = req.getParameter("Mobile");
		String mailVal = req.getParameter("email");
		
		String designationVal = req.getParameter("password");
		String bloodGroupVal = req.getParameter("cPassword");
		String salaryVal =	req.getParameter("mNumber");
		String deptIdval =	req.getParameter("typeOfConsumer");
		String mgrIdval =	req.getParameter("mgrId");
		String passwordVal=req.getParameter("password");
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date birthDate = null;
		Date joiningDate =null;
		try {
			birthDate = dateFormat.parse(birthDateVal);
			joiningDate = dateFormat.parse(JoinDateVal);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ConsumerMaster info = new ConsumerMaster();
		info.setEmpId(Integer.parseInt(empIdVal));
		info.setName(nameVal);
		info.setMobileNum(Long.parseLong(mobileVal));
		info.setMaildId(mailVal);
		info.setBirthDate(birthDate);
		info.setJoiningDate(joiningDate);
		info.setDesignation(designationVal);
		info.setBloodGroup(bloodGroupVal);
		info.setSalary(Double.parseDouble(salaryVal));
		info.setDeptId(Integer.parseInt(deptIdval));
		info.setMgrId(Integer.parseInt(mgrIdval));
		info.setPassword(passwordVal);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emsPeristenceUnit");
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
