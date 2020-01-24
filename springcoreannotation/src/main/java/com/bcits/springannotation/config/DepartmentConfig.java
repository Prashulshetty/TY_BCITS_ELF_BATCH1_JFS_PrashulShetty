package com.bcits.springannotation.config;

import org.springframework.context.annotation.Bean;

import com.bcits.springannotation.beans.DepatmentBean;

public class DepartmentConfig {
	@Bean(name="sd")
	public DepatmentBean getDepatmentBeanSd() {
		DepatmentBean  depatmentBean =new  DepatmentBean();
		depatmentBean.setDeptid(10);
		depatmentBean.setDeptName("sd"); 
		 return depatmentBean ;
	}
	
	@Bean(name="hr")
	public DepatmentBean getDepatmentBeanHr() {
		DepatmentBean  depatmentBean =new  DepatmentBean();
		depatmentBean.setDeptid(20);
		depatmentBean.setDeptName("hr"); 
		 return depatmentBean ;
	}
	
	@Bean(name="ts")
	public DepatmentBean getDepatmentBeanTs() {
		DepatmentBean  depatmentBean =new  DepatmentBean();
		depatmentBean.setDeptid(30);
		depatmentBean.setDeptName("ts"); 
		 return depatmentBean ;
	}
	

}
