package com.bcits.usecase.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class QueryMsgBeanPK implements Serializable {
	private String rrNumber;
	private Date date;

} // end of QueryMsgBeanPK
