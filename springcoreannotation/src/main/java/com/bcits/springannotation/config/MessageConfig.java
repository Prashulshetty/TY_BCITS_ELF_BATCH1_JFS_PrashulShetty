package com.bcits.springannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bcits.springannotation.beans.MessageBean;
import com.bcits.springcoreannotation.mypostprocessors.MyBeanFactoryPostProcessor;
import com.bcits.springcoreannotation.mypostprocessors.MyBeanProcessor;

@Configuration
public class MessageConfig {
	@Bean(name="messageBean")
	public MessageBean getMessageBean() {
		MessageBean messageBean =new MessageBean();
		messageBean.setMessage("welcome back to spring core"); 
		return messageBean ;
	}
	
	@Bean
public MyBeanProcessor getMyBPP( ) {
	return new MyBeanProcessor();
}
	@Bean
public MyBeanFactoryPostProcessor getMyFBPP( ) {
	return new MyBeanFactoryPostProcessor();
}
}
