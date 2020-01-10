package com.bcits.hackerrank.Interface1;

import java.util.Scanner;


public class Interface1 {
	public static void main(String[] args) {
		MyCalculator my_calculator = new MyCalculator();
		System.out.print("I implemented: ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number= ");
		int n = sc.nextInt();
		System.out.print(my_calculator.divisor_sum(n) + "\n");
		sc.close();
	}

	
}
