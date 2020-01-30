package com.bcits.usecase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.usecase.beans.EmployeeMasterBean;
import com.bcits.usecase.dao.EmployeeDAO;



@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeeMasterBean empauthenticate(int empId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
	