package com.bcits.uncheckedexception;

public class TestCalculator {

	public static void main(String[] args) {
		System.out.println("main started");
		Calculator c = new Calculator();
		c.division(100, 5);
		c.division(100, 0);
		c.division(20, 5);
		c.division(100, 20);
		System.out.println("main ended");
		
	}

}
