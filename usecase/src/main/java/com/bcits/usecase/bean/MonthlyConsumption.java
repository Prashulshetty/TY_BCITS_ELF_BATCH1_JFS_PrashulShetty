package com.bcits.usecase.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = " MonthlyConsumption")
public class MonthlyConsumption implements Serializable {
	@Id
	@Column
	private int rrNumber;
	@Column
	private long initialReading;
	@Column
	private long finalReading;
	@Column
	private int Units;
	@Column
	private int billAmount;
	@Column
	private String status;

}
