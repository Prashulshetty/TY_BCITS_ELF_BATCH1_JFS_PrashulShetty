package com.bcits.jpawithhibernatepractice.manytomany;

import java.util.ArrayList;
import java.util.List;

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

		ProjectInfo info1 = new ProjectInfo();
		ProjectInfo info2 = new ProjectInfo();
		
		List<ProjectInfo> projectsInfos = new ArrayList<ProjectInfo>();
		
		List<EmployeePrimaryInfo> primaryInfo = new ArrayList<EmployeePrimaryInfo>();
		
	
		

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

		
		
		projectsInfos.add(info1);
		projectsInfos.add(info2);
		
		primaryInfo.add(primary1);
		primary1.setProject(projectsInfos);

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("primaryDetails");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
		manager.persist(primary1);
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
