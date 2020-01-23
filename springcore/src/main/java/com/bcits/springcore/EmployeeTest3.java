package com.bcits.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bcits.beans.EmployeeBean;

public class EmployeeTest3 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml");
		
		 EmployeeBean  employeeBean =context.getBean("employee", EmployeeBean.class );
		 System.out.println("Name "+employeeBean.getName()  );
		 System.out.println("Age "+employeeBean.getAge()  );
		 System.out.println("Deptid "+employeeBean.getDepartmentBean().getDeptid()  );
		 System.out.println("DeptName "+employeeBean.getDepartmentBean().getDeptName()  );
	}

}
