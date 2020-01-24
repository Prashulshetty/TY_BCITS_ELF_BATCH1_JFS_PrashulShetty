package com.bcits.springcoreannotation.mypostprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Inside my bean factory post proscessor");
		BeanDefinition  beanDefinition = beanFactory.getBeanDefinition("messageBean");
		MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
		 propertyValues.add("message","value fom MBFPOP");
		
	}

}
