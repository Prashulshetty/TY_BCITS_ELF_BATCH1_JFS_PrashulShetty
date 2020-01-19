package com.bcits.tarifflogic;

public class BillCalculation {
	static double billAmount = 0;
	public static double residential(long initial, long current) {
		long units = current - initial;
		if (units < 100) {
			billAmount = units * 4;
		} else if (units < 200) {
			billAmount = (100 * 4) + ((units - 100) * 5);
		} else if (units > 200) {
			billAmount = (100 * 4) + (100 * 5) + ((units - 200) * 8);
		}
		return billAmount;
	}

	public static double commercial(long initial, long current) {
		long units = current - initial;
		if (units < 1000) {
			billAmount = units * 10;
		} else if (units < 2000) {
			billAmount = (1000 * 10) + ((units - 1000) * 15);
		} else if (units > 2000) {
			billAmount = (1000 * 10) + (1000 * 15) + ((units - 2000) * 18);
		}
		return billAmount;
	}

	public static double industry(long initial, long current) {
		long units = current - initial;

		if (units < 10000) {
			billAmount = units * 15;
		} else if (units < 20000) {
			billAmount = (10000 * 15) + ((units - 10000) * 20);
		} else if (units > 20000) {
			billAmount = (10000 * 15) + (10000 * 20) + ((units - 20000) * 25);
		}
		return billAmount;
	}

}
