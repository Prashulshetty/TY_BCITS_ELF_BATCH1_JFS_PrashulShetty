package com.bcits.customcheckedexception;

public class Sbi {
	public static void main(String[] args) {
		System.out.println("main started ");
		Atm  a1= new Atm();
		try {
			a1.withdraw(41000);
		} catch (InsufficientBalance a) {
		System.out.println(a.getMessage());
		}
	}

}
