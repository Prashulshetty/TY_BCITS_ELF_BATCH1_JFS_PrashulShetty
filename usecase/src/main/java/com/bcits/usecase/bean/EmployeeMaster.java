package com.bcits.usecase.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EmployeeMaster")
public class EmployeeMaster implements Serializable {
	
	@Id
	@Column
	private int  empId;
	@Column
	private String name;
	@Column
	private String designation;
	@Column
	private String password;
}
