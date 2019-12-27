package com.bcits.customcheckedexception;

public class InsufficientBalance extends Exception {
	String msg = "Insufficient  Balance" ;
	InsufficientBalance() {
		
	}
	InsufficientBalance(String  msg) {
		this.msg=msg;
	}                                              
	public String getMessage() 
	{
		return  this.msg;
	}

}
