package com.bcits.exception;

public class LoginPage {
	public void login(String user,long password) throws  CustomException {
		if((user.contentEquals("prashul")) && (password==333222)) {
			System.out.println("login success....");
		} else { 
			throw new CustomException("login failed..");
		}
    }
}