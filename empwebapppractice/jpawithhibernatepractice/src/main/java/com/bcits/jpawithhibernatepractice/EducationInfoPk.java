package com.bcits.jpawithhibernatepractice;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class EducationInfoPk implements Serializable{
	private int empId;
	private String educationType;
}
