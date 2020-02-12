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
	public boolean deleteEmp(int empId);
	public List<ConsumerMasterBean> showAllConsumer(String region);
	public CurrentBillBean addCurrentBill(CurrentBillBean currentBill,String region);
	public List<QueryMsgBean> getQueryList(String region);
	public boolean sendRespond(String rrNumber,String response ,Date date);
	public boolean updatePassword(String password,String cPassword,int empId);
	
}
