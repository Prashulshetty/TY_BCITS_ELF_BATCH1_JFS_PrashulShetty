package com.bcits.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		h.add(20);
		h.add(30);
		h.add(10);
		h.add(70);
		h.add(40); 
		h.add(90);
		h.add(20);
		h.add(null);
		h.add(null);
		System.out.println(h);
		h.remove(70);
		System.out.println(h);
	}

}
