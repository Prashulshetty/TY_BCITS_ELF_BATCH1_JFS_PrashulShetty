package com.bcits.hackerrank.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class ComparatorSolution1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of Players..");
		int num = Integer.parseInt(scanner.nextLine());

		Player[] arr = new Player[num];
		for (int i = 1; i <= num; i++) {
			System.out.println("Enter the " + i + "th Player name and score!");
			System.out.println("Enter the Player name  :");
			String name = scanner.nextLine();
			System.out.println("Enter the score : ");
			int score = Integer.parseInt(scanner.nextLine());
			arr[i-1] = new Player(name,score);
		}
		Arrays.sort(arr, new PlayerSort());
		for (Object obj : arr) {
			System.out.println(obj);
		}

		scanner.close();
	}

}
