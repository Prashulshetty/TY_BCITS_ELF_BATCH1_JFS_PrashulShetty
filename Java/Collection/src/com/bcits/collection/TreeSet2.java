package com.bcits.collection;

import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet<Person> t = new TreeSet<Person>(new TreeComparator()); 
	
		t.add(new Person(20,"Ashin"));
		t.add(new Person(24,"Bharat"));
		t.add(new Person(22,"Dinga"));
		System.out.println(t);


	}

}
