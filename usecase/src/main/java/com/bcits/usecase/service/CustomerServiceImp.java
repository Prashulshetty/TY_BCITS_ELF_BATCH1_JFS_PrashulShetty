package com.bcits.usecase.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.usecase.beans.BillHistoryBean;
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
		if (email.isEmpty() && password.isEmpty()) {
			return null;
		}
		return dao.consumerLogin(email, password);
	}


	@Override
	public List<BillHistoryBean> showBillHistory(String rrNumber) {
		return dao.showBillHistory(rrNumber);

	}

	@Override
	public List<MonthlyConsumption> getMonthlyConsumptions(String rrNumber) {

		return dao.getMonthlyConsumptions(rrNumber);
	}

	@Override
	public boolean payment(String rrNumber, Date date, int amount) {
	
		return dao.payment(rrNumber, date, amount);
	}

	@Override
	public ConsumerMasterBean getCustomer(String rrNumber) {
		
		return dao.getCustomer(rrNumber);
	}

	@Override
	public double getPreviousReading(String rrNumber) {
		
		return dao.getPreviousReading(rrNumber);
	}

	@Override
	public CurrentBillBean showCurrentBill(String rrNumber) {
		return dao.showCurrentBill(rrNumber);
	}

	@Override
	public List<MonthlyConsumption> getAllBills(String region) {
		return dao.getAllBills(region);
	}

	@Override
	public boolean queryMsg(String query, String rrNumber, String region) {
	
		return dao.queryMsg(query, rrNumber, region);
	}

}
