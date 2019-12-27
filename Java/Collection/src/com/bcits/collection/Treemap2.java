package com.bcits.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Treemap2 {

	public static void main(String[] args) {
		TreeMap<Integer,String> h1 = new TreeMap<Integer,String>();
		h1.put(25,"dinga");
		h1.put(272,"dingi");
		h1.put(296,"abhi");
		h1.put(21,"mahesh");
		h1.put(29,"ramesh");
		
		Set<Map.Entry<Integer,String>> s1 = h1.entrySet();
		for (Entry<Integer, String> entry : s1) {
			System.out.println(entry);
		}
	}

}
