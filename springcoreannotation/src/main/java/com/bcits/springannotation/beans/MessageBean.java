package com.bcits.springannotation.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;

@Data
/*public class MessageBean {
	private String message;
}
*/
public class MessageBean implements InitializingBean,DisposableBean {
	private String message;
	public MessageBean() {
		System.out.println("Instantiation phase");
	}

	public void destroy() throws Exception {
		System.out.println("destroy");
		
	}

	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Initialization");
	}
}
