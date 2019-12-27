package com.bcits.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<Integer>();
		c1.add(34);
		c1.add(78);
		System.out.println(c1);
		c1.remove(34);
		System.out.println(c1);
		System.out.println(c1.isEmpty());
		System.out.println(c1.size());
		System.out.println(c1.contains(78));
		
	}
}
