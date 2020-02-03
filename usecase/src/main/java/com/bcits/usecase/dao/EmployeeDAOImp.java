package com.bcits.usecase.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.bcits.usecase.beans.EmployeeMasterBean;
import com.bcits.usecase.beans.AdminBean;
import com.bcits.usecase.login.servlet.AdminLogin;

@Repository
public class EmployeeDAOImp implements EmployeeDAO{

	@PersistenceUnit
	EntityManagerFactory factory ;
	
	@Override
	public EmployeeMasterBean employeeLogin(int empId, String password) {
			EntityManager manager = factory.createEntityManager();
			EmployeeMasterBean empInfo = manager.find(EmployeeMasterBean.class, empId);
			if(empInfo != null && empInfo.getPassword().equals(password)) {
				return empInfo;
			}
			return null;

	}

	@Override
	public AdminBean adminLogin(int adminId, String password) {
		EntityManager manager = factory.createEntityManager();
		AdminBean adminInfo = manager.find(AdminBean.class, adminId);
		if(adminInfo != null && adminInfo.getPassword().equals(password)) {
			return adminInfo;
		}
		return null;
	}

}
