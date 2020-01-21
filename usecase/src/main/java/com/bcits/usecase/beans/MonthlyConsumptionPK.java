package com.bcits.usecase.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;

import lombok.Data;

@Data
@Embeddable
public class MonthlyConsumptionPK implements Serializable {
	
	private String region;
	private int rrNumber;
	
}
