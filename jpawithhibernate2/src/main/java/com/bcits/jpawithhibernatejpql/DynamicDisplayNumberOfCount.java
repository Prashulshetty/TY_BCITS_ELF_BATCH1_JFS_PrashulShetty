package com.bcits.jpawithhibernatejpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bcits.jpawithhibernate2app.bean.EmployeePrimaryInfo;

public class DynamicDisplayNumberOfCount {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = factory.createEntityManager();
		String jpql = "select count(*) from EmployeePrimaryInfo";

		Query query = manager.createQuery(jpql);
		query.getSingleResult();

		System.out.println(query.getSingleResult());

		manager.close();

	}// end of main

}// end of class
