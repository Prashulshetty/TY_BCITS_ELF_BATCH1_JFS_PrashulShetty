package com.bcits.usecase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.usecase.beans.EmployeeMasterBean;
import com.bcits.usecase.beans.AdminBean;
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
		return null;
	}


	@Override
	public long numberOfConsumer(String region) {
		
		return dao.numberOfConsumer(region);
	}

}
	