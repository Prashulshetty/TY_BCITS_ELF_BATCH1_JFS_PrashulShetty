package com.bcits.collection.treeset;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {


		TreeSet<Integer> h = new TreeSet<Integer>();      
		
		h.add(20);
		h.add(30);
		h.add(10);
		h.add(70);
		h.add(40);
		h.add(90);
		h.add(20);
		
		System.out.println(h);
		h.remove(70);
		System.out.println(h);
	}

}