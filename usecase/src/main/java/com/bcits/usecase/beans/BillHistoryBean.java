package com.bcits.usecase.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "bill_History")
public class BillHistoryBean implements Serializable {
	@EmbeddedId
	private BillHistoryPK monthlybill;
	@Column
	private double initialReading;
	@Column
	private double finalReading;
	@Column
	private int Units;
	@Column
	private int billAmount;
	@Column
	private String status;

}
