package com.bcits.usecase.service;

import java.util.Date;
import java.util.List;

import com.bcits.usecase.beans.BillHistoryBean;
import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.MonthlyConsumption;
import com.bcits.usecase.beans.PaymentDetailsBean;

public interface CustomerService {
	public boolean consumerSignUp(ConsumerMasterBean consumerBean,String confirmPassword);
	public ConsumerMasterBean consumerLogin(String email, String password);
	public boolean payment(String rrNumber, Date date, int amount);
	public CurrentBillBean generateCurrentBill(String rrNumber);
	public List<BillHistoryBean> showBillHistory(String rrNumber);
	public List<MonthlyConsumption> getMonthlyConsumptions(String rrNumber);
}
