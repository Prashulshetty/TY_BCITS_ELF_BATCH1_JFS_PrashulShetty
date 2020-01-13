package com.bcits.jpawithhibernateappmanytoonr;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class EmployeeAddressPK implements Serializable {
	private int emp_id;
	private String address_type;

}
