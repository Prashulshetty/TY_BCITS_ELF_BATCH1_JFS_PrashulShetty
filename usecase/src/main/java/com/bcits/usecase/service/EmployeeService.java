package com.bcits.usecase.service;

import java.util.List;

import com.bcits.usecase.beans.EmployeeMaster;

public interface EmployeeService {
	public EmployeeMaster empauthenticate(int empId,String password);
	public boolean addEmployee(EmployeeMaster bean);
	public boolean deletEmployee(int empId);
	public boolean updateEmployee(EmployeeMaster bean);
	public EmployeeMaster getEmployee(int empId);
	
}
