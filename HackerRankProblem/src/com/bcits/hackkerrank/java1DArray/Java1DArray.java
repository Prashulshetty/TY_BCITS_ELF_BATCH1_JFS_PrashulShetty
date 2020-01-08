package com.bcits.hackkerrank.java1DArray;

import java.util.Scanner;

public class Java1DArray {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = scan.nextInt();

		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();

		}
		scan.close();

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
