package com.bcits.customcheckedexception;

public class Atm {
	int bal =40000;
	void withdraw(int amount) throws InsufficientBalance {
		if (amount <= bal) {
			System.out.println("withdraw success");
		} else {
			throw new InsufficientBalance();
		}
	}

}
