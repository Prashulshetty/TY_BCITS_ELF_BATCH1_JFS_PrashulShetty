package com.bcits.springannotation.beans;

import com.bcits.springannotation.interface1.Animal;

public class Elephant implements Animal {

	public void eat() {
		System.out.println("Eating kabab..");
	}

	public void speak() {
		System.out.println("bow bow");
		
	}

}
