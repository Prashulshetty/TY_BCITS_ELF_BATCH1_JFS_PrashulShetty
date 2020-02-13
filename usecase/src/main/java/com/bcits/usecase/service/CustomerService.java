package com.bcits.usecase.service;

import java.util.Date;
import java.util.List;

import com.bcits.usecase.beans.BillHistoryBean;
import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.MonthlyConsumption;
import com.bcits.usecase.beans.QueryMsgBean;


public interface CustomerService {
	public boolean consumerSignUp(ConsumerMasterBean consumerBean,String confirmPassword);
	public ConsumerMasterBean consumerLogin(String email, String password);
	public boolean payment(String rrNumber, Date date, int amount);
	public List<BillHistoryBean> showBillHistory(String rrNumber);
	public List<MonthlyConsumption> getMonthlyConsumptions(String rrNumber);
	public ConsumerMasterBean getCustomer(String rrNumber);
	public CurrentBillBean showCurrentBill(String rrNumber);
	public double getPreviousReading(String rrNumber);
	public List<MonthlyConsumption> getAllBills(String region);
	public List<QueryMsgBean> getResponse(String rrNumber);
	public boolean setQuery(String query, String rrNumber, String region);
	public double totalBill(String region);
	public double collectedBill(String region);
	public boolean getStatus(String rrNumber);
}
