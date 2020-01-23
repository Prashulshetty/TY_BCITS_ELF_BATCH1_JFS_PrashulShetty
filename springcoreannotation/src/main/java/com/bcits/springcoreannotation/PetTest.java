package com.bcits.springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bcits.springannotation.beans.Pet;
import com.bcits.springannotation.config.PetConfig;



public class PetTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PetConfig.class);
		Pet myPet =context.getBean(Pet.class);
		 System.out.println("Pet name =" + myPet.getName());
		 myPet.getAnimal().speak();
		 myPet.getAnimal().eat();
	}

}
