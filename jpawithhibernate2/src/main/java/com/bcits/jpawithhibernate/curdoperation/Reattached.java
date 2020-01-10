package com.bcits.jpawithhibernate.curdoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate2app.bean.EmployeePrimaryInfo;

public class Reattached {

	public static void main(String[] args) {
		EntityTransaction transaction = null;
		EntityManager manager = null;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			EmployeePrimaryInfo info = manager.getReference(EmployeePrimaryInfo.class, 10);
			System.out.println(manager.contains(info));
			manager.detach(info);
			System.out.println(manager.contains(info));
		EmployeePrimaryInfo reattached=manager.merge(info);//merge method help us to reattach the ralation
		reattached.setDesignation("tester");
			System.out.println("executed");
			//info.setDesignation("Tester");
			System.out.println("record updated");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}

	}

}
