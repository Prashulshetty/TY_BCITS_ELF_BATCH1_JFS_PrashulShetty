package com.bcits.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterating {

	public static void main(String[] args) {
		ArrayList<Integer> c1 = new ArrayList<Integer>();
		c1.add(25);
		c1.add(50);
		c1.add(75);
		c1.add(100);
		System.out.println("....using for loop....");
		for (int i = 0; i < c1.size(); i++) {
			System.out.println(c1.get(i));
		}
		System.out.println("....using for each loop.....");
		for (Integer integer : c1) {
			System.out.println(integer);
			
		}
		
		System.out.println(".....using Iterator....");
		Iterator itr =c1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//c1.add(80);
		}
		
		System.out.println(".....using list iterator forward direction.....");
		ListIterator<Integer> itr1 =c1.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		

		System.out.println(".....using list iterator reverse direction.....");
		ListIterator<Integer> itr2 =c1.listIterator(c1.size());
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
		
		
		
	}

}
