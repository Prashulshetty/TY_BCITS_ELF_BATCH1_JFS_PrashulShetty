package com.bcits.collection.stream;

import java.awt.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {
		 ArrayList<Integer> a = new  ArrayList<Integer>();
		 a.add(101);
		 a.add(200);
		 a.add(301);
		 a.add(400);
		 a.add(500);
		 a.add(601);
		 java.util.List<Integer> l2 = a.stream().map(i-> i*2).collect(Collectors.toList());
		 System.out.println(l2);
		 System.out.println("...............");
		 
		 java.util.List<Integer> l1 = a.stream().filter(i-> i%2==0).collect(Collectors.toList());
		 System.out.println(l1);

	}

}
