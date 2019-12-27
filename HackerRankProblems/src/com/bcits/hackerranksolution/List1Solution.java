package com.bcits.hackerranksolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List1Solution {
	
    static Scanner sc =new Scanner(System.in);
    static List<Integer> list = null;
	public static void main(String[] args) {
     System.out.println("Enter the number of elements...");
     int n = Integer.parseInt(sc.nextLine());
     list = new ArrayList<Integer>(n);
      for (int i = 1; i <= n; i++) {
    	  System.out.println("Enter the element for " +(i-1) +" index");
    	  list.add((i-1),Integer.parseInt(sc.nextLine()));
      }
      System.out.println(list.toString());
		
      System.out.println("Enter the number of queries..");
		int q = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= q; i++) {
			System.out.println("select insert / delete.... ");
			String query =sc.nextLine();
			if (query.equalsIgnoreCase("INSERT")) {
				System.out.println("Enter the index ...");
				int x = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the value ...");
				int y = Integer.parseInt(sc.nextLine());
				list.add(x, y);	
				n++;
				System.out.println(list);
			} else if (query.equalsIgnoreCase("delete")) {
				System.out.println("Enter the index ...");
				int x = Integer.parseInt(sc.nextLine());
				list.remove(x);
				n--;
				System.out.println(list);	
			} else {
				System.err.println("Enter valid option");
			}
			
		}
		System.out.println(list);
	}

}


