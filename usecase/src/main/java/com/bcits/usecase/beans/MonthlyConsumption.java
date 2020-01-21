package com.bcits.usecase.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = " monthly_consumption")
public class MonthlyConsumption implements Serializable {
	@EmbeddedId
	private MonthlyConsumptionPK monthlyConsume; 
	
	@Column
	private int units;
	@Column
	private int billAmount;
	@Column
	private String status;

}
