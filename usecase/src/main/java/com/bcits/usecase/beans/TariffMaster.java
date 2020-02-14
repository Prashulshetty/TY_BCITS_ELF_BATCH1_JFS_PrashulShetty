package com.bcits.usecase.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="tarrif_master")
public class TariffMaster implements Serializable {
	@EmbeddedId
	private TariffPK tarriffpk;
	@Column
	private double amount;

} // end of TariffMaster
