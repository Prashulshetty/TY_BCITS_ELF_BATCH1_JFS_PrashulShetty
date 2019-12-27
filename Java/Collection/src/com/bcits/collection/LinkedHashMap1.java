
package com.bcits.collection;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class LinkedHashMap1 {


	public static void main(String[] args) {
		LinkedHashMap<Integer,String> h1 = new LinkedHashMap<Integer,String>();
		h1.put(25,"dinga");
		h1.put(272,"dingi");
		h1.put(296,"abhi");
		h1.put(21,"mahesh");
		h1.put(29,"ramesh");
		
		Set<Map.Entry<Integer,String>> s1 = h1.entrySet();
		for (Entry<Integer, String> entry : s1) {
			System.out.println(entry);
		}
		System.out.println("...........................................");
		
		Set<Integer> s2 =h1.keySet();
		for (Integer integer : s2) {
			System.out.println(integer);
		}
		System.out.println("...........................................");
		Collection<String> c1 = h1.values();
		for ( String string : c1) {
			System.out.println(string);
		}
		
	}

}
