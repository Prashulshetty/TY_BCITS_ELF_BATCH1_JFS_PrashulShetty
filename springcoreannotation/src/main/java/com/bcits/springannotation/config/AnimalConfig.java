package com.bcits.springannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bcits.springannotation.beans.Elephant;
import com.bcits.springannotation.beans.Goat;

@Configuration
public class AnimalConfig {
	@Bean
	public Goat getAnimal() {
		return new Goat();
		
	}
	@Bean
	@Primary
	public Elephant getElephant() {
		return new Elephant();
	}

}
