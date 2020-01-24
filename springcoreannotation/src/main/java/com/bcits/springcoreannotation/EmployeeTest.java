package com.bcits.springcoreannotation;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bcits.springannotation.beans.EmployeeBean;
import com.bcits.springannotation.config.EmployeeConfig;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
	
	((ConfigurableApplicationContext)context).registerShutdownHook();
	
	EmployeeBean employeeBean1 =context.getBean(EmployeeBean.class);
	EmployeeBean employeeBean2 =context.getBean(EmployeeBean.class);
	

	
	System.out.println("enter emp1 Name=");
	employeeBean1.setName(sc.nextLine());
	System.out.println("enter emp1 Age=");
	employeeBean1.setAge(sc.nextInt());
	sc.nextLine();

	System.out.println("enter emp2 Name=");
	employeeBean2.setName(sc.nextLine());
	System.out.println("enter emp2 Age=");
	employeeBean2.setAge(sc.nextInt());
	
	System.out.println("  emp1 Name ="+ employeeBean1.getName());
	System.out.println("  emp1 Age ="+ employeeBean1.getAge());
	System.out.println("  emp2  Name ="+ employeeBean2.getName());
	System.out.println("  emp2 Age ="+ employeeBean2.getAge());
	
	
	}

}
