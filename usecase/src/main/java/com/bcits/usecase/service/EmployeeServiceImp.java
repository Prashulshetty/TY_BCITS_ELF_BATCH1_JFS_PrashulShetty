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
import com.bcits.usecase.validation.Validation;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeeMasterBean employeelogin(int empId, String password) {
		if (empId < 1 && password.isEmpty()) {
			return null;
		} else if (Validation.empIdValid(empId)) {
			return null;
		} else {
			return dao.employeeLogin(empId, password);
		}
	} // end of employeelogin

	@Override
	public AdminBean adminLogin(int adminId, String password) {
		if (adminId < 1 && password.isEmpty()) {
			return null;
		} else if (Validation.empIdValid(adminId)) {
			return null;
		} else {
			return dao.adminLogin(adminId, password);
		}
	} // end of adminLogin

	@Override
	public long numberOfConsumer(String region) {
		return dao.numberOfConsumer(region);
	} // end of numberOfConsumer

	@Override
	public boolean addEmp(EmployeeMasterBean employeeBean) {
		return dao.addEmp(employeeBean);
	} // end of addEmp

	@Override
	public boolean deleteEmp(int empId) {
		return dao.deleteEmp(empId);
	} // end of deleteEmp

	@Override
	public List<ConsumerMasterBean> showAllConsumer(String region) {
		return dao.showAllConsumer(region);
	} // end of showAllConsumer

	@Override
	public CurrentBillBean addCurrentBill(CurrentBillBean currentBill, String region) {
		if (currentBill != null) {
			return dao.addCurrentBill(currentBill, region);
		}
		return null;
	} // end of addCurrentBill

	@Override
	public List<QueryMsgBean> getQueryList(String region) {
		if (region != null) {
			return dao.getQueryList(region);
		}
		return null;
	} // end of getQueryList

	@Override
	public boolean sendRespond(String rrNumber, String response, Date date) {
		return dao.sendRespond(rrNumber, response, date);
	} // end of sendRespond

	@Override
	public boolean updatePassword(String password, String cPassword, int empId) {
		if (password.equals(cPassword)) {
			return dao.updatePassword(password, empId);
		}
		return false;
	} // end of updatePassword

	@Override
	public List<Object[]> getPaidBills(String region) {
		return dao.getPaidBills(region);
	} // end of getPaidBills
	
} // end of EmployeeServiceImp
