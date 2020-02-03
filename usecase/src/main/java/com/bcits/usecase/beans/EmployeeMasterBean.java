package com.bcits.usecase.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name="employee_master")
public class EmployeeMasterBean implements Serializable {
	
	@Id
	@Column
	private Integer  empId;
	@Column
	private String empName;
	@Column
	private String designation;
	@Column
	private String region;
	@Column
	private String password;
	
	
}
