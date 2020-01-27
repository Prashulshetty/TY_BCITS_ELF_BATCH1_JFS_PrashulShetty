package com.bcits.springrest.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;
@Data
@Entity
@Table(name = "employee_primary_info")
public class EmployeeInfoBean implements Serializable {
	@Id
	@Column(name = "emp_id")
	private Integer empId;
	@Column
	private String name;
	@Column(name = "mobile")
	private Long mobileNum;
	@Column(name = "official_maildid")
	private String maildId;
	@Column(name = "date_of_birth")
	/* @DateTimeFormat(iso = ISO.DATE) */
	private Date birthDate;
	@Column(name = "date_of_joining")
	private Date joiningDate;
	@Column
	private String designation;
	@Column(name = "blood_group")
	private String bloodGroup;
	@Column
	private Double salary;
	@Column(name = "dept_id")
	private Integer deptId;
	@Column(name = "mgr_id")
	private Integer mgrId;
	@Column
	private String password;

}
