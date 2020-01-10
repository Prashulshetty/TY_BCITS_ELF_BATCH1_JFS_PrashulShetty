package com.bcits.jpawithhibernate.curdoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate2app.bean.EmployeePrimaryInfo;

public class UpdateEmployee {

	public static void main(String[] args) {
		EntityTransaction transaction = null;
		EntityManager manager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			EmployeePrimaryInfo info = manager.find(EmployeePrimaryInfo.class, 10);
			info.setSalary(30000);
			transaction.commit();
			System.out.println("record updated");
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}

	}

}
