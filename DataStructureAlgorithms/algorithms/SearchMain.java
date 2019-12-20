package com.ty.bcits.algorithms;

import java.util.Scanner;

public class SearchMain {
	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
	System.out.println("enter the size of Array : ");
	int size =s.nextInt();
	int[] a = RandomArray.array(size);
	ArrayDisplay.display(a);
	System.out.println("\n\nEnter the array element to search : ");
	int num =s.nextInt();
	Durations.linearSearchduration(a, num);
	System.out.println();
	Durations.BinarySearchduration(a, num);
	}
}
