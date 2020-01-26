package com.bcits.tarifflogic;

import java.util.Date;

public class ConsumerDetails {

	private String consumerName;
	private int rrNumber;
	private String typeOfConsumer;
	private double bill;

	public ConsumerDetails(String consumerName, int rrNumber, String typeOfConsumer, double bill) {
		super();
		this.consumerName = consumerName;
		this.rrNumber = rrNumber;
		this.typeOfConsumer = typeOfConsumer;
		this.bill = bill;
	}

	public String getConsumerName() {
		return consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public int getRrNumber() {
		return rrNumber;
	}

	public void setRrNumber(int rrNumber) {
		this.rrNumber = rrNumber;
	}

	public String getTypeOfConsumer() {
		return typeOfConsumer;
	}

	public void setTypeOfConsumer(String typeOfConsumer) {
		this.typeOfConsumer = typeOfConsumer;
	}

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "ConsumerDetails [consumerName=" + consumerName + ", rrNumber=" + rrNumber + ", typeOfConsumer="
				+ typeOfConsumer + ", bill=" + bill + "]";
	}

}
