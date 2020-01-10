package com.bcits.jpawithhibernate.curdoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate2app.bean.EmployeePrimaryInfo;

public class DeleteEmployee {

	public static void main(String[] args) {
		EntityTransaction transaction = null;
		EntityManager manager = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			EmployeePrimaryInfo info = manager.find(EmployeePrimaryInfo.class, 220);
			manager.remove(info);
			transaction.commit();
			System.out.println("record deleted");
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();

		}

	}
}
