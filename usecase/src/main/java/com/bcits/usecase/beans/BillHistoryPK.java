package com.bcits.usecase.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

import lombok.Data;


@Data
@Embeddable
public class BillHistoryPK implements Serializable {
	private int rrNumber;
	private Date Date;
}