package com.bcits.testonetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate.bean.EmployeePrimaryInfo;
import com.bcits.jpawithhibernateassignment.EmployeeBankInfo;


public class InsertBank {
	public static void main(String[] args) {
	EmployeePrimaryInfo primary= new EmployeePrimaryInfo();
	primary.setEmpId(666);
	primary.setEmpName("sunil");
	primary.setEmpMobileno(999222555);
	primary.setOfficialMailid("sunil@gmail.com");
	primary.setDateOfBirth(java.sql.Date.valueOf("1997-02-01"));
	primary.setDateOfJoin(java.sql.Date.valueOf("2019-03-01"));
	primary.setDesignation("tester");
	primary.setBloodGroup("o-");
	primary.setSalary(21000);
	primary.setDeptId(30);
	primary.setManagerId(90);
	
	EmployeeBankInfo bankinfo = new   EmployeeBankInfo();
	 
	 bankinfo.setAccountNo(1122990);
	 bankinfo.setBankName("SBI");
	 bankinfo.setBranchName("Bangalore");
	 bankinfo.setIFSCCode("EFN1212");
	 bankinfo.setPrimary(primary);
	
	 EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			
			manager.persist(bankinfo);
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

	
	
	

