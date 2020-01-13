package com.bcits.jpawithhibernateonetoone;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bcits.jpawithhibernate2app.bean.EmployeePrimaryInfo;
@Entity
@Table(name="employee_bank_info ")
public class EmployeeBankInfo implements Serializable {
	@Id
	private int emp_id ; 
	@Column
	private int Account_no;
	@Column
	private String	bank_name ;
	@Column
	private	 String branch_name ;
	@Column
	private	String IFSC_code;
	
	@MapsId
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private EmployeePrimaryInfo primary;
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getAccount_no() {
		return Account_no;
	}
	public void setAccount_no(int account_no) {
		Account_no = account_no;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getIFSC_code() {
		return IFSC_code;
	}
	public void setIFSC_code(String iFSC_code) {
		IFSC_code = iFSC_code;
	}
	public EmployeePrimaryInfo getPrimary() {
		return primary;
	}
	public void setPrimary(EmployeePrimaryInfo primary) {
		this.primary = primary;
	}
			

}
