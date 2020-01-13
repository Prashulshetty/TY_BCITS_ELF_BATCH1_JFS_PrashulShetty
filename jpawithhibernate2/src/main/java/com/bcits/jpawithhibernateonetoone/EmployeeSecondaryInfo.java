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

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity
@Table(name="employee_secondary_info")
public class EmployeeSecondaryInfo implements Serializable {
	@Id
	private int emp_id ;
	@Column
	private String personal_mailid;
	@Column
	private String gender;
	@Column
	private int age ;
	@Column
	private String nationality ;
	@Column
	private String Ismarried ;
	@Column
	private String govid ;
	@Column
	private String guardian_name;
	@Column
	private long guardian_contact;
	@Column
	private String job_location;
	
	@MapsId
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private EmployeePrimaryInfo primary;
	
	/*
	 * public EmployeePrimaryInfo getPrimary() { return primary; } public void
	 * setPrimary(EmployeePrimaryInfo primary) { this.primary = primary; }
	 * 
	 * public int getEmp_id() { return emp_id; } public void setEmp_id(int emp_id) {
	 * this.emp_id = emp_id; } public String getPersonal_mailid() { return
	 * personal_mailid; } public void setPersonal_mailid(String personal_mailid) {
	 * this.personal_mailid = personal_mailid; }
	 * 
	 * public String getGender() { return gender; } public void setGender(String
	 * gender) { this.gender = gender; } public int getAge() { return age; } public
	 * void setAge(int age) { this.age = age; } public String getNationality() {
	 * return nationality; } public void setNationality(String nationality) {
	 * this.nationality = nationality; } public String getIsmarried() { return
	 * Ismarried; } public void setIsmarried(String ismarried) { Ismarried =
	 * ismarried; } public String getGovid() { return govid; } public void
	 * setGovid(String govid) { this.govid = govid; } public String
	 * getGuardian_name() { return guardian_name; } public void
	 * setGuardian_name(String guardian_name) { this.guardian_name = guardian_name;
	 * } public long getGuardian_contact() { return guardian_contact; } public void
	 * setGuardian_contact(long guardian_contact) { this.guardian_contact =
	 * guardian_contact; } public String getJob_location() { return job_location; }
	 * public void setJob_location(String job_location) { this.job_location =
	 * job_location; }
	 */
	
}
