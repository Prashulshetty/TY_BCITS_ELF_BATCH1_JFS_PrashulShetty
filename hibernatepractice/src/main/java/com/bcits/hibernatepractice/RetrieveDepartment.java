package com.bcits.hibernatepractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bcits.hibernatepractice.bean.DepartmentInfo;

public class RetrieveDepartment {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = entityManagerFactory.createEntityManager();
		DepartmentInfo info = manager.getReference(DepartmentInfo.class, 20);
		// DepartmentInfo info = manager.find(DepartmentInfo.class, 20);
		System.out.println("depatment_id = " + info.getDept_id());
		System.out.println("depatment_name = " + info.getDept_name());
		System.out.println("depatment_managerid = " + info.getDept_managerid());

		manager.close();
	}

}
