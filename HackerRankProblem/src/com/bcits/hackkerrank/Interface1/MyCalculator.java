package com.bcits.hackkerrank.Interface1;


class MyCalculator implements AdvancedArithmetic {
	public int divisor_sum(int n) {
		int sum = 0, i = 1;
		while (n != 0 && i <= n) {
			if (n % i == 0) {
				sum += i;
			}
			i++;
		}
		return sum;
	}
}