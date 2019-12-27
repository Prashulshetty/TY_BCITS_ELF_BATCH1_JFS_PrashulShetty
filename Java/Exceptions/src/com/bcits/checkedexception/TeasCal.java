package com.bcits.checkedexception;

public class TeasCal {

	public static void main(String[] args) { 
		System.out.println("main started");
		Calculator1 c = new Calculator1();
		c.division(100, 0);
		System.out.println("main ended");

	}

}
