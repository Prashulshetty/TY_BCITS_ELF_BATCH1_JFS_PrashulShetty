package com.bcits.usecase.dao;

import com.bcits.usecase.beans.EmployeeMasterBean;
import com.bcits.usecase.beans.AdminBean;

public interface EmployeeDAO {
	public EmployeeMasterBean employeeLogin(int empId, String password);
	public AdminBean adminLogin(int adminId, String password);
	public long numberOfConsumer(String region);

}
