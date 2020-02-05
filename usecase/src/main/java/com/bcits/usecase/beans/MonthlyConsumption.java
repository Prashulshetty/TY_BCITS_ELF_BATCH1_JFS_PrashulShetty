package com.bcits.usecase.beans;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="monthly_consumption")
public class MonthlyConsumption implements Serializable{
	@EmbeddedId
	private MonthlyConsumptionPK consumptionPk;
	@Column(name="previous_reading")
	private double previousReading;
	@Column(name="current_reading")
	private double currentReading;
	@Column
	private double units;
	@Column(name="bill_amount")
	private double billAmount; 
	@Column
	private String Status;
	
}