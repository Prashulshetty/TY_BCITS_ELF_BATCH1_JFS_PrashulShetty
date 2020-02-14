package com.bcits.usecase.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.usecase.beans.BillHistoryBean;
import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.MonthlyConsumption;
import com.bcits.usecase.beans.QueryMsgBean;
import com.bcits.usecase.dao.CustomerDAO;
import com.bcits.usecase.validation.Validation;

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
	} // end of consumerSignUp

	@Override
	public ConsumerMasterBean consumerLogin(String email, String password) {
		if (Validation.isValidEmail(email)) {
			return dao.consumerLogin(email, password);
		} else {
			return null;
		}
	} // end of consumerLogin

	@Override
	public List<BillHistoryBean> showBillHistory(String rrNumber) {
		return dao.showBillHistory(rrNumber);
	} // end of showBillHistory

	@Override
	public List<MonthlyConsumption> getMonthlyConsumptions(String rrNumber) {
		return dao.getMonthlyConsumptions(rrNumber);
	} // end of getMonthlyConsumptions

	@Override
	public boolean payment(String rrNumber, Date date, int amount) {
		return dao.payment(rrNumber, date, amount);
	} // end of payment

	@Override
	public ConsumerMasterBean getCustomer(String rrNumber) {
		return dao.getCustomer(rrNumber);
	} // end of getCustomer

	@Override
	public double getPreviousReading(String rrNumber) {
		return dao.getPreviousReading(rrNumber);
	} // end of getPreviousReading

	@Override
	public CurrentBillBean showCurrentBill(String rrNumber) {
		return dao.showCurrentBill(rrNumber);
	} // end of showCurrentBill

	@Override
	public List<MonthlyConsumption> getAllBills(String region) {
		return dao.getAllBills(region);
	} // end of getAllBills

	@Override
	public List<QueryMsgBean> getResponse(String rrNumber) {
		return dao.getResponse(rrNumber);
	} // end of getResponse

	@Override
	public boolean setQuery(String request, String rrNumber, String region) {
		if (request != null && !request.isEmpty()) {
			return dao.setQuery(request, rrNumber, region);
		}
		return false;
	} // end of setQuery

	@Override
	public double totalBill(String region) {
		return dao.totalBill(region);
	} // end of totalBill

	@Override
	public double collectedBill(String region) {
		return dao.collectedBill(region);
	} // end of collectedBill

	@Override
	public boolean getStatus(String rrNumber) {
		return dao.getStatus(rrNumber);
	} // end of getStatus

} // end of CustomerServiceImp
