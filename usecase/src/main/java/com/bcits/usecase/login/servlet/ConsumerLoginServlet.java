package com.bcits.usecase.login.servlet;
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bcits.usecase.beans.ConsumerMasterBean;



@WebServlet("/ConsumerLoginServlet")
public class ConsumerLoginServlet extends  HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
int consumerIdVal = Integer.parseInt(req.getParameter("consumerId"));
String password = req.getParameter("password");

EntityManagerFactory emf = Persistence.createEntityManagerFactory("usecasePersistenceUnit");
EntityManager manager = emf.createEntityManager();

String jpql = " from ConsumerMaster where consumerId= :cId and password = :psw ";
Query query = manager.createQuery(jpql);
query.setParameter("cId", consumerIdVal);
query.setParameter("psw", password);

ConsumerMasterBean consumerInfo = null;
try {
consumerInfo = (ConsumerMasterBean) query.getSingleResult();
} catch (Exception e) {
e.printStackTrace();
}

if (consumerInfo != null) {
// valid credentials
// Create a session
HttpSession session = req.getSession(true);
session.setAttribute("empInfo", consumerInfo);
req.getRequestDispatcher("./homePage.jsp").forward(req, resp);
} else {
// Invalid credential
req.setAttribute("msg", "Invalid Employee ID / Password ..!");
req.getRequestDispatcher("./loginForm.jsp").forward(req, resp);
}
}

}