package com.bcits.jpawithhibernatejpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bcits.jpawithhibernate2app.bean.EmployeePrimaryInfo;

public class ReadEmployee {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = factory.createEntityManager();
		String jpql = "from EmployeePrimaryInfo";
	
		Query query = manager.createQuery(jpql);
		List<EmployeePrimaryInfo> list = query.getResultList();
		for (EmployeePrimaryInfo employeePrimaryInfo : list) {
			System.out.println("employee_Id......."+employeePrimaryInfo.getEmp_id());
			System.out.println("employee_Name....."+employeePrimaryInfo.getEmp_name());
			System.out.println("employee_MobileNo."+employeePrimaryInfo.getEmp_mobileno());
			System.out.println("official_mailid    " + employeePrimaryInfo.getOfficial_mailid());
			System.out.println("date of birth ==" + employeePrimaryInfo.getDate_of_birth());
			System.out.println("date of joing ==" + employeePrimaryInfo.getDate_of_join());
			System.out.println("designation ==" + employeePrimaryInfo.getDesignation());
			System.out.println("blood_group==" + employeePrimaryInfo.getBlood_group());
			System.out.println("salary==" + employeePrimaryInfo.getSalary());
			System.out.println("dept_id==" + employeePrimaryInfo.getDept_id());
			System.out.println("manger_id==" +employeePrimaryInfo.getManager_id());
			System.out.println("=================================================");
		}
		manager.close();

	}// end of main

}// end of class
