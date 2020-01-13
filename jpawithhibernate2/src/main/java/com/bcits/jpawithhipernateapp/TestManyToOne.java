package com.bcits.jpawithhipernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate2app.bean.EmployeePrimaryInfo;
import com.bcits.jpawithhibernateappmanytoonr.EmployeeAddressInfo;
import com.bcits.jpawithhibernateappmanytoonr.EmployeeAddressPK;
import com.bcits.jpawithhibernateonetoone.EmployeeSecondaryInfo;

public class TestManyToOne {
	public static void main(String[] args) {
		EmployeePrimaryInfo primary = new EmployeePrimaryInfo();

		primary.setEmp_id(800);
		primary.setEmp_name("RajDeep");
		primary.setEmp_mobileno(999222555);
		primary.setOfficial_mailid("rajdeep@gmail.com");
		primary.setDate_of_birth(java.sql.Date.valueOf("1997-02-01"));
		primary.setDate_of_join(java.sql.Date.valueOf("2019-03-01"));
		primary.setDesignation("developer");
		primary.setBlood_group("o-");
		primary.setSalary(21000);
		primary.setDept_id(30);
		primary.setManager_id(90);

		EmployeeAddressPK addressPk = new EmployeeAddressPK();
		addressPk.setEmp_id(700);
		addressPk.setAddress_type("permanent");

		EmployeeAddressInfo addressInfo = new EmployeeAddressInfo();
		addressInfo.setAddressPK(addressPk);
		addressInfo.setHouseNo(1234);
		addressInfo.setAddress_1("Bangal");
		addressInfo.setAddress_2("basavanagudi");
		addressInfo.setCity("bangalore");
		addressInfo.setLandmark("BTm");
		addressInfo.setPincode(5210973);
		addressInfo.setPrimary(primary);

		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();

			// manager.persist(primary);
			// EmployeeSecondaryInfo print = manager.find(EmployeeSecondaryInfo.class, 257);
			
			// System.out.println(print.getPrimary().getEmp_name());
			EmployeePrimaryInfo pr = manager.find(EmployeePrimaryInfo.class, 800);
			System.out.println( pr.getAddressInfo().get(0).getAddress_1());
		//	addressInfo.setPrimary(pr);
			//manager.persist(addressInfo);
         
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
