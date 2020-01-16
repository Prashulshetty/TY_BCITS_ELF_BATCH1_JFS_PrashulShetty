package com.bcits.empwebapp.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_primary_info")
public class EmployeePrimaryInfo implements Serializable {
	@Id
	@Column
	private int emp_id;
	@Column
	private String emp_name;
	@Column
	private long emp_mobile_no;
	@Column
	private String official_mail_id;
	@Column
	private Date date_of_birth;
	@Column
	private Date date_of_join;
	@Column
	private String designation;
	@Column
	private String blood_group;
	@Column
	private double salary;
	@Column
	private int dept_id;
	@Column
	private int manager_id;
	@Column
	private String password;
	
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public long getEmp_mobileno() {
		return emp_mobile_no;
	}

	public void setEmp_mobileno(long emp_mobileno) {
		this.emp_mobile_no = emp_mobileno;
	}

	public String getOfficial_mailid() {
		return official_mail_id;
	}

	public void setOfficial_mailid(String official_mailid) {
		this.official_mail_id = official_mailid;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public Date getDate_of_join() {
		return date_of_join;
	}

	public void setDate_of_join(Date date_of_join) {
		this.date_of_join = date_of_join;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
