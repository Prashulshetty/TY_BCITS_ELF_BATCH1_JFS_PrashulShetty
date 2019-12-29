package com.bcits.javaapp.bsaic;

import com.bcits.calculator.basic.BasicCalculator;

public class JavaApp {

	public static void main(String[] args) {
		BasicCalculator cal = new BasicCalculator();
		int sum = cal.add(10, 20);
		System.out.println("sum == " + sum);

	}// end of main

}// end of class
