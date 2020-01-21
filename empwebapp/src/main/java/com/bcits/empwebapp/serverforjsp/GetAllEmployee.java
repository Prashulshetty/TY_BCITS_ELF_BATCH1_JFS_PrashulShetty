package com.bcits.empwebapp.serverforjsp;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcits.empwebapp.bean.PrimaryInfo;

@WebServlet("/seeAllEmployee")
public class GetAllEmployee extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emsPeristenceUnit");
		EntityManager manager = factory.createEntityManager();	
		
		String jpql = " from PrimaryInfo ";
		Query query =manager.createQuery(jpql);
		
	List <PrimaryInfo> list=query.getResultList();
	req.setAttribute("employeeList",list);
	
	req.getRequestDispatcher("./SeeAllEmployee.jsp").forward(req, resp);
		
	manager.close();
    factory.close();
		}
	
}
