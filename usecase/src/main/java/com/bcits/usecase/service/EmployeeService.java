package com.bcits.usecase.service;

import java.util.List;

import com.bcits.usecase.beans.EmployeeMasterBean;
import com.bcits.usecase.beans.AdminBean;

public interface EmployeeService {
	public EmployeeMasterBean employeelogin(int empId,String password);
	public AdminBean adminLogin(int adminId,String password);	
	public long numberOfConsumer(String region);
}
