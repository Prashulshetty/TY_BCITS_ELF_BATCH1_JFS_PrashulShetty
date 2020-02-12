package com.bcits.usecase.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.usecase.beans.EmployeeMasterBean;
import com.bcits.usecase.beans.QueryMsgBean;
import com.bcits.usecase.beans.AdminBean;
import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.dao.EmployeeDAO;



@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeeMasterBean employeelogin(int empId, String password) {
		if(empId<1 && password.isEmpty()) {
			return null;
		}
		return dao.employeeLogin(empId, password);
	}
	

	@Override
	public AdminBean adminLogin(int adminId, String password) {
		return dao.adminLogin(adminId, password);
	}


	@Override
	public long numberOfConsumer(String region) {
		
		return dao.numberOfConsumer(region);
	}


	@Override
	public boolean addEmp(EmployeeMasterBean employeeBean) {

		return dao.addEmp(employeeBean);
	}

	@Override
	public boolean deleteEmp(int empId) {
		
		return dao.deleteEmp(empId);
	}	

	@Override
	public List<ConsumerMasterBean> showAllConsumer(String region) {
		
		return dao.showAllConsumer(region);
	}


	@Override
	public CurrentBillBean addCurrentBill(CurrentBillBean currentBill,String region) {
		if(currentBill != null ) {
			return dao.addCurrentBill(currentBill,region);
		}
		return null;
	}


	@Override
	public List<QueryMsgBean> getQueryList(String region) {
		if (region != null) {
			return dao.getQueryList(region);
		}
		return null;
	}



	@Override
	public boolean sendRespond(String rrNumber, String response, Date date) {
		return dao.sendRespond(rrNumber, response, date);
		}


	@Override
	public boolean updatePassword(String password, String cPassword, int empId) {
		if (password.equals(cPassword)) {
			return dao.updatePassword(password, empId);
		}
		return false;
	}


}
	