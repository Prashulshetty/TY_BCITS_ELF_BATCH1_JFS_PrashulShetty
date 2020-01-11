package com.bcits.hibernatepractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.hibernatepractice.bean.DepartmentInfo;

public class ReattachedDepartment {

	public static void main(String[] args) {
		EntityTransaction transaction = null;
		EntityManager manager = null;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			DepartmentInfo info = manager.getReference(DepartmentInfo.class, 10);
			System.out.println(manager.contains(info));
			manager.detach(info);
			System.out.println(manager.contains(info));
			DepartmentInfo reattached = manager.merge(info);
			reattached.setDept_managerid(20);
			System.out.println("executed");
			// info.setDept_managerid(20);
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
