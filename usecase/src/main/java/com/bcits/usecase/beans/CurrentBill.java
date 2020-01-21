package com.bcits.usecase.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "current_bill")
public class CurrentBill implements Serializable {
    @Id
    @Column
	private int rrNumber;
    @Column
	private double initialReading;
    @Column
	private double finalReading;
    @Column
  	private int Units;
    @Column
	private double billAmount;
    @Column
    private Date Date;
    @Column
    private Date dueDate;
}
