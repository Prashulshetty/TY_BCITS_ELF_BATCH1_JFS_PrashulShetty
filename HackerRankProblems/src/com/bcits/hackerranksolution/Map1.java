package com.bcits.hackerranksolution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Map1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number of contacts...");
		int n = Integer.parseInt(sc.nextLine());
		HashMap<String,Integer> hash_map = new HashMap< String,Integer>(n);
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the name..");
			String name = sc.nextLine();
			System.out.println("Enter the number");
			int number = Integer.parseInt(sc.nextLine());
			hash_map.put( name,number);
		}
		System.out.println(hash_map);
		
		System.out.println("enter  the number of queries...");
		int q = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= q; i++) {
			System.out.println("Enter the name of the  person: ");
			String name = sc.nextLine();
			Integer number = hash_map.get(name);

			if (number != null) {
				System.out.println(name + " = " +  number);
			} else {
			System.out.println("not found");
			}
		}
	}
}
