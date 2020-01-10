package com.bcits.jpawithhibernate.curdoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate2app.bean.EmployeePrimaryInfo;

public class FindEmployeeData {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
		EntityManager manager =entityManagerFactory.createEntityManager();
		EmployeePrimaryInfo info=manager.find(EmployeePrimaryInfo.class, 10);
		
		System.out.println("employee_Id.."+info.getEmp_id());
		System.out.println("employee_Name.."+info.getEmp_name());
		System.out.println("employee_MobileNo.."+info.getEmp_mobileno());
		System.out.println("official_mailid ==" + info.getOfficial_mailid());
		System.out.println("date of birth ==" + info.getDate_of_birth());
		System.out.println("date of joing ==" + info.getDate_of_join());
		System.out.println("designation ==" + info.getDesignation());
		System.out.println("blood_group==" + info.getBlood_group());
		System.out.println("salary==" + info.getSalary());
		System.out.println("dept_id==" + info.getDept_id());
		System.out.println("manger_id==" +info.getManager_id());
		
		manager.close();
	}//end main 

}// end class
