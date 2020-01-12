package com.bcits.jpawithhipernateapp;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate2app.bean.EmployeePrimaryInfo;
import com.bcits.jpawithhibernateonetoone.EmployeeSecondaryInfo;

public class TestOneToOne {
	public static void main(String[] args) {
		EmployeePrimaryInfo primary = new EmployeePrimaryInfo();
	
		
		primary.setEmp_id(253);
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
		
		 EmployeeSecondaryInfo secondary = new  EmployeeSecondaryInfo();
		 secondary.setPersonal_mailid("abc@gamil");
		 secondary.setGender("male");
		 secondary.setAge(30);
		 secondary.setNationality("hindu");
		 secondary.setIsmarried("no");
		 secondary.setGovid("adhar");
		 secondary.setGuardian_name("rama");
		 secondary.setGuardian_contact(999222111);
		 secondary.setJob_location("bangalore");
		 secondary.setPrimary(primary);

		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(secondary);
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
