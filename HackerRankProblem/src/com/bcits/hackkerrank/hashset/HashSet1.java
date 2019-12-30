package com.bcits.hackkerrank.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HashSet1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number of pairs...");
		int n = Integer.parseInt(sc.nextLine());
		HashSet<String> h = new HashSet<String>(n);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the " +i + " pair datails" );
			System.out.println("Enter the 1 st name :");
           String n1 =sc.nextLine();
           System.out.println("Enter the 2 st name :");
           String n2 =sc.nextLine();
           String name = n1 +" " + n2;
            h.add(name);
            list.add(h.size());
		}
            System.out.println("number of unique pairs..");
		for (int num : list) {
		  System.out.println(num);
	}
	}
}
