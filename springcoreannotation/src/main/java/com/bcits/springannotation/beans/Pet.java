package com.bcits.springannotation.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.bcits.springannotation.interface1.Animal;

import lombok.Data;
@Data
public class Pet {
	private String name;
	@Autowired
	private Animal animal;

}
