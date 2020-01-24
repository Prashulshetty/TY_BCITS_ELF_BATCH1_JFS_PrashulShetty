package com.bcits.springcoreannotation.mypostprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanProcessor implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before init-phase");
		return bean;
	}
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After init-phase");
		return bean;
	}

}
