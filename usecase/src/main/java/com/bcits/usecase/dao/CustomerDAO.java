package com.bcits.usecase.dao;

import java.util.Date;
import java.util.List;
import com.bcits.usecase.beans.BillHistoryBean;
import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.MonthlyConsumption;
import com.bcits.usecase.beans.QueryMsgBean;

public interface CustomerDAO {	
	public boolean consumerSignUp(ConsumerMasterBean consumerBean);
	public ConsumerMasterBean consumerLogin(String email, String password);
	public boolean payment(String rrNumber, Date date, int amount);
	public CurrentBillBean showCurrentBill(String rrNumber);
	public List<BillHistoryBean> showBillHistory(String rrNumber);
	public List<MonthlyConsumption> getMonthlyConsumptions(String rrNumber);
	public ConsumerMasterBean getCustomer(String rrNumber);
	public double getPreviousReading(String rrNumber);
	public boolean getStatus(String rrNumber);
	public List<MonthlyConsumption> getAllBills(String region);
	public List<QueryMsgBean> getResponse(String rrNumber);
	public boolean setQuery(String request, String rrNumber, String region);
	public double totalBill(String region);
	public double collectedBill(String region);
	
} // end of CustomerDAO


