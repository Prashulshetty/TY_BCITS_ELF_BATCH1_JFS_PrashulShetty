package com.bcits.jpawithhibernate2;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate2app.bean.Test2;

public class App {
	public static void main(String[] args) {
		Test2 test = new Test2();
		test.setEmp_id(201);
		test.setEmp_name("rajdeep");
		test.setEmp_mobileno(999222333);
		test.setOfficial_mailid("rajdeep@gmail.com");
		test.setDate_of_birth(java.sql.Date.valueOf("1998-02-01"));
		test.setDate_of_join(java.sql.Date.valueOf("2019-02-01"));
		test.setDesignation("tester");
		test.setBlood_group("o+");
		test.setSalary(20000);
		test.setDept_id(20);
		test.setManager_id(90);
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(test);
		System.out.println("record saved");
		transaction.commit();
		manager.close();

	}
}
