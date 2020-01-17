package com.bcits.jpawithhibernatepractice.manytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernatepractice.EducationInfo;
import com.bcits.jpawithhibernatepractice.EducationInfoPk;
import com.bcits.jpawithhibernatepractice.bean.EmployeePrimaryInfo;

public class EducationInfoManyToOne {
	public static void main(String[] args) {
		EntityManager manager = null;
		EntityTransaction transaction = null;

		List<EducationInfo> list = new ArrayList<EducationInfo>();

		EducationInfo info1 = new EducationInfo();
		EducationInfo info2 = new EducationInfo();

		EmployeePrimaryInfo primary = new EmployeePrimaryInfo();

		EducationInfoPk pk1 = new EducationInfoPk();
		EducationInfoPk pk2 = new EducationInfoPk();

		primary.setEmpId(101);
		primary.setName("dev");
		primary.setMobileNo(8887672222L);
		primary.setMaildId("dev@bcits.com");
		primary.setBirthDate(java.sql.Date.valueOf("1990-03-15"));
		primary.setJoiningDate(java.sql.Date.valueOf("2019-09-02"));
		primary.setDesignation("Tester");
		primary.setBloodGroup("AB+");
		primary.setSalary(25000);
		primary.setDeptId(20);
		primary.setMgrId(20);

		pk1.setEmpId(101);
		pk1.setEducationType("SSLC");

		info1.setEducation(pk1);
		info1.setCollegeName("GHA");
		info1.setPercentage(88.9);
		info1.setStream("SBK");
		info1.setUniversity("CBSE");
		info1.setYearOfPassout(2019);
		info1.setPrimaryInfo(primary);

		pk2.setEmpId(101);
		pk2.setEducationType("BTECH");

		info2.setEducation(pk2);
		info2.setCollegeName("MIT");
		info2.setPercentage(66.88);
		info2.setStream("EC");
		info2.setUniversity("MAHE");
		info2.setYearOfPassout(2019);
		info2.setPrimaryInfo(primary);

		list.add(info1);
		list.add(info2);

		primary.setEducationInfo(list);

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("primary");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();

			transaction.begin();
			manager.persist(primary);

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
