package com.bcits.hackkerrank.java2DArray;

import java.util.Scanner;

public class Java2DArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[][] = new int[6][6];
		System.out.println("Enter the elements.");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.println(arr[i][j]);
			}
		}
		int maxsum = 0;
		int sum = 0;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if ((i + 2 < 6) && (j + 2) < 6) {
					sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
							+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
					if (sum > maxsum) {
						maxsum = sum;
					}
				}
			}

		}
		System.out.println(maxsum);
	}
}
