package com.bcits.usecase.dao;

import com.bcits.usecase.beans.EmployeeMasterBean;


import java.util.List;

import com.bcits.usecase.beans.AdminBean;
import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;

public interface EmployeeDAO {
	public EmployeeMasterBean employeeLogin(int empId, String password);
	public AdminBean adminLogin(int adminId, String password);
	public long numberOfConsumer(String region);
	public boolean addEmp(EmployeeMasterBean employeeBean);
	public List<ConsumerMasterBean> showAllConsumer(String region);
	public boolean addCurrentBill(CurrentBillBean currentBill);
}
