package com.bcits.jpawithhipernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate2app.bean.EmployeePrimaryInfo;
import com.bcits.jpawithhibernateonetoone.EmployeeBankInfo;


public class InsertBankInfo {
	public static void main(String[] args) {
		EmployeePrimaryInfo primary = new EmployeePrimaryInfo();
	
		
		primary.setEmp_id(255);
		primary.setEmp_name("sunil");
		primary.setEmp_mobileno(999222555);
		primary.setOfficial_mailid("sunil@gmail.com");
		primary.setDate_of_birth(java.sql.Date.valueOf("1997-02-01"));
		primary.setDate_of_join(java.sql.Date.valueOf("2019-03-01"));
		primary.setDesignation("tester");
		primary.setBlood_group("o-");
		primary.setSalary(21000);
		primary.setDept_id(30);
		primary.setManager_id(90);
		
		
		
		 EmployeeBankInfo bankinfo = new   EmployeeBankInfo();
		 
		 bankinfo.setAccount_no(1122990);
		 bankinfo.setBank_name("SBI");
		 bankinfo.setBranch_name("Bangalore");
		 bankinfo.setIFSC_code("EFN1212");
		// bankinfo.setPrimary(primary); 
		// primary.
		 
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			//EmployeePrimaryInfo print =	manager.find(EmployeePrimaryInfo.class, 257);
			//manager.persist(bankinfo);
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
