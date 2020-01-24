package com.bcits.springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bcits.springannotation.beans.EmployeeBean;
import com.bcits.springannotation.config.EmployeeConfig2;

public class EmployeeTest2 {
	public static void main(String[] args) {
		
	
	ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig2.class);
	EmployeeBean employeeBean1 =context.getBean(EmployeeBean.class);
	
	System.out.println("   Name     = "+ employeeBean1.getName());
	System.out.println("   Age      = "+ employeeBean1.getAge());
	System.out.println("   deptId   = "+ employeeBean1.getDepatmentBean().getDeptid());
	System.out.println("   deptname = "+ employeeBean1.getDepatmentBean().getDeptName());
	
}
}