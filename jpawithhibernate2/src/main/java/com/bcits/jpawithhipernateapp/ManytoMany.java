package com.bcits.jpawithhipernateapp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate2app.bean.EmployeePrimaryInfo;
import com.bcits.jpawithhibernateonetoone.EmployeeSecondaryInfo;
import com.bcits.manytomany.ProjectInfo;

public class ManytoMany {
	public static void main(String[] args) {
		EmployeePrimaryInfo primary = new EmployeePrimaryInfo();
		EmployeePrimaryInfo primary2 = new EmployeePrimaryInfo();
		ArrayList<EmployeePrimaryInfo> alEmployeePrimaryInfos=new ArrayList<EmployeePrimaryInfo>();
		ArrayList<ProjectInfo> alProjectInfo=new ArrayList<ProjectInfo>();
		ProjectInfo projectinfo=new ProjectInfo();
		ProjectInfo projectinfo1=new ProjectInfo();
		
		primary.setEmp_id(687);
		primary.setEmp_name("Ram");
		primary.setEmp_mobileno(999222555);
		primary.setOfficial_mailid("ram@gmail.com");
		primary.setDate_of_birth(java.sql.Date.valueOf("1997-02-01"));
		primary.setDate_of_join(java.sql.Date.valueOf("2019-03-01"));
		primary.setDesignation("tester");
		primary.setBlood_group("o-");
		primary.setSalary(21000);
		primary.setDept_id(30);
		primary.setManager_id(90);
		
		
		primary2.setEmp_id(787);
		primary2.setEmp_name("Dev");
		primary2.setEmp_mobileno(999222444);
		primary2.setOfficial_mailid("dev@gmail.com");
		primary2.setDate_of_birth(java.sql.Date.valueOf("1997-02-01"));
		primary2.setDate_of_join(java.sql.Date.valueOf("2019-03-01"));
		primary2.setDesignation("developer");
		primary2.setBlood_group("o+");
		primary2.setSalary(21000);
		primary2.setDept_id(40);
		primary2.setManager_id(50);
		alEmployeePrimaryInfos.add(primary2);
		
		projectinfo.setProject_id(101);
		projectinfo.setProject_name("jdbc");
		projectinfo.setTechnology("jpawithhibernate");
		projectinfo.setStart_date(java.sql.Date.valueOf("2019-12-08"));
		projectinfo.setEnd_date(java.sql.Date.valueOf("2020-12-08"));
		projectinfo.setPrimary(alEmployeePrimaryInfos);
		
		projectinfo1.setProject_id(107);
		projectinfo1.setProject_name("j2ee");
		projectinfo1.setTechnology("jpawithhibernate");
		projectinfo1.setStart_date(java.sql.Date.valueOf("2019-12-08"));
		projectinfo1.setEnd_date(java.sql.Date.valueOf("2020-12-08"));
		projectinfo1.setPrimary(alEmployeePrimaryInfos);
		
		alProjectInfo.add(projectinfo);
		alProjectInfo.add(projectinfo1);


		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();

			 manager.persist(projectinfo1);
		
			 
		

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
