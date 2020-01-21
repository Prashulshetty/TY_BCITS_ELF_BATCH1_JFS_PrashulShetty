package com.bcits.jpawithhibernatepractice.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernatepractice.ProjectInfo;
import com.bcits.jpawithhibernatepractice.bean.EmployeePrimaryInfo;


public class ManyToManyTest {
	public static void main(String[] args) {

		EntityManager manager = null;
		EntityTransaction transaction = null;

		EmployeePrimaryInfo primary1 = new EmployeePrimaryInfo();
		EmployeePrimaryInfo primary2 = new EmployeePrimaryInfo();

		ProjectInfo info1 = new ProjectInfo();
		ProjectInfo info2 = new ProjectInfo();
		
		ArrayList<ProjectInfo> projectsInfos = new ArrayList<ProjectInfo>();
		
		ArrayList<EmployeePrimaryInfo> primaryInfo = new ArrayList<EmployeePrimaryInfo>();
		
		primaryInfo.add(primary1);
		primaryInfo.add(primary2);
		
		

		info1.setPid(100);
		info1.setProjrctName("Dream!!");
		info1.setTechnologies("java");
		info1.setStartDate(java.sql.Date.valueOf("2010-10-11"));
		info1.setEndDate(java.sql.Date.valueOf("2012-11-11"));
		info1.setLocation("banglore");
		info1.setList(primaryInfo);

	    info2.setPid(57);
		info2.setProjrctName("MYTeam!!");
		info2.setTechnologies("python");
		info2.setStartDate(java.sql.Date.valueOf("2010-10-11"));
		info2.setEndDate(java.sql.Date.valueOf("2012-11-11"));
		info2.setLocation("banglore");
		info2.setList(primaryInfo);

		projectsInfos.add(info1);
		projectsInfos.add(info2);

		primary1.setEmpId(300);
		primary1.setName("Arjun");
		primary1.setMobileNo(900525632L);
		primary1.setMaildId("alluarjun@bcits.com");
		primary1.setBirthDate(java.sql.Date.valueOf("1990-08-25"));
		primary1.setJoiningDate(java.sql.Date.valueOf("2019-02-17"));
		primary1.setDesignation("Developer");
		primary1.setBloodGroup("A+");
		primary1.setSalary(45000);
		primary1.setDeptId(30);
		primary1.setMgrId(10);
		primary1.setProject(projectsInfos);

		primary2.setEmpId(200);
		primary2.setName("karan");
		primary2.setMobileNo(8990085632L);
		primary2.setMaildId("karanarjun@bcits.com");
		primary2.setBirthDate(java.sql.Date.valueOf("1993-11-11"));
		primary2.setJoiningDate(java.sql.Date.valueOf("2018-11-20"));
		primary2.setDesignation("Tester");
		primary2.setBloodGroup("B+");
		primary2.setSalary(25000);
		primary2.setDeptId(20);
		primary2.setMgrId(20);
		primary2.setProject(projectsInfos);

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("primary");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(info);
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
