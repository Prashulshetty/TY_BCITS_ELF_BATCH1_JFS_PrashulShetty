package com.bcits.usecase.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "consumer_master")
public class ConsumerMaster implements Serializable {
	@Id
	@Column
	private int rrNUmber;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String password;
	@Column
	private String emailId;
	@Column
	private long phoneNumber;
	@Column
	private String typeOfConsumer;
	@Column
	private String region;
	@Column
	private int houseNumber;
	@Column
	private String area;
	@Column
	private int pincode;
		
	
}
