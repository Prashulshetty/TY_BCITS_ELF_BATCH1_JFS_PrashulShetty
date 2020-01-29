package com.bcits.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.springrest.bean.EmployeeInfoBean;
import com.bcits.springrest.dao.EmployeeDAO;
import com.bcits.springrest.exception.EmployeeException;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	private EmployeeDAO dao;
	
	@Override
	public boolean deletEmployee(int empId) {
		if(empId<1) {
			return false;
		}
		return dao.deletEmployee(empId);
		
	}

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		return dao.authenticate(empId, password);
		
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean bean) {
		return dao.addEmployee(bean);	
		}

	

	@Override
	public boolean updateEmployee(EmployeeInfoBean bean) {
		
		return dao.updateEmployee(bean);
		}

	@Override
	public EmployeeInfoBean getEmployee(int empId) {
		if(empId<1) {
			//return null;
			throw new EmployeeException("Invalid Id.....");
		}
		EmployeeInfoBean employeeInfoBean =dao.getEmployee(empId);
		if(employeeInfoBean==null) {
			//return null;
			throw new EmployeeException("EmpId not found....");
		}
		return employeeInfoBean;
	}

	@Override
	public List<EmployeeInfoBean> getAllEmployee() {
		return dao.getAllEmployee();
	}

}
