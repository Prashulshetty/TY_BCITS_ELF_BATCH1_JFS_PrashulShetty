package com.bcits.tarifflogic;

public class ConsumerDetails {

	private String consumerName;
	private int consumerId;
	private String typeOfConsumer;
	private double bill;

	public ConsumerDetails(String consumerName, int consumerId, String typeOfConsumer, double bill) {
		super();
		this.consumerName = consumerName;
		this.consumerId = consumerId;
		this.typeOfConsumer = typeOfConsumer;
		this.bill = bill;
	}

	public String getConsumerName() {
		return consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public int getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(int consumerId) {
		this.consumerId = consumerId;
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
		return "ConsumerDetails [consumerName=" + consumerName + ", consumerId=" + consumerId + ", typeOfConsumer="
				+ typeOfConsumer + ", bill=" + bill + "]";
	}

}
