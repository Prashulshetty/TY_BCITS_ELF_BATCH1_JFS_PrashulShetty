package com.bcits.springrest.service;

import java.util.List;

import com.bcits.springrest.bean.EmployeeInfoBean;



public interface EmployeeService {
	public EmployeeInfoBean authenticate(int empId,String password);
	public boolean addEmployee(EmployeeInfoBean bean);
	public boolean deletEmployee(int empId);
	public boolean updateEmployee(EmployeeInfoBean bean);
	public EmployeeInfoBean getEmployee(int empId);
	public List<EmployeeInfoBean> getAllEmployee();
}
