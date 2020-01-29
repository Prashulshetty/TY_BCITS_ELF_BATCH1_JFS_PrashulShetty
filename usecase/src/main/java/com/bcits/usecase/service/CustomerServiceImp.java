package com.bcits.usecase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.usecase.beans.ConsumerMaster;
import com.bcits.usecase.dao.CustomerDAO;

@Service
public class CustomerServiceImp implements CustomerService {

	
	@Autowired
	private CustomerDAO dao;

	@Override
	public boolean addConsumer(ConsumerMaster conInfoBean, String cnfPassword) {
		System.out.println(conInfoBean);
		System.out.println(cnfPassword);
		if (!conInfoBean.getPassword().equals(cnfPassword)) {
			return false;
		}
		return dao.addConsumer(conInfoBean);
	}

}
