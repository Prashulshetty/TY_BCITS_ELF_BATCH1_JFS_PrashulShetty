package com.bcits.beans;


import lombok.AllArgsConstructor;
import lombok.Data;
@Data
//@AllArgsConstructor
public class EmployeeBean {

private String name;
private int age; 
private DepartmentBean departmentBean;

private EmployeeBean( ) {
	
}

public EmployeeBean(String name, int age, DepartmentBean departmentBean) {
	super();
	this.name = name;
	this.age = age;
	this.departmentBean = departmentBean;
}

	

}
