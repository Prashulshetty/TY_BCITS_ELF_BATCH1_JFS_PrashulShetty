package com.bcits.usecase.service;

import com.bcits.usecase.beans.ConsumerMaster;

public interface CustomerService {
	public boolean addConsumer(ConsumerMaster conInfoBean , String cnfPassword);
}
