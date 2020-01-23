package com.bcits.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bcits.beans.EmployeeBean;


public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 EmployeeBean  employeeBean =(EmployeeBean )context.getBean("employee1");
		 System.out.println("Name "+employeeBean.getName()  );
		 System.out.println("Age "+employeeBean.getAge()  );
		 
		 EmployeeBean  employeeBean2 =(EmployeeBean )context.getBean("employee2");
		 System.out.println("Name "+employeeBean2.getName()  );
		 System.out.println("Age "+employeeBean2.getAge()  );
	}

}
