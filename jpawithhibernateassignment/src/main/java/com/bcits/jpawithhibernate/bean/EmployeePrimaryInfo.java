package com.bcits.jpawithhibernate.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bcits.jpawithhibernateassignment.EmployeeBankInfo;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "employee_primary_info")
public class EmployeePrimaryInfo implements Serializable {
	@Id
	@Column(name = "emp_id")
	private int empId;
	@Column(name = "emp_name")
	String empName;
	@Column(name = "emp_mobileno")
	private long empMobileno;
	@Column(name = "official_mailid")
	private String officialMailid;
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	@Column(name = "date_of_join")
	private Date dateOfJoin;
	@Column(name = "designation")
	private String designation;
	@Column(name = "blood_group")
	private String bloodGroup;
	@Column(name = "salary")
	private double salary;
	@Column(name = "dept_id")
	private int deptId;
	@Column(name = "manager_id")
	private int managerId;

	
	/*
	 * @Exclude
	 * 
	 * @OneToOne(cascade = CascadeType.ALL, mappedBy = "primary") private
	 * EmployeeBankInfo bankinfo;
	 */
	 
}