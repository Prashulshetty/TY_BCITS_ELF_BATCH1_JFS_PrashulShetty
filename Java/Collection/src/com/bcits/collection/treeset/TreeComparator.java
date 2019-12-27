package com.bcits.collection.treeset;

import java.util.Comparator;

public class TreeComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return  o1.nmae.compareTo(o2.nmae);
		
		
	}

}
