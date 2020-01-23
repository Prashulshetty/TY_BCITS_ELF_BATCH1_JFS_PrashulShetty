package com.bcits.springannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.bcits.springannotation.beans.Pet;


@Import(AnimalConfig.class)
@Configuration
public class PetConfig {

	@Bean
	public Pet getPet( ) {
		Pet myPet = new Pet();
		myPet .setName("Ricky");
		return myPet;
	}
	
}
