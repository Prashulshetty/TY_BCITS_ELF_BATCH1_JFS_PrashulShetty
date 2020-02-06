package com.bcits.springsecuritymvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bcits.springsecuritymvc.beans.EmpInfoBean;
import com.bcits.springsecuritymvc.dao.EmpDao;
@Service
public class EmpServiceHibernateImpl  implements EmpService{
	
	@Autowired
	private EmpDao dao;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public boolean register(EmpInfoBean empInfoBean) {
		if(empInfoBean !=null) {
			empInfoBean.setPassword(passwordEncoder.encode(empInfoBean.getPassword()));
			return dao.register(empInfoBean);
		}
	
		return false;
	}

	@Override
	public EmpInfoBean getEmployee(int empId) {
		// TODO Auto-generated method stub
		return dao.getEmployee(empId);
	}

	@Override
	public List<EmpInfoBean> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

}
