package com.bcits.usecase.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.MonthlyConsumption;
import com.bcits.usecase.beans.PaymentDetailsBean;
import com.bcits.usecase.dao.CustomerDAO;

@Service
public class CustomerServiceImp implements CustomerService {

	
	@Autowired
	private CustomerDAO dao;

	@Override
	public boolean consumerSignUp(ConsumerMasterBean consumerBean, String confirmPassword) {
		if (consumerBean.getPassword().equals(confirmPassword)) {
			return dao.consumerSignUp(consumerBean);
		}
		return false;
	}

	@Override
	public ConsumerMasterBean consumerLogin(String email, String password) {
		if(email.isEmpty() && password.isEmpty()) {
			return null;
		}
		return dao.consumerLogin(email, password);
	}

	@Override
	public boolean payment(PaymentDetailsBean paymentBean) {

		return false;
	}

	@Override
	public CurrentBillBean generateCurrentBill(String rrNumber) {
		return dao.generateCurrentBill(rrNumber);
	}

	@Override
	public List<CurrentBillBean> showBillHistory(String rrNumber) {

		return null;
	}

	@Override
	public List<MonthlyConsumption> getMonthlyConsumptions(String rrNumber) {

		return dao.getMonthlyConsumptions(rrNumber);
	}

}
