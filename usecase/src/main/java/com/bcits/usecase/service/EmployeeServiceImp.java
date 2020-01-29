package com.bcits.usecase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.usecase.beans.EmployeeMaster;
import com.bcits.usecase.dao.EmployeeDAO;



@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeeMaster empauthenticate(int empId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addEmployee(EmployeeMaster bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletEmployee(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployee(EmployeeMaster bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EmployeeMaster getEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}
}
	