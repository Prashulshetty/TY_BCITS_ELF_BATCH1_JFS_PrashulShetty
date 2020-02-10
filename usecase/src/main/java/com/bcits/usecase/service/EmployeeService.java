package com.bcits.usecase.service;

import java.util.Date;
import java.util.List;

import com.bcits.usecase.beans.EmployeeMasterBean;
import com.bcits.usecase.beans.QueryMsgBean;
import com.bcits.usecase.beans.AdminBean;
import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;

public interface EmployeeService {
	public EmployeeMasterBean employeelogin(int empId,String password);
	public AdminBean adminLogin(int adminId,String password);	
	public long numberOfConsumer(String region);
	public boolean addEmp(EmployeeMasterBean employeeBean);
	public List<ConsumerMasterBean> showAllConsumer(String region);
	public boolean addCurrentBill(CurrentBillBean currentBill);
	public List<QueryMsgBean> getQueryList(String region);
	public boolean sendRespond(String rrNumber,String response ,Date date);
}
