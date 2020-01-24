package com.bcits.springannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.bcits.springannotation.beans.EmployeeBean;

@Configuration
public class EmployeeConfig {
		@Bean
		@Scope("prototype")
		public EmployeeBean getEmployeeBean() {
		
		
		  EmployeeBean employeeBean =new EmployeeBean();
		/*
		 * employeeBean.setName("Ashin"); employeeBean.setAge(19);
		 */
		 
			return employeeBean ;
		}
	

}
