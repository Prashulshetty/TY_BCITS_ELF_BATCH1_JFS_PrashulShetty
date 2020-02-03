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
public class ConsumerMasterBean implements Serializable {
	
	@Id
	@Column(name = "rr_number")
	private String rrNumber;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column
	private String email;
	@Column(name = "phone_number")
	private long phoneNumber;
	@Column(name = "type_of_consumer")
	private String typeOfConsumer;
	@Column
	private String region;
	@Column
	private String password;
	@Column(name="house_number")
	private String houseNumber;
	@Column
	private String area;
	@Column
	private String pincode;
}
