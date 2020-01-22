package com.bcits.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bcits.beans.MessageBean;

public class MessageTest {
	
	
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		//close the container  automatically before program ends
		((ConfigurableApplicationContext)context).registerShutdownHook();
		MessageBean messageBean = (MessageBean)context.getBean("message");
		System.out.println(messageBean.getMessage());
		
		//((AbstractApplicationContext)context).close();//close context or spring container
		MessageBean messageBean2 = (MessageBean)context.getBean("message");
		System.out.println(messageBean.getMessage());
	}
	
	

}
