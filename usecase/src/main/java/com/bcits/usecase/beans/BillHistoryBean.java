package com.bcits.usecase.beans;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "bill_history")
public class BillHistoryBean implements Serializable {
	@EmbeddedId
	private BillHistoryPK history;
	private double billAmount;
	private String status;

} // end of BillHistoryBean
