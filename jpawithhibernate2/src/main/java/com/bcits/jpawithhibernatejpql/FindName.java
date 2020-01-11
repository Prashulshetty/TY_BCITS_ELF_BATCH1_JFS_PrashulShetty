package com.bcits.jpawithhibernatejpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bcits.jpawithhibernate2app.bean.EmployeePrimaryInfo;

public class FindName {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = factory.createEntityManager();
		String jpql = "select emp_name from EmployeePrimaryInfo";
	
		Query query = manager.createQuery(jpql);
		List<String> list = query.getResultList();
		for (String employeePrimaryInfo : list) {
			System.out.println(employeePrimaryInfo);
			
		}
			
		
		manager.close();

	}// end of main

}// end of class

