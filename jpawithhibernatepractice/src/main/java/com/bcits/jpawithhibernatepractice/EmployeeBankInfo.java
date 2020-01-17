package com.bcits.jpawithhibernatepractice;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bcits.jpawithhibernatepractice.bean.EmployeePrimaryInfo;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_bank_info")
public class EmployeeBankInfo implements Serializable {
	@Id
	private int empId;
	@Column
	private long accountNo;
	@Column
	private String bankName;
	@Column
	private String branchName;
	@Column
	private String ifscCode;

	@MapsId
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empId")
	private EmployeePrimaryInfo primary;

}
