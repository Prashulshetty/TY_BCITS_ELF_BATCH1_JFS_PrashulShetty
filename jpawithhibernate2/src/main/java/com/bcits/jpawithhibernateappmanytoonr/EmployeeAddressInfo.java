package com.bcits.jpawithhibernateappmanytoonr;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.bcits.jpawithhibernate2app.bean.EmployeePrimaryInfo;

import lombok.Data;
@Data
@Entity
@Table(name="employee_address_info")
public class EmployeeAddressInfo  implements Serializable {
	@EmbeddedId
	private EmployeeAddressPK addressPK;
	
	@Column
	private int HouseNo;
	@Column
	private String address_1;
	@Column
	private String address_2;
	@Column
	private  String landmark;
	@Column
	private  String city;
	@Column
	private long pincode ;
	
	@MapsId("emp_id")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private EmployeePrimaryInfo primary;
	

}
