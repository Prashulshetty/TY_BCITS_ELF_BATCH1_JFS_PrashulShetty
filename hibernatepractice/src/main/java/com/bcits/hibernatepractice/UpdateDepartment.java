package com.bcits.hibernatepractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.hibernatepractice.bean.DepartmentInfo;

public class UpdateDepartment {

	public static void main(String[] args) {
		EntityTransaction transaction = null;
		EntityManager manager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			DepartmentInfo info = manager.find(DepartmentInfo.class, 10);
			info.setDept_managerid(100);
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
