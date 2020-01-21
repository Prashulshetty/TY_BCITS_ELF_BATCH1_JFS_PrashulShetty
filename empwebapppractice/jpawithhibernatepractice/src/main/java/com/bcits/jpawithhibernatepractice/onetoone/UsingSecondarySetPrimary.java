package com.bcits.jpawithhibernatepractice.onetoone;




import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernatepractice.EmployeeSecondaryInfo;
import com.bcits.jpawithhibernatepractice.bean.EmployeePrimaryInfo;

public class UsingSecondarySetPrimary {
	public static void main(String[] args) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
		EmployeePrimaryInfo primary = new EmployeePrimaryInfo();
		EmployeeSecondaryInfo secondary = new EmployeeSecondaryInfo();

		primary.setEmpId(110);
		primary.setName("Prashul shetty");
		primary.setMobileNo(9900000008L);
		primary.setMaildId("prashul@bcits.com");
		primary.setBirthDate(java.sql.Date.valueOf("1990-03-23"));
		primary.setJoiningDate(java.sql.Date.valueOf("2019-09-12"));
		primary.setDesignation("Tester");
		primary.setBloodGroup("AB-");
		primary.setSalary(20000);
		primary.setDeptId(20);
		primary.setMgrId(20);

		secondary.setAge(22);
		secondary.setGender("male");
		secondary.setGovtId("ADR119911");
		secondary.setGuardianNname("Shekar");
		secondary.setGuardianContact(998890000);
		secondary.setIsMarried("no");
		secondary.setJobLocation("Banglore");
		secondary.setNationality("Indian");
		secondary.setPersonalEmailId("shetty@gmail.com");
		secondary.setPrimaryInfo(primary);
		//primary.setSecondaryInfo(secondary);


		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("primaryDetails");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(secondary);
			System.out.println("record saved");
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
