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
@Table(name = " Payment_Details ")
public class PaymentDetailsBean  implements Serializable {
	
	@Id
	@Column
	private String rrNumber;
	@Column
	private int billAmount;
	@Column
	private String status;

}