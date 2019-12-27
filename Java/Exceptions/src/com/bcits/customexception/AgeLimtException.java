package com.bcits.customexception;

public class AgeLimtException extends RuntimeException {
	String msg ="Age is less thna 18";

	public AgeLimtException() {
		super();
	}

	public AgeLimtException(String msg) {
		super();
		this.msg = msg;
	}
	public  String getmsg() {
		 return this.msg;
	 }
	

}
