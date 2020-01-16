package com.bcits.empwebapppractice.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
	@Entity
	@Table(name="employee_primary_info")
	public class EmployeePrimaryInfo implements Serializable {
		@Id
		@Column
		private int emp_id ;
		@Column
		private String emp_name;
		@Column
		private long emp_mobileno;
		@Column
		private String official_mailid;
		@Column
		private Date  date_of_birth ;
		@Column
		private Date date_of_join;
		@Column
		private String designation ;
		@Column
		private String blood_group ;
		@Column
		private double salary ;
		@Column
		private int dept_id ;
		@Column
		private int manager_id ;
}

