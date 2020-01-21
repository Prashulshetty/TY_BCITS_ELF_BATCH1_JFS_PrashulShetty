package com.bcits.jpawithhibernatepractice.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.bcits.jpawithhibernatepractice.EmployeeBankInfo;
import com.bcits.jpawithhibernatepractice.bean.EmployeePrimaryInfo;

public class UsingPrimarySetBank {
	public static void main(String[] args) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
		EmployeePrimaryInfo primary = new EmployeePrimaryInfo();
		EmployeeBankInfo bankInfo = new EmployeeBankInfo();

		primary.setEmpId(10);
		primary.setName("Prashul");
		primary.setMobileNo(9998886664L);
		primary.setMaildId("prashul@bcits.com");
		primary.setBirthDate(java.sql.Date.valueOf("1990-03-23"));
		primary.setJoiningDate(java.sql.Date.valueOf("2019-09-12"));
		primary.setDesignation("Tester");
		primary.setBloodGroup("AB-");
		primary.setSalary(20000);
		primary.setDeptId(20);
		primary.setMgrId(20);

		bankInfo.setBankName("SBI Bank");
		bankInfo.setBranchName("BTM");
		bankInfo.setAccountNo(55555111945l);
		bankInfo.setIfscCode("SBI0101110");
		//bankInfo.setPrimary(primary);
		primary.setBankInfo(bankInfo);

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("primaryDetails");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			
			manager.persist(primary);
			System.out.println("record saved");
			
			//EmployeePrimaryInfo info =manager.find(EmployeePrimaryInfo.class, 20);
			//	System.out.println(info.getEmpId());
			//	System.out.println(info.getName());
			//	System.out.println(info.getSecondaryInfo().getJobLocation());
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
	}
}
