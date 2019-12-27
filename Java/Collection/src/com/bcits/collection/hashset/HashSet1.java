package com.bcits.collection.hashset;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(20);
		h.add(30);
		h.add(10);
		h.add(70);
		h.add(40);
		h.add(90);
		h.add(20);
		h.add(null);
		System.out.println(h);
		h.remove(70);
		System.out.println(h);
		
	}

}
