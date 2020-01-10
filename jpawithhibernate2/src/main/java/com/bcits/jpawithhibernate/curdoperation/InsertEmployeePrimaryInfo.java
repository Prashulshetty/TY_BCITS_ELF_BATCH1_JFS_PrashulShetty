package com.bcits.jpawithhibernate.curdoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate2app.bean.EmployeePrimaryInfo;

public class InsertEmployeePrimaryInfo {
	public static void main(String[] args) {
		EmployeePrimaryInfo test = new EmployeePrimaryInfo();
		test.setEmp_id(220);
		test.setEmp_name("sunil");
		test.setEmp_mobileno(999222555);
		test.setOfficial_mailid("sunil@gmail.com");
		test.setDate_of_birth(java.sql.Date.valueOf("1997-02-01"));
		test.setDate_of_join(java.sql.Date.valueOf("2019-03-01"));
		test.setDesignation("tester");
		test.setBlood_group("o-");
		test.setSalary(21000);
		test.setDept_id(30);
		test.setManager_id(90);

		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(test);
			System.out.println("record saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}
	}
}
