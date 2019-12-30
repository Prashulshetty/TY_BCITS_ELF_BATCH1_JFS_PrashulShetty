package com.bcits.hackkerrank.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines....");
		int n = scanner.nextInt();
		ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<ArrayList<Integer>>(n);
		ArrayList<Integer> arrayList =null;
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the number of digits in line " +i);
			int d = scanner.nextInt();
			 arrayList = new ArrayList<Integer>(d) ;
			 arrayList.add(0,d);
			
			for (int j = 1; j <= d; j++) {
				System.out.println("Enter the element of " +j + " position");
				 arrayList.add(j,scanner.nextInt());
			}
				 
				 System.out.println(arrayList.toString());
				 arrayLists.add(arrayList);
			
		}
		 System.out.println(arrayLists.toString());
		
		
		System.out.println("Enter the number of queries..");
		int q =scanner.nextInt();
		for(int i=1 ;i<=q;i++) {
		System.out.println("Enter the line number...");
		int x =scanner.nextInt();
		System.out.println("Enter the  position...");
		int y =scanner.nextInt();
		try {
		System.out.println(arrayLists.get(x-1).get(y-1));
		} catch (Exception e) {
			System.err.println("Error.......please enter valid position...... ");
		}
		}
	}

}
