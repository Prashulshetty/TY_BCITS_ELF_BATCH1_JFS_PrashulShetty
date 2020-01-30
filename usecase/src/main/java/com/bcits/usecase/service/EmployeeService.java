package com.bcits.usecase.service;

import java.util.List;

import com.bcits.usecase.beans.EmployeeMasterBean;

public interface EmployeeService {
	public EmployeeMasterBean empauthenticate(int empId,String password);
	
	
}
