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
@Table(name = "employee_secondary_info")
public class EmployeeSecondaryInfo implements Serializable {
	@Id
	private int empId;
	@Column
	private String gender;
	@Column
	private String personalEmailId;
	@Column
	private int age;
	@Column
	private String nationality;
	@Column
	private String isMarried;
	@Column
	private String govtId;
	@Column
	private String guardianNname;
	@Column
	private long guardianContact;
	@Column
	private String jobLocation;

	@MapsId
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="empId")
	private EmployeePrimaryInfo primaryInfo;

	

}
