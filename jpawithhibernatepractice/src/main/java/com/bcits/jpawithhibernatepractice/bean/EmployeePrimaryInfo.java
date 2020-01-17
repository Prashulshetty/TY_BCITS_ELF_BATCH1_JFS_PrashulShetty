

package com.bcits.jpawithhibernatepractice.bean;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import com.bcits.jpawithhibernatepractice.EducationInfo;
import com.bcits.jpawithhibernatepractice.EmployeeAddressInfo;
import com.bcits.jpawithhibernatepractice.EmployeeAddressPK;
import com.bcits.jpawithhibernatepractice.EmployeeBankInfo;
import com.bcits.jpawithhibernatepractice.EmployeeSecondaryInfo;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "employee_primary_info")
public class EmployeePrimaryInfo implements Serializable {
	@Id
	@Column
	private int empId;
	@Column
	private String name;
	@Column
	private long mobileNo;
	@Column
	private String maildId;
	@Column
	private Date birthDate;
	@Column
	private Date joiningDate;
	@Column
	private String designation;
	@Column
	private String bloodGroup;
	@Column
	private double salary;
	@Column
	private int deptId;
	@Column
	private int mgrId;

	@Exclude
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "primaryInfo") // bidirectional SecondaryInfo
	private EmployeeSecondaryInfo secondaryInfo;

	@Exclude
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "primary") // bidirectional EmployeeBankInfo
	private EmployeeBankInfo bankInfo;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "primaryInfo")
	private List<EducationInfo>  educationInfo;
	
	@Exclude
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "primaryInfo")
	private List<EmployeeAddressInfo> address;
}
