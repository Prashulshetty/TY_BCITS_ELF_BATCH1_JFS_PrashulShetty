package com.bcits.springrest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class EntityManagerFactoryConfig {
	
	
	  @Bean public LocalEntityManagerFactoryBean getEntityManager() {
	  LocalEntityManagerFactoryBean factoryBean = new
	  LocalEntityManagerFactoryBean();
	  factoryBean.setPersistenceUnitName("emsPeristenceUnit"); return factoryBean;
	  }
	 
	 
	/*
	 * @Bean public LocalContainerEntityManagerFactoryBean getEntityManager() {
	 * LocalContainerEntityManagerFactoryBean factoryBean = new
	 * LocalContainerEntityManagerFactoryBean();
	 * factoryBean.setPersistenceUnitName("emsPeristenceUnit"); return factoryBean;
	 * }
	 */
}
