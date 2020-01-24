package com.bcits.springannotation.beans;

import lombok.Data;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@Data
public class EmployeeBean {
	private String name;
	private int age;
	//@Autowired
	@Autowired(required = false)
	@Qualifier("hr")
	 private DepatmentBean depatmentBean;
	
	 
	 
	/*
	 * @PostConstruct public void init() { System.out.println("Its Init-phase"); }
	 * 
	 * @PreDestroy public void destroy() { System.out.println("Its Destroy-phase");
	 * }
	 */

}
