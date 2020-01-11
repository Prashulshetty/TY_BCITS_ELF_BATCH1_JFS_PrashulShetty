package com.bcits.hibernatepractice.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="department_info")
public class DepartmentInfo implements Serializable {
	@Id
	@Column
	private int dept_id;
	@Column
	private String dept_name;
	@Column
	private int dept_managerid;
	public int getDept_id() {
		return dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public int getDept_managerid() {
		return dept_managerid;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public void setDept_managerid(int dept_managerid) {
		this.dept_managerid = dept_managerid;
	}

}
