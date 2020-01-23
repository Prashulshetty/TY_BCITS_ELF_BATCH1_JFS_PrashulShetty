package com.bcits.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public  class MessageBean implements InitializingBean, DisposableBean {
	
	private String message;
	
	public  MessageBean() {                                
		   System.out.println("It is instantiation phase");
	   }
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	//
	/*
	 * public void init() { System.out.println("It is initialization phase"); }
	 * public void destroy() { System.out.println("It is destroy phase"); }
	 */
	public void destroy() throws Exception {
		   System.out.println("It is destroy phase");
		
	}
	public void afterPropertiesSet() throws Exception {
		   System.out.println("It is initiallization phase");
		
	}
}
