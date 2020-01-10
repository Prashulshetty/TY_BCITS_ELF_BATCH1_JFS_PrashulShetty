package com.bcits.jpawithhibernate.curdoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate2app.bean.EmployeePrimaryInfo;

public class RetrieveEmployee {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EmployeePrimaryInfo info = manager.getReference(EmployeePrimaryInfo.class, 173);
		// EmployeePrimaryInfo info = manager.find(EmployeePrimaryInfo.class, 173);
		System.out.println(info.getEmp_name());

		System.out.println("Employee Id" + info.getEmp_id());
		System.out.println("Employee name " + info.getEmp_name());
		System.out.println("mobile number" + info.getEmp_mobileno());
		System.out.println("official mail id" + info.getOfficial_mailid());
		System.out.println("Dob" + info.getDate_of_birth());
		System.out.println("DOJ" + info.getDate_of_join());
		System.out.println("designation" + info.getDesignation());
		System.out.println("bloodgroup" + info.getBlood_group());
		System.out.println("salary" + info.getSalary());
		System.out.println("dept_id" + info.getDept_id());
		System.out.println("managerial_ID" + info.getManager_id());

		manager.close();
	}

}
