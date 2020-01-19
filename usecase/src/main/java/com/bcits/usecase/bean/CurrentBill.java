package com.bcits.usecase.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CurrentBill")
public class CurrentBill implements Serializable {
    @Id
    @Column
	private int rrNumber;
    @Column
	private int Units;
    @Column
	private long initialReading;
    @Column
	private long finalReading;
    @Column
	private double billAmount;
    @Column
    private Date generatedDate;
    @Column
    private Date dueDate;
}
