package com.bcits.springrestjaxb.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.ElementCollection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonRootName;

import lombok.Data;
@Data
@XmlRootElement(name = "Employee-Info")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName("employeeInfo")
@JsonPropertyOrder({"employeeId","name"})
public class EmployeeBeanInfo implements Serializable {
@JsonProperty("employeeId")	
//@XmlElement(name="employee-id")
//@XmlAttribute(name="employee-id")
	private int empId;
@XmlElement
//@XmlAttribute
	private String name;
//@XmlTransient // to avoid binding
@XmlElement
	private long mobileNum;
@XmlElement
	private String maildId;
@XmlElement
	private Date birthDate;
@XmlElement
	private Date joiningDate;
@XmlElement
	private String designation;
@XmlElement
	private String bloodGroup;
@XmlElement
	private double salary;
@JsonProperty("departmentId")
//@XmlElement(name="dept-id")
	private int deptId;
@XmlElement
	private int mgrId;
// @XmlTransient // to avoid binding
@JsonIgnore
@XmlElement
	private String password;

}
