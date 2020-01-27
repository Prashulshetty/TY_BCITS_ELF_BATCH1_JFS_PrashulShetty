package com.bcits.springrest.dao;

import java.util.List;

import com.bcits.springrest.bean.EmployeeInfoBean;



public interface EmployeeDAO {
	public EmployeeInfoBean authenticate(int empId,String password);
	public boolean addEmployee(EmployeeInfoBean bean);
	public boolean deletEmployee(int empId);
	public boolean updateEmployee(EmployeeInfoBean bean);
	public EmployeeInfoBean getEmployee(int empId);
	public List<EmployeeInfoBean> getAllEmployee();

}
