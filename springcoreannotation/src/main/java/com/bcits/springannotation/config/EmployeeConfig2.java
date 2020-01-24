package com.bcits.springannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import com.bcits.springannotation.beans.DepatmentBean;
import com.bcits.springannotation.beans.EmployeeBean;


@Import(DepartmentConfig.class)
@Configuration
public class EmployeeConfig2 {
	@Bean
	public EmployeeBean getEmployeeBean() {
		 EmployeeBean  employeeBean =new  EmployeeBean();
		 employeeBean.setName("dev"); 
		 employeeBean.setAge(22); 
		// employeeBean.setDepatmentBean(getDepatmentBean());
		 
		 return employeeBean ;
	}
	
	//auto wire
	/*
	 * @Bean public DepatmentBean getDepatmentBean() { DepatmentBean depatmentBean
	 * =new DepatmentBean(); depatmentBean.setDeptid(10);
	 * depatmentBean.setDeptName("sd"); return depatmentBean ;
	 */
	
	
	//auto wire with primary
	/*
	 * @Bean public DepatmentBean getDepatmentBeanSd() { DepatmentBean depatmentBean
	 * =new DepatmentBean(); depatmentBean.setDeptid(10);
	 * depatmentBean.setDeptName("sd"); return depatmentBean ; }
	 * 
	 * @Bean public DepatmentBean getDepatmentBeanHr() { DepatmentBean depatmentBean
	 * =new DepatmentBean(); depatmentBean.setDeptid(20);
	 * depatmentBean.setDeptName("hr"); return depatmentBean ; }
	 * 
	 * @Bean
	 * 
	 * @Primary public DepatmentBean getDepatmentBeanTs() { DepatmentBean
	 * depatmentBean =new DepatmentBean(); depatmentBean.setDeptid(30);
	 * depatmentBean.setDeptName("ts"); return depatmentBean ; }
	 */
	/*
	 * @Bean(name="sd") public DepatmentBean getDepatmentBeanSd() { DepatmentBean
	 * depatmentBean =new DepatmentBean(); depatmentBean.setDeptid(10);
	 * depatmentBean.setDeptName("sd"); return depatmentBean ; }
	 * 
	 * @Bean(name="hr") public DepatmentBean getDepatmentBeanHr() { DepatmentBean
	 * depatmentBean =new DepatmentBean(); depatmentBean.setDeptid(20);
	 * depatmentBean.setDeptName("hr"); return depatmentBean ; }
	 * 
	 * @Bean(name="ts") public DepatmentBean getDepatmentBeanTs() { DepatmentBean
	 * depatmentBean =new DepatmentBean(); depatmentBean.setDeptid(30);
	 * depatmentBean.setDeptName("ts"); return depatmentBean ; }
	 * 
	 * 
	 */
}
