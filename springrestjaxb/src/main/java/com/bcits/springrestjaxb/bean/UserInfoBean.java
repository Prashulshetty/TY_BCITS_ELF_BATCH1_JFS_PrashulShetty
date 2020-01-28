package com.bcits.springrestjaxb.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonRootName;

import lombok.Data;
@Data
@JsonRootName("userInfo")
@JsonPropertyOrder({"userId","userName"})
@XmlRootElement(name = "User-Info")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserInfoBean implements Serializable {
@JsonProperty("userId")	
//@XmlElement(name="user-id")
//@XmlAttribute(name="user-id")
	private int empId;
//@XmlElement
//@XmlAttribute
@JsonProperty("userName")
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
@XmlElement(name="dept-id")
	private int deptId;
@XmlElement
	private int mgrId;
// @XmlTransient // to avoid binding
//@XmlElement
@JsonIgnore
	private String password;
@XmlElement(name="user-other-info")
private UserOtherInfoBean userOtherInfoBean;
@XmlElementWrapper(name="user-addresses-list")
 private List<UserAddressBean> userAddressList;
}
