package com.bcits.usecase.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import lombok.Data;
@Data
@Entity
@Table(name="admin")
public class AdminBean implements Serializable {	
	@Id
	@Column
	private int  adminId;
	@Column
	private String name;
	@Column
	private String password;
	
}
