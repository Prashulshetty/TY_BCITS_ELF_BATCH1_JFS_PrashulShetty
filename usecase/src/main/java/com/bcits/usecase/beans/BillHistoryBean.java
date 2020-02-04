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
@Table(name = "bill_history")
public class BillHistoryBean implements Serializable {
	@EmbeddedId
	private BillHistoryPK history;
	private int billAmount;
	private String status;

}
