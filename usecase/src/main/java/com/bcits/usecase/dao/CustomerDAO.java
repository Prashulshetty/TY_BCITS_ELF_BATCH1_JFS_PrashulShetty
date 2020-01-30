package com.bcits.usecase.dao;

import java.util.Date;
import java.util.List;

import com.bcits.usecase.beans.BillHistoryBean;
import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.PaymentDetailsBean;

public interface CustomerDAO {
	public boolean consumerSignUp(ConsumerMasterBean consumerBean,String confirmPassword);
	public ConsumerMasterBean consumerLogin(String rrNumber, String password);
	public boolean payment(PaymentDetailsBean paymentBean);
	public CurrentBillBean showCurrentBill(String rrNumber,Date date);
	public List<CurrentBillBean> showBillHistory(String rrNumber);
}

