package com.bcits.collection.list;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

public class List1 {

	public static void main(String[] args) {
	ArrayList<Integer> c1 = new ArrayList<Integer>();
	System.out.println("...........adding two elements.....");
		c1.add(12);
		c1.add(45);
		System.out.println(c1);
		System.out.println("....adding to particular index.....");
		c1.add(1,36);
		
		System.out.println(c1);
		System.out.println("....remove at index..");
		c1.remove(1);
		System.out.println(c1);
		
		System.out.println("....adding element..");
		c1.add(12);
		System.out.println(c1);
		System.out.println("...update value... ");
		c1.set(1,36);
		System.out.println(c1);
		
		
		System.out.println(c1.indexOf(12));
		System.out.println(c1.lastIndexOf(12));
		
		for (int i = 0; i < c1.size(); i++) {
			System.out.println(c1.get(i));
			
		}
		c1.remove(new Integer(12));
		System.out.println(c1);
		
		c1.add(1, 100);
		c1.add(200);
		System.out.println(c1);
		System.out.println("sub");
		//c1.subList(1, 3);
		System.out.println(c1.subList(1, 3));
		/*
		 * List l = (List) c1.subList(1, 2); for (int i = 0; i < c1.size(); i++) {
		 * System.out.println(c1.get(i));
		 * 
		 * 
		 * }
		 */
	}

}
