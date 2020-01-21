package com.bcits.jpawithhibernateassignment;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bcits.jpawithhibernate.bean.EmployeePrimaryInfo;

import lombok.Data;

@Data
@Entity
@Table(name="employee_bank_info")
public class EmployeeBankInfo implements Serializable {
	@Id
	private int empId ; 
	@Column(name = "Account_no")
	private int AccountNo;
	@Column(name = "bank_name")
	private String	bankName ;
	@Column(name = "branch_name")
	private	 String branchName ;
	@Column(name = "IFSC_code")
	private	String IFSCCode;
	
	@MapsId
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="empId")
	private EmployeePrimaryInfo primary;
	
}