package com.bcits.manytomany;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.bcits.jpawithhibernate2app.bean.EmployeePrimaryInfo;

import lombok.Data;

@Entity
@Data
@Table(name="project_info")
public class ProjectInfo implements Serializable{
	@Id
	@Column
 private int project_id ;
	@Column
 private String project_name;
	@Column
 private String technology;
	@Column
 private Date start_date;
	@Column
 private Date end_date;
	@Column
 private String  location;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="employee_project_info",joinColumns = @JoinColumn(name="project_id"),inverseJoinColumns=@JoinColumn(name="emp_id"))
	private List<EmployeePrimaryInfo> primary;
	
}
