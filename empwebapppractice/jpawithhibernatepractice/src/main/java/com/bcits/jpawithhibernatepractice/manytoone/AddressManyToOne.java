package com.bcits.jpawithhibernatepractice.manytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernatepractice.EmployeeAddressInfo;
import com.bcits.jpawithhibernatepractice.EmployeeAddressPK;
import com.bcits.jpawithhibernatepractice.bean.EmployeePrimaryInfo;

public class AddressManyToOne {
	public static void main(String[] args) {
		EntityManager manager = null;
		EntityTransaction transaction = null;

		EmployeePrimaryInfo primary = new EmployeePrimaryInfo();

		EmployeeAddressPK addressPK1 = new EmployeeAddressPK();
		EmployeeAddressPK addressPK2 = new EmployeeAddressPK();

		EmployeeAddressInfo addressInfo1 = new EmployeeAddressInfo();
		EmployeeAddressInfo addressInfo2 = new EmployeeAddressInfo();

		primary.setEmpId(204);
		primary.setName("Dev");
		primary.setMobileNo(8989696856L);
		primary.setMaildId("dev@bcits.com");
		primary.setBirthDate(java.sql.Date.valueOf("1996-02-14"));
		primary.setJoiningDate(java.sql.Date.valueOf("2019-10-27"));
		primary.setDesignation("Tester");
		primary.setBloodGroup("B+");
		primary.setSalary(25000);
		primary.setDeptId(40);
		primary.setMgrId(20);

		addressPK1.setEmpId(204);
		addressPK1.setAddressType("local");

		addressInfo1.setAdressPk(addressPK1);
		addressInfo1.setHouseNo("4020");
		addressInfo1.setAddress1("Bellampalli");
		addressInfo1.setAddress2("Atradi");
		addressInfo1.setLandMark("manipal");
		addressInfo1.setCity("udupi");
		addressInfo1.setPincode(587663);
		addressInfo1.setPrimaryInfo(primary);

		addressPK2.setEmpId(204);
		addressPK2.setAddressType("current");

		addressInfo2.setAdressPk(addressPK2);
		addressInfo2.setHouseNo("4020");
		addressInfo2.setAddress1("Tyagaraja Nagar");
		addressInfo2.setAddress2("Vidyapeeta");
		addressInfo2.setLandMark("Basavanagudi");
		addressInfo2.setCity("Banagalore");
		addressInfo2.setPincode(587000);
		addressInfo2.setPrimaryInfo(primary);

		List<EmployeeAddressInfo> list = new ArrayList<EmployeeAddressInfo>();

		list.add(addressInfo1);
		list.add(addressInfo2);

		primary.setAddress(list);
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("primaryDetails");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();

			manager.persist(primary);

			transaction.begin();

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
